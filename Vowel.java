//Program to check whether the given character is a vowel or not.


class Vowel
{
public static void main(String[]args)
{
char ch='e';

String result= (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u') ? ("The character is a vowel") : ("The character is not a vowel");

System.out.println(result);
}
}


/*Output:
The character is a vowel.*/