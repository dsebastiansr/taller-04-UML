import java.util.List;

public class Estudiante extends PersonalAcademico {
    public void solicitarInscripcionCurso(Curso curso) {}
    public void realizarActividadSumativa(Curso curso, ActividadSumativa actividadSumativa) {}
    private List<Curso> cursosInscritos;
    private List<Curso> cursosEnEsperaDeInscripcion;

}