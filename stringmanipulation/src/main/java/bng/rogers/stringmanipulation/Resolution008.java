package bng.rogers.stringmanipulation;

public class Resolution008 extends Resolution001{
    // Resolução do  problema:
    /*
    8. Write a Java program to test if a given string contains the specified sequence of char values.
    Sample Output:
    Original String: PHP Exercises and Python Exercises
    Specified sequence of char values: "and"
    true
    */
    public void resposta(String args, String args2)
    {
        inicialState(args);
        System.out.println(containsOnSentence(args,args2));
    }
    public String containsOnSentence(String args, String args2)
    {
        if(args.contains(args2))
        {
            return "A palavra "+ args2 + " está contido na frase: "+ args;
        }
        else
        {
            return "A palavra "+ args2 + " não está contido na frase: "+ args;
        }

    }
}
