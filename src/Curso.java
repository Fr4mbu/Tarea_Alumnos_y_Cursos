import java.util.ArrayList;

public class Curso {
    private String nombreCurso;
    private String codigoCurso;
    private ArrayList<Alumno> alumnos;

    //constructor sin parametros
    public Curso() {
        this.nombreCurso = "";
        this.codigoCurso = "";
        this.alumnos = new ArrayList<>();
    }

    //constructor con parametros
    public Curso(String nombreCurso, String codigoCurso) {
        this.nombreCurso = nombreCurso;
        this.codigoCurso = codigoCurso;
        this.alumnos = new ArrayList<>();
    }

    //metodo agregar estudiante
    public void agregarAlumno(Alumno a) {
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equals(a.getMatricula())) {
                System.out.println("El alumno con matricula " + a.getMatricula() + " ya existe");
                return;
            }
        }
        alumnos.add(a);
    }

    //metodo para eliminar estudiantes
    public void eliminarAlumno(String matricula) {
        alumnos.removeIf(alumno -> alumno.getMatricula().equals(matricula));
    }

    //metodo para verdificar
    public boolean perteneceCurso(String matricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equals(matricula)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Curso: ").append(nombreCurso)
        .append(", codigo: ").append(codigoCurso).append("\n")
        .append("Alumnos inscritos: ");

        if (alumnos.isEmpty()) {
            sb.append("No hat alumnos inscritos en este curso");
        }else  {
            for (Alumno alumno : alumnos) {
                sb.append(alumno.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
