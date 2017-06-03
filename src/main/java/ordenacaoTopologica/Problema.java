package ordenacaoTopologica;

import java.util.List;

/**
 * Created by mauricio on 03/06/17.
 */
public class Problema {

    private List<List<Tarefa>> problema;

    public Problema(List<List<Tarefa>> problema) {
        this.problema = problema;
    }

    public List<List<Tarefa>> getProblema() {
        return problema;
    }

    public void setProblema(List<List<Tarefa>> problema) {
        this.problema = problema;
    }
}
