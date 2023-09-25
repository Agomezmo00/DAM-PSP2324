package ud0;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String matricula;
    private int edad;

    public Estudiante(String nombre, String matricula, int edad){
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString(){
        String a = "\nNombre: " + this.getNombre();
        String b = "\nEdad: "+this.getEdad();
        String c = "\nMatrícula: "+this.getMatricula();
        return a.concat(b).concat(c);
    }

}
