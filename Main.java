#as

import java.io.*;
import java.util.*;
public class Main5
{
  public static void main(String args[])
  {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter an character");
    ch=sc.next().charAt(0);
    
      if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
      {
         
 
        System.out.println("The character is alphabeth");
       }
    else
    {
        System.out.println("The character is not alphabeth");
    }
  }
}
