package app;

/**
 * Alumno
 */
public class Alumno extends Persona{
    private String matricula;
    private String grupo;
    private String carrera;

    public Alumno(String nombre, int edad, String sexo){
        this(nombre, edad, sexo, "NA", "NA", "NA");
    }

    public Alumno(String nombre, int edad, String sexo,
                    String matricula, String grupo, String carrera){
        this(nombre, edad, sexo, "NA", "NA", matricula, grupo, carrera);
    }

    public Alumno(String nombre, int edad, String sexo,
            String nacionalidad, String curp,
            String matricula, String grupo, String carrera){
        
            super(nombre, edad, sexo, nacionalidad, curp);
            this.matricula = matricula;
            this.grupo = grupo;
            this.carrera = carrera;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * edad que tiene en el colegio
     */
    public int getEdad(){
        return 0;
    }

    @Override
    public String toString() {
        String str = "Alumno"
                        + "\n\tmatricula:" + matricula
                        + "\n\tgrupo:" + grupo
                        + "\n\tcarrera:" + carrera
                        + "\n\tnombre:" + getNombre()

                        + "\n\tedad como alumno: " + this.getEdad()
                        + "\n\tedad como persona: " + super.getEdad()

                        + "\n\tsexo: " + getSexo()
                        + "\n\tnacionalidad: " + getNacionalidad()
                        + "\n\tCURP: "+ getCurp();
        return str;
    }
        
}