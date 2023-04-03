import java.io.*;
public class Arithmetic
{
    
    public static void main(String[]args) throws IOException
    {
    int a ;
    int b ;
     System.out.println("Enter the first number");
     
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
   
     a =Integer.parseInt(br.readLine());
      System.out.println("Enter the second  number");

     b =Integer.parseInt(br.readLine());
   
    int sum=(a+b);
    System.out.println("The sum of two numbers is:" + sum);
    int subtract=(a-b);
    System.out.println("The difference of the two numbers is:" + subtract);
    int product= (a * b);
    System.out.println("The product of two numbers is:" + product);
    int division= (a / b);
    System.out.println( "The division of the two numbers is:" + division);
    int modulus= (a % b);
    System.out.print("The modulus of the two numbers is:" + modulus);


}
}