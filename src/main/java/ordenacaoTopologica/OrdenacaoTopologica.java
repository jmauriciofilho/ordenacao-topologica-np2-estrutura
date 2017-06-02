package ordenacaoTopologica;

import java.util.*;

/**
 * Created by mauricio on 18/05/17.
 */
public class OrdenacaoTopologica {

    public static List<Integer> ordenacaoTopologica(List<Tarefa> tarefas){
        Fila<Tarefa> fila = new Fila<>();
        List<Integer> resultado = new ArrayList<>();

        Iterator<Tarefa> iter = tarefas.iterator();
        while (iter.hasNext()){
            Tarefa tarefa = iter.next();
            excluirTarefa(iter, fila, tarefa);

        }

        while (!fila.vazia()){
            removerDependencias(fila, tarefas, resultado);
        }

        return resultado;
    }

    private static void removerDependencias(Fila<Tarefa> fila, List<Tarefa> tarefas, List<Integer> resultado){
        Tarefa primeiroDaFila = fila.primeiroDaFila();
        resultado.add(primeiroDaFila.getValor());
        List<Integer> listaDeDependentes = primeiroDaFila.getListaDeDependentes();
        if (listaDeDependentes != null){
            for (int dependente : listaDeDependentes){
                Iterator<Tarefa> iter = tarefas.iterator();
                while (iter.hasNext()){
                    Tarefa tarefa = iter.next();
                    if (dependente == tarefa.getValor()){
                        tarefa.setNumeroDeDependecias(tarefa.getNumeroDeDependecias() - 1);
                        excluirTarefa(iter, fila, tarefa);
                    }
                }
            }
        }
        fila.remove();
    }

    private static boolean numeroDepenenciasIgualAZero(int numeroDeDependencias){
        return numeroDeDependencias == 0;
    }

    private static void excluirTarefa(Iterator<Tarefa> iter, Fila<Tarefa> fila, Tarefa tarefa){
        if (numeroDepenenciasIgualAZero(tarefa.getNumeroDeDependecias())){
            fila.insert(tarefa);
            iter.remove();
        }
    }
}
