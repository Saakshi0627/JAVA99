/*Declare float or double variable as a temperature.
Check as per the given criteria and display the message:
 0-10   -    "very cold"
 10-20  -    "cold"
 20-30  -   "moderate"
 30-40  -   "summer"
 40-50  -   "very hot"*/



class Temperature
{
public static void main(String[]args)
{
double tem= 65.25;


String result = (tem>=0&&tem<=10) ? ("Very Cold") : ((tem>10&&tem<=20)?("Cold"):((tem>20&&tem<=30)?("Moderate"):((tem>30&&tem<=40)?("Summer"):("Very Hot"))));

System.out.println(result);
}

}

//Output: Very Hot