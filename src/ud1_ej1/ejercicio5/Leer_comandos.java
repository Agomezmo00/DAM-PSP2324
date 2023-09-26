package ud1_ej1.ejercicio5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Leer_comandos {

	/**
	 * Leer por la l�ena de comandos hastas que se encuentre un *
	 * e interpreta la entrada como comandos adicionales
	 * 
	 * @param args
	 */
	public static void main(String[] args)  {

		// creo un buffer para leer lo que entra por la l�ena de comandos
		BufferedReader brEntrada = new BufferedReader(new InputStreamReader(System.in));

		try {
			// lee l�neas de la entrada estandar
			int i = 0;
			String lineaEntrada = brEntrada.readLine();
			Runtime rn = Runtime.getRuntime();
			Process p;
			while (!lineaEntrada.equals("*")) {

				try {
					p = rn.exec(lineaEntrada);

					// recojo la salida y la imprimo
					InputStream is = p.getInputStream();
					BufferedReader brproceso = new BufferedReader (new InputStreamReader (is));                      
					String salida;
					while((salida = brproceso.readLine())!=null) {
						System.out.println("Soy \"leer_comandos\"-->" + salida);
					}
					brproceso.close();
				} catch (Exception e) {
					System.out.println("Se ha producido un error de tipo " + e.getMessage());
				}

				System.out.println("Ejecuto el comando:" + lineaEntrada);
				lineaEntrada = brEntrada.readLine();
				i++;
			}

			System.out.println("HE TERMINADO DE LEER " + i + " l�neas");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
