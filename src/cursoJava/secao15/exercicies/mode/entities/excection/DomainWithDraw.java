package cursoJava.secao15.exercicies.mode.entities.excection;

public class DomainWithDraw extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DomainWithDraw(String message) {
        super(message);
    }
}
