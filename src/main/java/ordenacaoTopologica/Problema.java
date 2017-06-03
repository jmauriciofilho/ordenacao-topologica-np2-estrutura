package ordenacaoTopologica;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauricio on 03/06/17.
 */
public class Problema {

    private List<Tarefa> problema;

    public Problema(List<Tarefa> problema) {
        this.problema = problema;
    }

    public List<Tarefa> getProblema() {
        return problema;
    }

    public void setProblema(List<Tarefa> problema) {
        this.problema = problema;
    }
}
