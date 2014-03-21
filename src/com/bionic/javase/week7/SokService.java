package com.bionic.javase.week7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class SokService {

	static int numberOfConnections = 0;

	public static void main(String[] args) throws Exception {

		if (args.length != 1) {
			System.out.println("Usage: start java sokservis port");
			System.exit(0);
		}

		final ServerSocket servsock = new ServerSocket(
				Integer.parseInt(args[0]));
		System.out.println("Server registered at port " + args[0]);

		while (true) {

			System.out.println("Number of connections is "
					+ SokService.numberOfConnections);

			Socket soket = servsock.accept();
			SokService.numberOfConnections++;
			new Thread(new SocketThread(soket)).start();
			System.out.println("New client connected");

		}
	}

}
