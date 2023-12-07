package bng.rogers.stringmanipulation;

public class Resolution004 extends Resolution001{
    // Resolução do problema:
    /*
    1. Write a Java program to get the character at the given index within the string.
    Sample Output:
    Original String = Java Exercises!
    The character at position 0 is J
    The character at position 10 is i
    */

    //A resposta fornecida pelo exercicio faz zero sentido (ele conta em relação a distancia na string fornecida e não o tamanho real da string)

    // Gerando a Resposta do problema
    @Override
    public void resposta(String argumento)
    {
        inicialState(argumento);
        codePointCounter(argumento);
    }

    public void codePointCounter(String args)
    {
        System.out.print("Codepoint count = " + args.codePoints().count());
    }
}
