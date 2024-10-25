public class Curso {
  private String id;
  private String nombre;
  private boolean estadoDisponible;
  private ArrayList<Estudiante> estudiantesEnEsperaDeInscripcion;
  private ArrayList<Estudiante> estudiantesInscritos;
  private Profesor responsable;
  private ArrayList<Foro> foros;

  public Curso() {
  }

  public void crear(String i, String n, boolean e, Arraylist<Estudiante> eeeI, ArrayList<Estudiante> eI, Profesor r, ArrayList<Foro> f) {
    id = i;
    nombre = n;
    estadoDisponible = e;
    estudiantesEnEsperaDeInscripcion = eeeI;
    estudiantesInscritos = eI;
    responsable = r;
    foros = f;
  }
}
