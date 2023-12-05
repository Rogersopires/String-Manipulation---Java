package bng.rogers.stringmanipulation;

public class Resolution005{


    // Resolução do Primeiro problema:
    /*
    5. Write a Java program to compare two strings lexicographically.
    Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions.

    Sample Output:

    String 1: This is Exercise 1
    String 2: This is Exercise 2
    "This is Exercise 1" is less than "This is Exercise 2"
    */

    // Gerando a Resposta do problema
    public void resposta(String argumento01 , String argumento02)
    {
        inicialState(argumento01,1);
        inicialState(argumento02,2);
        System.out.println(makeSentenceWithString(argumento01,argumento02));
    }
    public String makeSentenceWithString(String argumento01, String argumento02)
    {
        String text;
        if(argumento01.compareTo(argumento02)<0)
            {
                text = "\""+ argumento01 +"\" is less than \""+ argumento02 +"\"";
            } 
        else if (argumento01.compareTo(argumento02)>0)
            {
                text = "\""+ argumento01 +"\" is more than \""+ argumento02 +"\"";
            }
        else 
            {
                text = "\""+ argumento01 +"\" is equal than \""+ argumento02 +"\"";
            }
        return text;
    }
    public void inicialState(String argumento, int num)
    {
        System.out.println("String " + num + " : "+ argumento);
    }
}
