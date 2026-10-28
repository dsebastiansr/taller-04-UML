import java.util.Date;

public class ActividadSumativa {
    protected String id;
    protected String titulo;
    protected Date fechaDeEntrega;
    protected float puntajeMaximo;
    protected String contenido;
    protected float calificacion;

    public ActividadSumativa() {};

    private Curso curso;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getFechaDeEntrega() {
        return fechaDeEntrega;
    }

    public void setFechaDeEntrega(Date fechaDeEntrega) {
        this.fechaDeEntrega = fechaDeEntrega;
    }

    public float getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(float puntajeMaximo) {
        this.puntajeMaximo = puntajeMaximo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
}