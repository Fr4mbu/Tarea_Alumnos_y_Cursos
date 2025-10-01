public class Main {
    public static void main(String[] args) {
        //crea el curso
        Curso curso = new Curso("Programacion Orientada a Objetos", "POO101");

        //crear alumnos
        Alumno a1 = new Alumno("Oscar", "Perez", "1001", "Ingenieria civil Informatica", 20);
        Alumno a2 = new Alumno("Pedro", "Martinez", "1002", "Ingenieria civil Informatica", 21);
        Alumno a3 = new Alumno("Francisca", "Aguayo", "1003", "Ingenieria civil Informatica", 21);
        Alumno a4 = new Alumno("Oscar", "Mandarina", "1004", "Ingenieria civil Informatica", 22);
        Alumno a5 = new Alumno("Fernanda", "Oses", "1005", "Ingenieria civil Informatica", 20);

        //agregamos alumnos al curso
        curso.agregarAlumno(a1);
        curso.agregarAlumno(a2);
        curso.agregarAlumno(a3);
        curso.agregarAlumno(a4);
        curso.agregarAlumno(a5);

        //mostrar curso completo
        System.out.println("---- Curso ----");
        System.out.println(curso);

        //verificacion
        System.out.println("¿Francisca (1003) pertenece al curso?" + curso.perteneceCurso("1003"));

        //eliminar estudiante
        curso.eliminarAlumno("1003");
        System.out.println("---- Curso ----");
        System.out.println(curso);

        //ultima verificacion
        System.out.println("¿Francisca (1003) pertenece al curso?" + curso.perteneceCurso("1003"));

    }
}
