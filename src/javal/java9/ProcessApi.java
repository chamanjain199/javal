package javal.java9;

import java.io.IOException;
import java.util.logging.Logger;

public class ProcessApi {

	static Logger  log = Logger.getLogger(ProcessApi.class.getName() );

	public static void main(String[] args) {
		ProcessHandle processHandle = ProcessHandle.current();
		ProcessHandle.Info processInfo = processHandle.info();

		log.info("PID: " + processHandle.pid());
		log.info("Arguments: " + processInfo.arguments());
		log.info("Command: " + processInfo.command());
		log.info("Instant: " + processInfo.startInstant());
		log.info("Total CPU duration: " + processInfo.totalCpuDuration());
		log.info("User: " + processInfo.user());
		
		try {
			ProcessBuilder processBuilder = new ProcessBuilder();
			processBuilder.command("C://Program Files//MySQL//MySQL Server 8.0//bin//mysqld.exe");
			processBuilder.start();
		
			 System.out.println("Ss");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
