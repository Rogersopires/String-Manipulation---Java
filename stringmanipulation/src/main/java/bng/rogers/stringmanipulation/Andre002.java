package bng.rogers.stringmanipulation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Andre002 {
    public static void main(String[] args) {
        String caminhoArquivo = "teste2.txt"; // Substitua pelo caminho real do seu arquivo
        String chaveRequisitada = "chave2"; // Substitua pela chave que você quer buscar

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
                // Divide a linha em chave e valor usando "=" como delimitador
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




}
