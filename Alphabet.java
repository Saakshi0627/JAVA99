// Check whether the character is an Alphabet


class Alphabet
{
 public static void main(String[]args)

{

char a='S';

String result= ((a>=65 && a<=90)||(a>=97 && a<=122)) ? ("The character is an Alphabet") : ("The character is not an Alphabet");

System.out.println(result);

}

}



//Output:
The character is an Alphabet.