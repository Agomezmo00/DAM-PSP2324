package ud0;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class RegistroEstudiantes {

    private ArrayList<Estudiante> estudiantes;

    public RegistroEstudiantes(){
     this.estudiantes = new ArrayList<Estudiante>();
    }

    public void agregarEstudiante(Estudiante e){
        if(this.buscarEstudiante(e.getMatricula()).equals(null)){
            this.estudiantes.add(e);
        } else {
            System.out.println("La matrícula introducida ya existe");
        }

    }

    public void mostrarEstudiantes(){
        for(Estudiante e : this.estudiantes) {
            System.out.println(e.toString());
        }
    }

    public Estudiante buscarEstudiante(String matricula){
        for(Estudiante e: this.estudiantes){
               if (e.getMatricula().equals(matricula)) {
                   return e;
               }
        }
        return null;
    }

    public void eliminarEstudiante(String matricula){
        Estudiante e = this.buscarEstudiante(matricula);
        this.estudiantes.remove(e);
    }

    public void nuevoEstudiante(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nombre: ");
        String nombre = keyboard.nextLine();
        System.out.println("Edad: ");
        int edad = 0;
        try {
            edad = keyboard.nextInt();
        } catch(InputMismatchException e){
            System.out.println("Edad no válida");

        }
        keyboard.nextLine();
        System.out.println("Matrícula: ");
        String matricula = keyboard.nextLine();

        this.agregarEstudiante(new Estudiante(nombre, matricula, edad));
    }

    public String pedirMatricula(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduce matrícula: ");
        return keyboard.nextLine();
    }
}
