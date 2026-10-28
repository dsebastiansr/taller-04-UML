import java.util.List;

public class PersonalAcademico extends Usuario {
    public void reportarError(String email, String contenido) {}
    public void solicitarAsesoriamiento(String email, String contenido) {}
    public void comentarEnForo(Foro foro, String comentario) {}
    protected Usuario beneficiario;
    private List<Incidente> incidentes;
}
