package br.edu.unirn.exemplo;

import java.io.IOException;

public class PrincialServidor {
	
	public static void main(String[] args) throws IOException {
		ServidorRCP server = new ServidorRCP();
		server.iniciarServico();
		
	}

}
