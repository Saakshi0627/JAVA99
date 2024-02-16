//Ternary operator 

class Large_No
{
public static void main(String[]args)
{
int a=24;
int b=50;
int c=16;
int d=27;


int largest= (a>b && a>c && a>d) ? (a) : ((b>c && b>d) ? (b) : ((c>d)?(c):(d)));

System.out.println(largest);
}
}


//Output: 50