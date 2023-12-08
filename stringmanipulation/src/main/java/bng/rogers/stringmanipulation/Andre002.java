package bng.rogers.stringmanipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Andre002 {
    // Resolução do problema:
    /*
    Faça um programa que Leia um arquivo com estrutura chave valor e Storni o valor da chave requisitado.
    */
    // Resolução do problema 001 do andre

    public static void estornarValor(String arquivo, String chave) {
        String caminhoArquivo = arquivo + ".txt";
        String chaveRequisitada = chave;

        try {
            Map<String, String> mapaChaveValor = lerArquivoChaveValor(caminhoArquivo);

            // Verifica se a chave requisitada existe no mapa
            if (mapaChaveValor.containsKey(chaveRequisitada)) {
                String valor = mapaChaveValor.get(chaveRequisitada);
                System.out.println("Valor associado à chave '" + chaveRequisitada + "': " + valor);
            } else {
                System.out.println("Chave '" + chaveRequisitada + "' não encontrada no arquivo.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Map<String, String> lerArquivoChaveValor(String caminhoArquivo) throws IOException {
        Map<String, String> mapaChaveValor = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split("=");
                if (partes.length == 2) {
                    String chave = partes[0].trim();
                    String valor = partes[1].trim();
                    mapaChaveValor.put(chave, valor);
                }
            }
        }

        return mapaChaveValor;
    }
}

