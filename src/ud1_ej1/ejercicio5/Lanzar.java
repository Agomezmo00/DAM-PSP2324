package ud1_ej1.ejercicio5;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Lanzar {

	/**
	 * Lanza un comando que se especifica dentro del c�digo
	 * 
	 * @param args
	 */
	public static void main(String[] args)  {

		String comando[] = {"java", "ejercicio5.Leer"};

		ProcessBuilder pb = new ProcessBuilder(comando);
		try {
			// Creo el constructor de procesos

			// Lanzo el proceso
			Process p = pb.start();

			// har� que la entrada estandar sea esta misma
			OutputStream os = p.getOutputStream();
			os.write("notepad\n".getBytes());
			os.write("segunda l�nea\n".getBytes());
			os.write("cmd /c help\n".getBytes());
			os.write("cuarta l�nea\n".getBytes());
			os.write("*\n".getBytes());
			os.close();

			// har� que la salida salga por esta consola
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader (new InputStreamReader (is));                      
			String linea;
			while((linea = br.readLine())!=null) {
				System.out.println("Soy \"lanzar\"-->" + linea);
			}
			br.close();


		} catch (Exception e) {
			System.err.println("Se ha producido un error!");
			System.err.println(e.toString());

		}
	}


}
