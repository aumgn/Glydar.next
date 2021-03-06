package org.glydar.paraglydar.data;

import java.util.BitSet;

import org.glydar.paraglydar.geom.FloatVector3;
import org.glydar.paraglydar.geom.LongVector3;
import org.glydar.paraglydar.geom.Orientation;

public interface EntityData {

	public long getId();

	public void setId(long id);

	public BitSet getBitSet();

	public LongVector3 getPosition();

	public void setPosition(LongVector3 pos);

	public Orientation getOrientation();

	public void setOrientation(Orientation orientation);

	public FloatVector3 getVelocity();

	public void setVelocity(FloatVector3 velocity);

	public FloatVector3 getAccel();

	public void setAccel(FloatVector3 accel);

	public FloatVector3 getExtraVel();

	public void setExtraVel(FloatVector3 extraVel);

	public float getLookPitch();

	public void setLookPitch(float lookPitch);

	public long getPhysicsFlags();

	public void setPhysicsFlags(long physicsFlags);

	public byte getHostileType();

	public void setHostileType(byte hostileType);

	public long getEntityType();

	public void setEntityType(long entityType);

	public byte getCurrentMode();

	public void setCurrentMode(byte currentMode);

	public long getLastShootTime();

	public void setLastShootTime(long lastShootTime);

	public long getHitCounter();

	public void setHitCounter(long hitCounter);

	public long getLastHitTime();

	public void setLastHitTime(long lastHitTime);

	public Appearance getApp();

	public void setApp(Appearance app);

	public byte getFlags1();

	public void setFlags1(byte flags1);

	public byte getFlags2();

	public void setFlags2(byte flags2);

	public long getRollTime();

	public void setRollTime(long rollTime);

	public int getStunTime();

	public void setStunTime(int stunTime);

	public long getSlowedTime();

	public void setSlowedTime(long slowedTime);

	public long getMakeBlueTime();

	public void setMakeBlueTime(long makeBlueTime);

	public long getSpeedUpTime();

	public void setSpeedUpTime(long speedUpTime);

	public float getSlowPatchTime();

	public void setSlowPatchTime(float slowPatchTime);

	public byte getClassType();

	public void setClassType(byte classType);

	public byte getSpecialization();

	public void setSpecialization(byte specialization);

	public float getChargedMP();

	public void setChargedMP(float chargedMP);

	public FloatVector3 getRayHit();

	public void setRayHit(FloatVector3 rayHit);

	public float getHP();

	public void setHP(float hP);

	public float getMP();

	public void setMP(float mP);

	public float getBlockPower();

	public void setBlockPower(float blockPower);

	public float getMaxHPMultiplier();

	public void setMaxHPMultiplier(float maxHPMultiplier);

	public float getShootSpeed();

	public void setShootSpeed(float shootSpeed);

	public float getDamageMultiplier();

	public void setDamageMultiplier(float damageMultiplier);

	public float getArmorMultiplier();

	public void setArmorMultiplier(float armorMultiplier);

	public float getResistanceMultiplier();

	public void setResistanceMultiplier(float resistanceMultiplier);

	public long getLevel();

	public void setLevel(long level);

	public long getCurrentXP();

	public void setCurrentXP(long currentXP);

	public Item getItemData();

	public void setItemData(Item itemData);

	public Item[] getEquipment();

	public void setEquipment(Item[] equipment);

	public long getIceBlockFour();

	public void setIceBlockFour(long iceBlockFour);

	public long[] getSkills();

	public void setSkills(long[] skills);

	public String getName();

	public void setName(String name);

	public long getNa1();

	public void setNa1(long na1);

	public long getNa2();

	public void setNa2(long na2);

	public byte getNa3();

	public void setNa3(byte na3);

	public long getNa4();

	public void setNa4(long na4);

	public long getNa5();

	public void setNa5(long na5);

	public long getNu1();

	public void setNu1(long nu1);

	public long getNu2();

	public void setNu2(long nu2);

	public long getNu3();

	public void setNu3(long nu3);

	public long getNu4();

	public void setNu4(long nu4);

	public long getNu5();

	public void setNu5(long nu5);

	public long getNu6();

	public void setNu6(long nu6);

	public byte getNu7();

	public void setNu7(byte nu7);

	public byte getNu8();

	public void setNu8(byte nu8);

	public long getParentOwner();

	public void setParentOwner(long parentOwner);

	public long getNu11();

	public void setNu11(long nu11);

	public long getNu12();

	public void setNu12(long nu12);

	public LongVector3 getSpawnPosition();

	public void setSpawnPosition(LongVector3 spawnPosition);

	public long getNu20();

	public void setNu20(long nu20);

	public long getNu21();

	public void setNu21(long nu21);

	public long getNu22();

	public void setNu22(long nu22);

	public byte getNu19();

	public void setNu19(byte nu19);

	public int getDebugCap();

	public void setDebugCap(int debugCap);

}
