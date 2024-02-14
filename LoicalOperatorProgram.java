class LoicalOperatorProgram
{

  public static void main(String[] lop)
 {
  

  boolean no1= true;
  boolean no2= false;
  
  System.out.println( no1 && no1 || no1 && no1 || no1 && no2);//true

  System.out.println( no2 && no2 || no1 && no1 || no2 && no2);//true

  System.out.println( no2 && no2 || no2 && no2 || no1 && no2);//false

  System.out.println( no1 && no2 || no2 && no1 || no1 && no1);//true
  

  }

}



/*Output:
Compile time: Sucessful
Runtime:  true
          true
          false
          true*/