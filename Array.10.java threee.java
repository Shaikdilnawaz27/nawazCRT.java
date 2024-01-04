import java.util.*;

public class Main

{
	
public static void main(String[] args) 
	
{
	    
Scanner s=new Scanner(System.in);
	   
 int a[][], i,j,n,sum=0;
	   
 n=s.nextInt();
	  
  a=new int[n][n];
	 
   System.out.println("Enter n Elements");
		
for (i=0;i<n;i++)
		
{
		 
   for(j=0;j<n;j++)
		
{
		    
a[i][j]=s.nextInt();
		
}
		
}
		   
 System.out.println(" Matrix is");
		 
   for(i=0;i<n;i++)
		 
   {
		      
  for (j=0;j<n;j++)
		      
  {
		        
   if(i+j==n)
		          
 {
		              
 sum=sum+a[i][j];
		         
  }
		   
 }
		    
		
}
	      
System.out.println(sum);
		    
		
}

}
