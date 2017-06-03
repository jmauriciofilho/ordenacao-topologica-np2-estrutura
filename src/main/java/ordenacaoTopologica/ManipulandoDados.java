package ordenacaoTopologica;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by mauricio on 03/06/17.
 */
public class ManipulandoDados {

    public static void armazenandoProblemas(List<String> linhas){
        List<Tarefa> tarefas = criarTarefas(linhas);
        System.out.println(linhas);
    }

    public static List<String> armazenandoLinhas(BufferedReader br) throws IOException {
        String linha;
        List<String> linhas = new ArrayList<>();
        do {
            linha = br.readLine();
            linhas.add(linha);
        }while (linha != null);
        return linhas;
    }

    private static List<Tarefa> criarTarefas(List<String> linhas){
        List<Tarefa> tarefas = new ArrayList<>();
        int valor = 1;
        int numeroDependencias = 1;
        ArrayList<Integer> listaDeDependentes = new ArrayList<>();
        Tarefa tarefa = new Tarefa(valor, numeroDependencias, listaDeDependentes);
        tarefas.add(tarefa);
        return tarefas;
    }
}
