package bng.rogers.stringmanipulation;

public class Resolution001 {

    // Resolução do Primeiro problema:
    /*
    1. Write a Java program to get the character at the given index within the string.
    Sample Output:
    Original String = Java Exercises!
    The character at position 0 is J
    The character at position 10 is i
    */

    // Gerando a Resposta do problema
    public void resposta(String argumento)
    {
        inicialState(argumento);
        System.out.println(makeSentenceWithString(argumento,0));
        System.out.println(makeSentenceWithString(argumento,10));
    }
    // Retirando a Letra do numero fornecido
    public Character getCharFromString(String argumento, int numero)
    {
        return argumento.charAt(numero);
    }
    // Fazendo a frase de resposta
    public String makeSentenceWithString(String argumento, int numero)
    {
        Character letra = getCharFromString(argumento,numero);
        return "The character at position " + numero + " is " + letra;
    }

    public void inicialState(String argumento)
    {
        System.out.println("Original string : "+ argumento);
    }

}
