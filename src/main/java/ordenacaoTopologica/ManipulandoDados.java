package ordenacaoTopologica;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mauricio on 03/06/17.
 */
public class ManipulandoDados {

    public static List<String> armazenandoLinhas(BufferedReader br) throws IOException {
        String linha;
        List<String> linhas = new ArrayList<>();
        do {
            linha = br.readLine();
            linhas.add(linha);
        }while (linha != null);
        return linhas;
    }

    public static Problema armazenarProblema(List<String> linhas){
        List<List<Tarefa>> problemas = criarListaDeListasDeTarefa(linhas);
        return new Problema(problemas);
    }

    private static List<List<Tarefa>> criarListaDeListasDeTarefa(List<String> linhas){
        List<List<Tarefa>> problemas = new ArrayList<>();
        for (String linha : linhas){
            if (linha != null){
                List<Tarefa> tarefas = criarListaDeTarefas(linha);
                problemas.add(tarefas);
            }
        }
        return problemas;
    }

    private static List<Tarefa> criarListaDeTarefas(String linha){
        List<Tarefa> tarefas = new ArrayList<>();
        String string = linha.replaceAll(" ", "");

        
        System.out.println(string);
        return tarefas;
    }
}
