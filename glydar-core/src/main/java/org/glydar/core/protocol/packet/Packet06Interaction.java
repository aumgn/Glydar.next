package org.glydar.core.protocol.packet;

import io.netty.buffer.ByteBuf;

import org.glydar.api.model.geom.IntVector2;
import org.glydar.api.model.item.Item;
import org.glydar.core.protocol.Packet;
import org.glydar.core.protocol.PacketType;
import org.glydar.core.protocol.ProtocolHandler;
import org.glydar.core.protocol.Remote;
import org.glydar.core.protocol.RemoteType;
import org.glydar.core.protocol.codec.GeomCodec;
import org.glydar.core.protocol.codec.ItemCodec;

/* Structures and data discovered by cuwo (http://github.com/matpow2) */
public class Packet06Interaction implements Packet {

    private final Item item;
    private final IntVector2 chunkPosition;
    private final int itemIndex; // Index of item in ChunkItems
    private final long something4; // uint
    private final byte interactType; // TODO ENUM
    private final byte something6;
    private final int something7; // ushort

    public Packet06Interaction(ByteBuf buf) {
        item = ItemCodec.readItem(buf);
        chunkPosition = GeomCodec.readIntVector2(buf);
        itemIndex = buf.readInt();
        something4 = buf.readUnsignedInt();
        interactType = buf.readByte();
        something6 = buf.readByte();
        something7 = buf.readUnsignedShort();
    }

    @Override
    public PacketType getPacketType() {
        return PacketType.INTERACTION;
    }

    @Override
    public void writeTo(RemoteType receiver, ByteBuf buf) {
        ItemCodec.writeItem(buf, item);
        GeomCodec.writeIntVector2(buf, chunkPosition);
        buf.writeInt(itemIndex);
        buf.writeInt((int) something4);
        buf.writeByte(interactType);
        buf.writeByte(something6);
        buf.writeShort(something7);
    }

    @Override
    public <T extends Remote> void dispatchTo(ProtocolHandler<T> handler, T remote) {
        handler.handle(remote, this);
    }

    public Item getItem() {
        return item;
    }

    public IntVector2 getChunkPosition() {
        return chunkPosition;
    }

    public int getItemIndex() {
        return itemIndex;
    }

    public long getSomething4() {
        return something4;
    }

    public int getInteractType() {
        return interactType;
    }

    public byte getSomething6() {
        return something6;
    }

    public int getSomething7() {
        return something7;
    }
}
