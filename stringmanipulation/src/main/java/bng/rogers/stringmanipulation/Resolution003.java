package bng.rogers.stringmanipulation;

public class Resolution003 extends Resolution002 {

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