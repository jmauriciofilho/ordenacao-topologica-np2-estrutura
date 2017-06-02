package ordenacaoTopologica;

import java.io.*;

/**
 * Created by mauricio on 02/06/17.
 */
public class Main {

    public static void main(String[] args) {
        InputStream input;
       // try {
            //input = new FileInputStream("entrada");
            File file = new File("entrada");
            System.out.println(file.canRead());
           // processa(input);
       // } catch (IOException e) {
         //   e.printStackTrace();
       // }
    }

    private static void processa(InputStream input) throws IOException {
        int numero = entrada(input);
        int resultado = ordena(numero);
        saida(resultado);
    }

    private static int entrada(InputStream input) throws IOException {
        InputStreamReader reader = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(reader);
        String s = br.readLine();
        br.close();
        return Integer.parseInt(s);
    }

    private static int ordena(int numero){
        return numero + 5;
    }

    private static void saida(int resultado) throws IOException {
        OutputStream os = new FileOutputStream("saida");
        OutputStreamWriter osw = new OutputStreamWriter(os);
        BufferedWriter bw = new BufferedWriter(osw);
        bw.write(Integer.toString(resultado));
        bw.close();
    }

}
