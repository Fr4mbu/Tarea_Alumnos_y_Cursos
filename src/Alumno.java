public class Alumno {
    //atributos
    private String nombre;
    private String apellido;
    private String matricula;
    private String carrera;
    private int edad;

    //constructor sin parametros
    public Alumno() {
        this.nombre = "";
        this.apellido = "";
        this.matricula = "";
        this.carrera = "";
        this.edad = 0;
    }

    public Alumno(String nombre, String apellido, String matricula, String carrera,  int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matricula = matricula;
        this.carrera = carrera;
        this.edad = edad;
    }
}
