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
	public static void resolutions(int num)
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
				String string004 = "w3resource.com";
				Resolution004 resposta004 = new Resolution004();
				resposta004.resposta(string004);
				break;
		}
	}
}

