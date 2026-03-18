package ar.edu.et32.FlujoDatos;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Lecturas {

	
	BufferedReader lector;
	
	public Lecturas() {
		//buffered (almacenamiento), reader (algo que une), consola (canal)
		lector = new BufferedReader(new InputStreamReader(System.in));
	}
	
}
