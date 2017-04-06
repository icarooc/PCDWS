package br.edu.unirn.exemplo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ServidorUDP {
	
	
	public void conectarUDP() throws IOException{
		DatagramPacket packet = new DatagramPacket(new byte[256], 256);
		DatagramSocket socket = new DatagramSocket(2000);
		boolean acabou = false;
	
		System.out.println("inicando");
		
		while (!acabou){
			socket.receive(packet);
			System.out.println(new String(packet.getData()));
			System.out.println("...");
		}
	
		socket.close();
	}
	
	public void enviandoPacote() throws IOException{
		
		DatagramSocket socket = new DatagramSocket();
		DatagramPacket packet = new DatagramPacket(new byte[256], 256);
		
		packet.setPort(2000);
		//packet.setAddress(InetAddress.getByName("127.0.0.1"));
		//packet.setAddress(InetAddress.getByName("10.14.26.255"));
		packet.setAddress(InetAddress.getByName("192.168.0.13"));
		
		boolean acabou = false;
		
		System.out.println("enviando...");
		while (!acabou){
			packet.setData("Avisa que eu cheguei!".getBytes());
			socket.send(packet);
		}
		socket.close();
	}

}
