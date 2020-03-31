package app;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona1 = new Persona("Juan", 18, "H");
        Alumno alumno1 = new Alumno("Alondra", 19, "M");
        Alumno alumno2 = new Alumno("Guadalupe", 21, "M", "M1011","102", "ISC");


        Persona alumno = new Alumno("Ernesto", 20, "H",
                                    "Mexicana", "CURP101010MNR08",
                                     "M01010", "101", "ISC");
        // Alumno persona = new Persona("nombre", 20, "sexo");

        // System.out.println(persona1);
        System.out.println(alumno);

        
    }
}