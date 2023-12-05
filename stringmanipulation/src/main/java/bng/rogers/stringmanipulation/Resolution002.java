package bng.rogers.stringmanipulation;

public class Resolution002 extends Resolution001{
    // Resolução do Primeiro problema:
    /*
    2. Write a Java program to get the character (Unicode code point) at the given index within the string.

    Sample Output:

    Original String : w3resource.com
    Character(unicode point) = 51
    Character(unicode point) = 101

    Pergunta mal feita do kralho fiz uma resposta mais completa mostrando todos os unicodes.
    */

    // Gerando a Resposta do problema
    public void resposta(String argumento)
    {
        inicialState(argumento);
        for (int i = 0; i<argumento.length();i++)
        {
            System.out.println(makeSentenceWithString(argumento, i));
        }
    }
    public int transformStringtoUnicodePoint(String argumento, int num)
    {
        return argumento.codePointAt(num);
    }
    public String makeSentenceWithString(String argumento, int num)
    {
        int letra = transformStringtoUnicodePoint(argumento,num);
        return "The character at position " + num + " in UniCode is " + letra;
    }
}
