package br.edu.unirn.exemplo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorRCP {
	
	public void iniciarServico() throws IOException{
		ServerSocket server = new ServerSocket(5001); 
		Socket sc = server.accept();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(sc.getInputStream()));
		
		PrintWriter out = new PrintWriter(new OutputStreamWriter(sc.getOutputStream()),true);
		
		System.out.println("Lendo... ");
		System.out.println(reader.readLine());
		
		System.out.println("Enviando... ");
		out.println("Número Randomico: " + Math.random());
		
		reader.close();
		out.close();
		sc.close();
	}

}
