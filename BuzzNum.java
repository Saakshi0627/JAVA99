//Check whether the given number is a Buzz num or not.(only for two numbers)


class BuzzNum
{

public static void main(String[]args)
{

int num=27;

//For Buzz number : Number should be divisible of 7 nd last digit should be 7.


String result= (num%7==0 || num%10==7) ? ("The number is a Buzz number") : ("The number is not a Buzz number");

System.out.println(result);

}

}

//Output:The number is a Buzz number