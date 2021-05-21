package alumno;

public class Alumno {
  private String nombre;
  private double notaMedia = 0.0;
  
  public void AsignarNota(String nombreAlumno, double notaAsignada, int escala) {
        setNombre(nombreAlumno);
        setNotaMedia(notaAsignada);
  }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the notaMedia
     */
    public double getNotaMedia() {
        return notaMedia;
    }

    /**
     * @param notaMedia the notaMedia to set
     */
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
}
