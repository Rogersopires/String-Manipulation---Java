package bng.rogers.stringmanipulation;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Andre003 {
    // Resolução do problema:
    /*
    Faça um programa que Leia um arquivo Encontre todas as datas no texto desse arquivo e retorne uma lista dessas datas no formato dd/MM/aa.
    */
    // Resolução do problema 001 do andre


    public static void main(String arquivo) {
        String caminhoDoArquivo = arquivo + ".txt";

        try {
            List<String> datasEncontradas = encontrarDatasNoArquivo(caminhoDoArquivo);

            System.out.println("Datas encontradas:");
            for (String data : datasEncontradas) {
                System.out.println(data);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    private static List<String> encontrarDatasNoArquivo(String caminhoDoArquivo) throws IOException {
        List<String> datasEncontradas = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                List<String> datasNaLinha = extrairDatasDaLinha(linha);
                datasEncontradas.addAll(datasNaLinha);
            }
        }

        return datasEncontradas;
    }

    private static List<String> extrairDatasDaLinha(String linha) {
        List<String> datasEncontradas = new ArrayList<>();
        String padraoData = "\\b\\d{1,2}/\\d{1,2}/\\d{2}\\b";

        Pattern pattern = Pattern.compile(padraoData);
        Matcher matcher = pattern.matcher(linha);

        while (matcher.find()) {
            String dataEncontrada = matcher.group();
            datasEncontradas.add(dataEncontrada);
        }

        return datasEncontradas;
    }
}

