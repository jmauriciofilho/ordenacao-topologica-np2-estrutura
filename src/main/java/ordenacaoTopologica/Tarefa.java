package ordenacaoTopologica;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauricio on 18/05/17.
 */
public class Tarefa {

    private int valor;
    private int numeroDeDependecias;
    private List<Integer> listaDeDependentes;

    public Tarefa(int valor, int numeroDeDependecias) {
        this.valor = valor;
        this.numeroDeDependecias = numeroDeDependecias;
    }

    public Tarefa(int valor, int numeroDeDependecias, ArrayList<Integer> listaDeDependentes) {
        this.valor = valor;
        this.numeroDeDependecias = numeroDeDependecias;
        this.listaDeDependentes = listaDeDependentes;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getNumeroDeDependecias() {
        return numeroDeDependecias;
    }

    public void setNumeroDeDependecias(int numeroDeDependecias) {
        this.numeroDeDependecias = numeroDeDependecias;
    }

    public List<Integer> getListaDeDependentes() {
        return listaDeDependentes;
    }

    public void setListaDependencias(List<Integer> listaDependencias) {
        this.listaDeDependentes = listaDependencias;
    }
}
