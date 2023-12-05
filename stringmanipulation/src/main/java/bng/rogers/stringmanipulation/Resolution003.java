package bng.rogers.stringmanipulation;

public class Resolution003 extends Resolution002 {
    // Resolução do Primeiro problema:
    /*
    3. Write a Java program to get the character (Unicode code point) before the specified index within the string.

    Sample Output:

    Original String : w3resource.com
    Character(unicode point) = 119
    Character(unicode point) = 99


    Pergunta mal feita do kralho fiz uma resposta com os valores 1 e 9 conforme resposta do problema
    */

    // Gerando a Resposta do problema
    @Override
    public void resposta(String argumento)
    {
        inicialState(argumento);
        System.out.println(makeSentenceWithString(argumento, 1));
        System.out.println(makeSentenceWithString(argumento, 9));
    }
    @Override
    public  int transformStringtoUnicodePoint(String argumento, int num)
    {
        return argumento.codePointBefore(num);
    }
}