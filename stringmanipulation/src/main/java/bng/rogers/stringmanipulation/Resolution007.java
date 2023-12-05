package bng.rogers.stringmanipulation;

public class Resolution007 extends Resolution005{

    // Resolução do Primeiro problema:
    /*
    7. Write a Java program to concatenate a given string to the end of another string.

    Sample Output:

    String 1: PHP Exercises and
    String 2: Python Exercises
    The concatenated string: PHP Exercises and Python Exercises
    */
    // Gerando a Resposta do problema
    @Override
    public String makeSentenceWithString(String argumento01, String argumento02)
    {
        return "The concatenated string: " + argumento01.concat(argumento02);
    }
}
