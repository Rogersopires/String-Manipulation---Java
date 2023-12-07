package bng.rogers.stringmanipulation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Andre001 {


    // Resolução do problema:
    /*
    Faça um programa que Leia um arquivo e conte as palavras deste arquivo e retorne o número de palavras encontradas no arquivo.
    */

    // Gerando a Resposta do problema

    //Verifica o caminho atual

//    public static void main() {
//        // Obtém o diretório de trabalho
//        String diretorioAtual = System.getProperty("user.dir");
//
//        // Exibe o diretório de trabalho
//        System.out.println("O programa está no diretório: " + diretorioAtual);
//    }

    // Verifica se o arquivo está na pasta certa
//        public static void main() {
//            String nomeArquivo = "teste.txt";
//
//            // Obtém o diretório de trabalho
//            String diretorioAtual = System.getProperty("user.dir");
//
//            // Cria um objeto File com o caminho completo do arquivo
//            File arquivo = new File(diretorioAtual, nomeArquivo);
//
//            // Verifica se o arquivo existe
//            if (arquivo.exists()) {
//                System.out.println("O arquivo '" + nomeArquivo + "' foi encontrado no diretório do programa.");
//            } else {
//                System.out.println("O arquivo '" + nomeArquivo + "' não foi encontrado no diretório do programa.");
//            }
//        }




    // Resolução do problema 001 do andre

    public static void main(String args) {
        String nomeArquivo = args +".txt";
        int numeroPalavras = contarPalavras(nomeArquivo);
        System.out.println("Número de palavras no arquivo "+ nomeArquivo + ": " + numeroPalavras);
    }
    public static int contarPalavras(String nomeArquivo) {
        int contador = 0;

        try {
            File arquivo = new File(nomeArquivo);
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);

            String linha;
            while ((linha = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(linha);
                contador += tokenizer.countTokens();
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return contador;
    }
}



