package org.glydar.mitm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

import org.glydar.api.Glydar;
import org.glydar.api.logging.GlydarLogger;

public class VanillaServer {
	private Process serverProcess;
	private GlydarLogger logger;
	private AtomicBoolean restarting;
	private AtomicBoolean restarted;
	
	
	protected VanillaServer () {
		this.logger = Glydar.getLogger(getClass());
		restarting = new AtomicBoolean(false);
		restarted = new AtomicBoolean(false);
	}
	
	private void isReady() {
		BufferedReader in = new BufferedReader(new InputStreamReader(serverProcess.getInputStream()));
		String line = "";
		while (!line.contains("Waiting")){
			try {
				line = in.readLine();
			} catch (IOException e) {
				logger.severe("Error reading Vanilla Server input stream: " + e);
			}
		}
		restarting.set(false);
		restarted.set(true);
	}
	
	public void startServer(String path){
		if (!processExists()) logger.severe("Tried to start the Vanilla Server while it was still running.");
		try {
			serverProcess = Runtime.getRuntime().exec(path);
			isReady();
		} catch (IOException e) {
			logger.severe("Could not start the vanilla server. Shutting down.");
			GlydarMitmMain.shutdown();
		}
	}
	
	public boolean processExists() {
		return serverProcess == null ? false : true;
	}
	
	public void shutDownGracefully(){
		if (processExists()) serverProcess.destroy();
	}
	
	public AtomicBoolean getRestarting() {
		return restarting;
	}
	
	public AtomicBoolean getRestarted() {
		return restarted;
	}

}
