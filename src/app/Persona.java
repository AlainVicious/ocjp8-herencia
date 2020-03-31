package app;

/**
 * Persona
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private String nacionalidad;
    private String curp;

    // public Persona(){}

    public Persona(String nombre, int edad, String sexo){
       this(nombre, edad, sexo, "NA", "NA");

    }

    public Persona(String nombre, int edad, String sexo,
                    String nacionalidad, String curp){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    @Override
    public String toString() {
        String str = "Persona\n\tnombre:" + nombre
                        + "\n\tedad: " + edad
                        + "\n\tsexo: " + sexo
                        + "\n\tnacionalidad: " + nacionalidad
                        + "\n\tCURP: "+ curp;
        return str;
    }
}