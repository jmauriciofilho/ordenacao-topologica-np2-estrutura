package ordenacaoTopologica;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

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
        List<String> listaDeDependentes = new ArrayList<>();
        String string = linha.replaceAll(" ", "");
        StringTokenizer st = new StringTokenizer(string, "(\\(|\\)");
        int quantidadeDeTarefas = Integer.parseInt(st.nextToken());
        int quantidadeTokens = st.countTokens();
        for (int i = 0; i < quantidadeTokens; i++){
            listaDeDependentes.add(st.nextToken());
        }
        for (int i = 0; i < quantidadeDeTarefas; i++){
            Tarefa tarefa = new Tarefa();
            tarefa.setValor(i+1);
            tarefas.add(tarefa);
        }
        for (Tarefa tarefa : tarefas){
            tarefa.setNumeroDeDependecias(retornaNumeroDeDependecia(listaDeDependentes, tarefa.getValor()));
            tarefa.setListaDependencias(retornaLisDependencias(listaDeDependentes, tarefa.getValor(), tarefas));
        }
        return tarefas;
    }

    private static List<Integer> retornaLisDependencias(List<String> dependentes, int valor, List<Tarefa> tarefas) {
        List<Integer> listaDeDependentes = new ArrayList<>();
        for (String dependente : dependentes){
            String[] vetor = dependente.split(",");
            if (valor == Integer.parseInt(vetor[0])){
                listaDeDependentes.add(Integer.parseInt(vetor[1]));
            }
        }
        return listaDeDependentes;
    }

    private static int retornaNumeroDeDependecia(List<String> listaDeDependentes, int valor) {
        int count = 0;
        for (String dependente : listaDeDependentes){
            String[] dependnetes = dependente.split(",");
            if (valor == Integer.parseInt(dependnetes[1])){
                count++;
            }
        }
        return count;
    }


}
