# Reverseno
import java.io.*;
import java.util.*;
 public class Reversedno 
{
 
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
    int a;
 System.out.println(" Enter a number : ");
    a =sc.nextInt();   
    int number=a;
 int reverse=0;
 while (number != 0) 
{
int remainder = number % 10;
reverse = reverse * 10 + remainder;
number = number / 10;
}            
    System.out.println("The reversed number is:"+reverse);
    
    }
}
