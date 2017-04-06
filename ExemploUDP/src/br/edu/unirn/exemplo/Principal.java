package br.edu.unirn.exemplo;

import java.io.IOException;

public class Principal {

	public static void main(String[] args) throws IOException {
		ServidorUDP s = new ServidorUDP();
		s.enviandoPacote();

	}

}
