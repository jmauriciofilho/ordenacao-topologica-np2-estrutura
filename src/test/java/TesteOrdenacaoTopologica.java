import ordenacaoTopologica.OrdenacaoTopologica;
import ordenacaoTopologica.Tarefa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by mauricio on 18/05/17.
 */
public class TesteOrdenacaoTopologica {

    public static void main(String[] args) {

        Tarefa tarefa1 = new Tarefa(1, 1);
        Tarefa tarefa2 = new Tarefa(2, 0,
                new ArrayList<>(Arrays.asList(1, 3)));
        Tarefa tarefa3 = new Tarefa(3, 1);
        Tarefa tarefa4 = new Tarefa(4, 0);


       List<Tarefa> tarefas = new ArrayList<Tarefa>();
       tarefas.add(tarefa1);
       tarefas.add(tarefa2);
       tarefas.add(tarefa3);
       tarefas.add(tarefa4);

       List<Integer> resposta = OrdenacaoTopologica.ordenacaoTopologica(tarefas);
       List<Integer> respostaCerta = new ArrayList<Integer>(Arrays.asList(
               new Integer[]{4,2,1,3}
       ));

       if (resposta == respostaCerta){
           System.out.println("Ordenção correta!");
           System.out.println("Resposta Certa:");
           for (Integer res : respostaCerta) {
               System.out.print(res);

           }
           System.out.print("\n");
           System.out.println("Saída:");
           for (Integer res : resposta) {
               System.out.print(res);
           }
       }else{
           System.out.println("Ordenção feita de forma errada!");
           System.out.println("Resposta Certa:");
           for (Integer res : respostaCerta) {
               System.out.print(res);
           }
           System.out.print("\n");
           System.out.println("Saída:");
           for (Integer res : resposta) {
               System.out.print(res);
           }
       }
    }


}
