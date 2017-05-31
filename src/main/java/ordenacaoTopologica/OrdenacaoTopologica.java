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
            if(numeroDepenenciasIgualAZero(tarefa.getNumeroDeDependecias()) &&
                    tarefa.getListaDeDependentes() == null){
                fila.insert(tarefa);
                iter.remove();
            }
        }

        while (fila != null){
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
                for (Tarefa tarefa : tarefas){
                    if (dependente == tarefa.getValor()){
                        tarefa.setNumeroDeDependecias(tarefa.getNumeroDeDependecias() - 1);
                        listaDeDependentes.remove(dependente);
                        if (numeroDepenenciasIgualAZero(tarefa.getNumeroDeDependecias())){
                            fila.insert(tarefa);
                            tarefas.remove(tarefa);
                        }
                    }
                }
            }
        }
        fila.remove();
    }

    private static boolean numeroDepenenciasIgualAZero(int numeroDeDependencias){
        return numeroDeDependencias == 0;
    }
}
