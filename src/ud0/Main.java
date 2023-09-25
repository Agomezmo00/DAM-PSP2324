package ud0;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RegistroEstudiantes r = new RegistroEstudiantes();

        Scanner keyboard = new Scanner(System.in);
        int myint = 0;

        while(myint != 5) {
            System.out.println("1. Agregar Estudiante");
            System.out.println("2. Mostrar Estudiantes");
            System.out.println("3. Buscar Estudiante");
            System.out.println("4. Eliminar Estudiante");
            System.out.println("5. Salir");


            try {
                myint = keyboard.nextInt();
            } catch(InputMismatchException e){
                System.out.println("Tipo de dato no válido");
                keyboard.nextLine();
            }

            switch (myint) {
                case 1:
                    r.nuevoEstudiante();
                    break;
                case 2:
                    r.mostrarEstudiantes();
                    break;
                case 3:
                    Estudiante e = r.buscarEstudiante(r.pedirMatricula());
                    if (e == null){
                        System.out.println("No se ha encontrado la matrícula");
                    } else {
                        System.out.println(e.toString());
                    }
                    break;
                case 4:
                    Estudiante es = r.buscarEstudiante(r.pedirMatricula());
                    if (es != null){
                        r.eliminarEstudiante(es.getMatricula());
                        System.out.println("Estudiante eliminado");
                    } else {
                        System.out.println("No se ha encontrado la matrícula");
                    }

                    break;
                case 5:
                    System.out.println("Programa finalizado.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida");
                    break;

            }

        }



    }
}