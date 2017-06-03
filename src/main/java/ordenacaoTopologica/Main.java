/** Trabalho da disciplina de Estrutura de Dados - Unifor - 2017.2
 * 	Professor:
 *		- Adriano Patrick do Nascimento Cunha - adriano.cunha@unifor.br
 *	Equipe:
 *		- nome - email
 *		- nome - email
 *	Problema:
 * 		QUESTÃO ÚNICA:
 *			Implementar um algoritmo de utilizando uma estrutura de dados do tipo FILA para solucionar o problema
 *			da ordenação topológica. A Ordenação topológica é um grafo acíclico orientado, onde cada vértice
 *			esteja ordenado pela dependência existente entre os vértices. (https://www.youtube.com/watch?v=URdtNUdxU3o)
 *			Conceitos:
 *			- Uma permutação dos vértices de um digrafo é uma sequência em que cada vértice aparece uma só vez
 *			- Uma ordenação topológica é uma permutação dos vértices v1, ..., vn,
 *				de um digrafo acíclico, de forma que para qualquer aresta (vi ; vj ), i < j .
 *				- qualquer caminho entre vi e vj não passa por vk se k < i ou k > j .
 *			- Digrafos com ciclos não admitem ordenação topológica.
 *		ENTRADA:
 *			O arquivo de entrada contém várias instâncias do problema. Cada linha inicia com o número de tarefas,
 *			seguido da lista de dependências entre estas tarefas, as dependências são representas como vértices do
 *			tipo: (a, b), onde "a" representa a tarefa a qual "b" depende, ou seja, para que "b" seja executado é
 *			necessário que "a" tenha terminado. Não será inserido digrafo cíclico.
 *		SAIDA:
 *			A saída consiste de tantas linhas quantas instâncias do problema houver. Em cada linha, devem ser
 *		impressos a lista de tarefas ordenadas topologicamente, ou seja, com base na dependência das tarefas.
 *		EXEMPLO:
 *			Entrada:
 *				1
 *				4 (2,1) (2,3)
 *				5 (2,1) (2,3) (3,1) (1,5)
 *			Saída:
 *				1
 *				4, 2, 1, 3
 *				4, 2, 3, 1, 5
 **/
package ordenacaoTopologica;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

/**
 * Created by mauricio on 02/06/17.
 */
public class Main {


    public static void main(String[] args) {
        String fileName = "/home/mauricio/workspace/OrdenacaoTopologica/src/main/java/ordenacaoTopologica/entrada";
        InputStream input;
        try {
            input = new FileInputStream(fileName);
            processa(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void processa(InputStream input) throws IOException {
        Problema problema= entrada(input);
        //int resultado = ordena();
        //saida(resultado);
    }

    private static Problema entrada(InputStream input) throws IOException {
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(reader);
        List<String> linhas = ManipulandoDados.armazenandoLinhas(br);
        Problema problema = ManipulandoDados.armazenarProblema(linhas);
        br.close();
        return problema;
    }

    private static int ordena(){
        return 5;
    }

    private static void saida(int resultado) throws IOException {
        String fileName = "/home/mauricio/workspace/OrdenacaoTopologica/src/main/java/ordenacaoTopologica/saida";
        OutputStream os = new FileOutputStream(fileName);
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(Integer.toString(resultado));
        bw.close();
    }

}
