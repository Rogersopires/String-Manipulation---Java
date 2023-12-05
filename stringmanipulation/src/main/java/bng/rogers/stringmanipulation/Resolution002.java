package bng.rogers.stringmanipulation;

public class Resolution002 {
    // Resolução do Primeiro problema:
    /*
    2. Write a Java program to get the character (Unicode code point) at the given index within the string.

    Sample Output:

    Original String : w3resource.com
    Character(unicode point) = 51
    Character(unicode point) = 101
    */

    // Gerando a Resposta do problema
    public static void resposta(String argumento)
    {
        Resolution001.inicialState(argumento);
        System.out.println(makeSentenceWithString(argumento,1));
        System.out.println(makeSentenceWithString(argumento,9));
    }
    public static int transformStringtoUnicodePoint(String argumento, int num)
    {
        return argumento.codePointAt(num);
    }
    public static String makeSentenceWithString(String argumento, int num)
    {
        int letra = transformStringtoUnicodePoint(argumento,num);
        return "The character at position " + num + " in UniCode is " + letra;
    }
}
