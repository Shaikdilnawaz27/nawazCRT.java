import java.util.*;

public class Main

{
	
public static void main(String args[]) 
	
{
	   
 Scanner s=new Scanner(System.in);
	  
  int a,b;
	   
 System.out.println("Enter two values");
	    a=s.nextInt();
	  
  b=s.nextInt();
	    
System.out.println("Values before swapping"+a+""+b);
	    
int c=a;
	  
  a=a+b; //a=a*b;
	   
 b=a-b; //b=a/b;
	 
  a=a-b; //a=a//b;
	 
   System.out.println("values after swapping"+a+""+b);
	}

}