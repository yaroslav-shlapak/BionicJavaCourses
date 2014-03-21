package com.bionic.javase.week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;

public class SocketThread implements Runnable {
	private Socket soket;

	public SocketThread(Socket soket) {
		this.soket = soket;
	}

	private SocketThread() {

	}

	@Override
	public void run() {
		try {
			BufferedReader inStream = new BufferedReader(new InputStreamReader(
					soket.getInputStream()));
			PrintWriter outStream = new PrintWriter(soket.getOutputStream(),
					true);
			while (true) {
				String input = inStream.readLine();
				if (input != null) {
					String treatedInput = input.trim().toUpperCase();

					if (treatedInput.equals("BYE")) {
						SokService.numberOfConnections--;
						System.out.println("Client disconnected");
						System.out.println("Number of connections is "
								+ SokService.numberOfConnections);
						inStream.close();
						outStream.close();
						soket.close();
						break;
					} else if (treatedInput.equals("DATE")) {
						outStream.println("The date is " + new Date());
					}

					else
						outStream.println("Unrecognized command");

				}

			}

			inStream.close();
			outStream.close();
			soket.close();

		} catch (Exception e) {
			throw new RuntimeException();
		}
	}

}
