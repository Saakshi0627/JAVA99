//A program to print percentage of five subjects.

class Percentage
{
public static void main(String[]args)
{
int sub_marks= 373; // 85+72+45+85+86
int total_marks= 500;  //100+100+100+100+100
float percentage= (sub_marks*100)/(total_marks);
System.out.println("Percentage is:"+ percentage);
System.out.println("Percentage is even: "+ (percentage%2==0));

}
}