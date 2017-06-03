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
//        Tarefa tarefa5 = new Tarefa(5, 1,
//                new ArrayList<>(Arrays.asList(7, 10, 6)));
//        Tarefa tarefa6 = new Tarefa(6, 1,
//                new ArrayList<>(Arrays.asList(9, 7)));
//        Tarefa tarefa7 = new Tarefa(7, 2);
//        Tarefa tarefa8 = new Tarefa(8, 1,
//                new ArrayList<>(Arrays.asList(9, 11)));
//        Tarefa tarefa9 = new Tarefa(9, 2,
//                new ArrayList<>(Collections.singletonList(12)));
//        Tarefa tarefa10 = new Tarefa(10, 1);
//        Tarefa tarefa11 = new Tarefa(11, 1);
//        Tarefa tarefa12 = new Tarefa(12, 1);


       List<Tarefa> tarefas = new ArrayList<Tarefa>();
       tarefas.add(tarefa1);
       tarefas.add(tarefa2);
       tarefas.add(tarefa3);
       tarefas.add(tarefa4);
//       tarefas.add(tarefa5);
//       tarefas.add(tarefa6);
//       tarefas.add(tarefa7);
//       tarefas.add(tarefa8);
//       tarefas.add(tarefa9);
//       tarefas.add(tarefa10);
//       tarefas.add(tarefa11);
//       tarefas.add(tarefa12);

       List<Integer> resposta = OrdenacaoTopologica.ordenacaoTopologica(tarefas);
       List<Integer> respostaCerta = new ArrayList<Integer>(Arrays.asList(
               new Integer[]{4, 2, 1, 3}
       ));

       if (resposta.equals(respostaCerta)){
           System.out.println("Ordenção correta!");
           System.out.println("Resposta Certa:");
           for (Integer res : respostaCerta) {
               System.out.print(res + " ");

           }
           System.out.print("\n");
           System.out.println("Saída:");
           for (Integer res : resposta) {
               System.out.print(res + " ");
           }
       }else{
           System.out.println("Ordenção feita de forma errada!");
           System.out.println("Resposta Certa:");
           for (Integer res : respostaCerta) {
               System.out.print(res + " ");
           }
           System.out.print("\n");
           System.out.println("Saída:");
           for (Integer res : resposta) {
               System.out.print(res + " ");
           }
       }
    }


}
