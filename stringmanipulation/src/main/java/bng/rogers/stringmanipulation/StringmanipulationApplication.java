package bng.rogers.stringmanipulation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StringmanipulationApplication {
	public static void main(String[] args) throws IOException {
		//SpringApplication.run(StringmanipulationApplication.class, args);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Qual resposta quer saber?");
		try {
				int i = Integer.parseInt(br.readLine());
				resolutions(i);
			}
		catch(NumberFormatException nfe)
			{
				System.err.println("Invalid Format!");
			}
		}
	public static void resolutions (int num)  throws IOException
	{
		switch (num)
		{
			case 1:
				String string001 = "Java Exercises!";
				Resolution001 resposta001 = new Resolution001();
				resposta001.resposta(string001);
				break;
			case 2:
				String string002 = "w3resource.com";
				Resolution002 resposta002 = new Resolution002();
				resposta002.resposta(string002);
				break;
			case 3:
				String string003 = "w3resource.com";
				Resolution003 resposta003 = new Resolution003();
				resposta003.resposta(string003);
				break;
			case 4:
				String string004 = "teste de como isso pode funcionar";
				Resolution004 resposta004 = new Resolution004();
				resposta004.resposta(string004);
				break;
			case 5:
				String string005f1 = "This is Exercise 1";
				String string005f2 = "This is Exercise 2";
				Resolution005 resposta005 = new Resolution005();
				resposta005.resposta(string005f1,string005f2);
				break;
			case 6:
				String string006f1 = "This is Exercise 1";
				String string006f2 = "This is Exercise 1";
				Resolution005 resposta006 = new Resolution006();
				resposta006.resposta(string006f1,string006f2);
				break;
			case 7:
				String string007f1 = "PHP Exercises and ";
				String string007f2 = "Python Exercises";
				Resolution007 resposta007 = new Resolution007();
				resposta007.resposta(string007f1,string007f2);
				break;
			case 8:
				BufferedReader newBuffer = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Qual palavra quer comparar?");
                String rp008 = newBuffer.readLine();
                String string008 = "PHP Exercises and Python Exercises";
				Resolution008 resposta008= new Resolution008();
				resposta008.resposta(string008,rp008);
				break;
			case 201:
				BufferedReader andreBuff = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Qual o nome do arquivo a ser contado?");
				String textLer = andreBuff.readLine();
				Andre001.contadorDePalavras(textLer);
				break;
			case 202:
				BufferedReader andreBuff2 = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("Qual o nome do arquivo a ser contado?");
				String textLer2 = andreBuff2.readLine();
				System.out.print("Qual a palavra chave?");
				String palavrachave = andreBuff2.readLine();
				Andre002.estornarValor(textLer2,palavrachave);
				break;
		}
	}
}

