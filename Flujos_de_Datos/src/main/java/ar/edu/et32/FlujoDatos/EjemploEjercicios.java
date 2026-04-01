package ar.edu.et32.FlujoDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EjemploEjercicios {

	BufferedReader br;
	PrintWriter pw;
	
	public EjemploEjercicios() {
		br = new BufferedReader(new InputStreamReader(System.in) );
		pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out) ));
		/*
		 * Ejercicio 7:  Lee una contraseña ingresada por consola.
		 * El sistema debe validarla aplicando tres reglas:
		 * debe tener un mínimo de 8 caracteres de longitud, debe contener al menos un número,
		 * y no debe contener la palabra "clave" en ninguna parte.
		 * Imprime un mensaje indicando si la contraseña es segura o vulnerable
		*/
	}
	public void Guia1_Ej7() {
		Utils.getOut().println
		pw.println("ingrese contraseña:");
		try {
			String psw = br.readLine();
			
			boolean longitudValida = psw.length() >= 8;
			boolean contienePalabra = psw.contains("clave");
			boolean contieneNumeros = false;
			
			//psw.matches( "." ); --expresiones regulares
			
			for(int i = 0; i<=9; i++)
			{
				if(psw.contains( String.valueOf(i) ) == true)
				{
					contieneNumeros = true;
				}
			}
			
			//psw == "AAAA" ? "true" : "false" //IF ternario
			
			if(longitudValida && contieneNumeros && contienePalabra)
			{
				pw.println("contraseña segura");
			}else {
				pw.println("contraseña vulnerable");
			}
			psw.concat("0");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
