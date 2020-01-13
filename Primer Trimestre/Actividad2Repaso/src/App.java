import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static String entradaTeclado = "";
    public static Scanner entradaEscaner = new Scanner(System.in);

    public  static ArrayList<Curso> cursos = new ArrayList<>();
    public static XML xml = new XML();
    public static void main(String[] args) {
        xml.leerXML("C:\\Users\\rauli\\Desktop\\Módulo\\Programación\\Actividad2Repaso\\src\\cursos.xml", cursos);
        inicio();

    }

    public static void inicio()
    {
        System.out.println("¿Qué desea realizar?");
        System.out.println("1- Cursos");

        entradaTeclado = entradaEscaner.nextLine();
        int seleccion=Integer.parseInt(entradaTeclado);
        if (seleccion ==1)
        {
            System.out.println("\n");
            seleccionInicial();
        }
        else
        {
            System.out.println("Su valor no corresponde a ninguna acción");
            System.out.println("\n");
            inicio();
        }
    }

    public static void seleccionInicial()
    {
        System.out.println("¿Qué desea realizar?");
            System.out.println("1- Crear nuevo Curso");
            System.out.println("2- Acceder a un Curso");
            System.out.println("3- Salir");

            entradaTeclado = entradaEscaner.nextLine();
            int seleccion = Integer.parseInt(entradaTeclado);

            if(seleccion ==1)
            {
                System.out.println("Indique el nombre del curso nuevo");
                entradaTeclado = entradaEscaner.nextLine();
                Curso curso = new Curso(entradaTeclado, new ArrayList<Alumno>(), new ArrayList<Asignatura>());
                System.out.println("Curso creado");
                System.out.println(curso.toString());

                cursos.add(curso);
                System.out.println("\n");
                seleccionInicial();
            }

            if(seleccion == 2)
            {
                System.out.println("Lista de cursos:");
                System.out.println(cursos.toString());
                System.out.println("\n");
                seleccionListaCursos();
            }

            if (seleccion == 3) inicio();

            else if(seleccion != 1 || seleccion != 2 || seleccion != 3)
            {
                System.out.println("Su valor no corresponde a ninguna acción");
                System.out.println("\n");
                seleccionInicial();
            }
    }

    public static void seleccionListaCursos()
    {
        System.out.println("Especifique el nombre curso al que quiere acceder o quit para salir");
        entradaTeclado = entradaEscaner.nextLine();
        if (!entradaTeclado.equals("quit")){
        for (int i = 0; i < cursos.size(); i++)
        {
            Curso cursoFor = cursos.get(i);
            if(entradaTeclado.equals(cursoFor.getNombre()))
            {
                seleccionEnCurso(cursoFor);
            }
        }}

        else if (entradaTeclado.equals("quit"))
        {
            seleccionInicial();
        }
    }

    public static void seleccionEnCurso(Curso estoyEnCurso)
    {
        System.out.println("¿Qué desea realizar?");
        System.out.println("1- Matricular alumno");
        System.out.println("2- Añadir asignaturas");
        System.out.println("3- Ver Alumnos");
        System.out.println("4- Ver Asignaturas");
        System.out.println("5- Salir");

        entradaTeclado = entradaEscaner.nextLine();
        int seleccion = Integer.parseInt(entradaTeclado);

        if(seleccion == 1)
        {
            matricularAlumno(estoyEnCurso);
        }
        if (seleccion == 2)
        {
            añadirAsignatura(estoyEnCurso);
        }
        if(seleccion == 3)
        {
            estoyEnCurso.getAlumnosCurso();
            System.out.println("\n");
            seleccionEnCurso(estoyEnCurso);
        }
        if (seleccion == 4)
        {
            estoyEnCurso.getAsignaturasCurso();
            System.out.println("\n");
            seleccionEnCurso(estoyEnCurso);
        }
        if (seleccion == 5)
        {
            System.out.println("\n");
            seleccionListaCursos();
        }
        else
        {
            System.out.println("Su valor no corresponde a niguna acción");
            System.out.println("\n");
            seleccionEnCurso(estoyEnCurso);
        }
    }

    public static void matricularAlumno(Curso estoyEnCurso)
    {
        System.out.println("Especifique el nombre del alumno:");
        entradaTeclado = entradaEscaner.nextLine();

        Alumno alumno = new Alumno(entradaTeclado, estoyEnCurso, new ArrayList<Asignatura>());
        System.out.println(alumno.toString());
        estoyEnCurso.addAlumno(alumno);
        System.out.println("\n");
        seleccionEnCurso(estoyEnCurso);
    }

    public static void añadirAsignatura(Curso estoyEnCurso)
    {
        System.out.println("¿Qué desea realizar?");
        System.out.println("1- Añadir Asigantura al curso");
        System.out.println("2- Asignar Asignatura a un alumno");
        System.out.println("3- Salir");

        entradaTeclado = entradaEscaner.nextLine();
        int seleccion = Integer.parseInt(entradaTeclado);

        if (seleccion == 1)
        {
            System.out.println("\n");
            crearAsignatura(estoyEnCurso);
        }
        if (seleccion == 2)
        {
            System.out.println("\n");
            asignarAsignatura(estoyEnCurso);
        }
        if (seleccion == 3)
        {
            System.out.println("\n");
            seleccionEnCurso(estoyEnCurso);
        }
        else
        {
            System.out.println("El valor no se corresponde a ninguna acción");
            System.out.println("\n");
            añadirAsignatura(estoyEnCurso);
        }
    }

    public static void  crearAsignatura(Curso estoyEnCurso)
    {
        System.out.println("Especifique el nombre de la asignatura o quit para salir");
        entradaTeclado = entradaEscaner.nextLine();
        Asignatura asignatura = new Asignatura(entradaTeclado, estoyEnCurso, new ArrayList<Actividad>());
        System.out.println(asignatura);
        estoyEnCurso.addAsignatura(asignatura);
        System.out.println("\n");
        añadirAsignatura(estoyEnCurso);
    }

    public static void asignarAsignatura(Curso estoyEnCurso)
    {
        System.out.println(estoyEnCurso.getAsignaturasCurso().toString());
        System.out.println("Especifique el nombre de la asignatura o quit para salir");
        entradaTeclado = entradaEscaner.nextLine();

            for (int i = 0; i < estoyEnCurso.getAsignaturasCurso().size(); i++) {
                Asignatura asignaturaFor = estoyEnCurso.getAsignaturasCurso().get(i);
                if (entradaTeclado.equals(asignaturaFor.getNombre())) {
                    System.out.println("\n");
                    enAsignatura(estoyEnCurso, asignaturaFor);
                }
            }

    }

    public static void enAsignatura(Curso estoyEnCurso, Asignatura asignaturaEnCurso)
    {
        System.out.println(estoyEnCurso.getAlumnosCurso().toString());
        System.out.println("¿A qué alumno? o quit para salir");

        entradaTeclado = entradaEscaner.nextLine();
        if(!entradaTeclado.equals("quit"))
        {
            for (int i = 0; i< estoyEnCurso.getAlumnosCurso().size(); i++)
            {
                Alumno alumnoFor = estoyEnCurso.getAlumnosCurso().get(i);
                if (alumnoFor.getNombre() == entradaTeclado)
                {
                    alumnoFor.addAsignatura(asignaturaEnCurso);
                    System.out.println(alumnoFor.getAsignaturasAlumno());
                    System.out.println("\n");
                    añadirAsignatura(estoyEnCurso);
                }
            }
        }

        if (entradaTeclado.equals("quit"))
        {
            System.out.println("\n");
            asignarAsignatura(estoyEnCurso);
        }
    }
}
