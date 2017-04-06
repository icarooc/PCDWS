package br.edu.unirn.exemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ClienteTCP {
	
	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket("localhost",5001);
		
		String msg = JOptionPane.showInputDialog("Digite a mensagem para enviar ao servidor.");
		PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		out.println(msg);
		System.out.println(reader.readLine());
		
		out.close();
		reader.close();
		socket.close();
		
		
	}

}
