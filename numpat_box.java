import java.util.Scanner;  
class Pattern21   
{   
public static void main(String[] args)    
{   
int i, j, min, n; //n is the number up to you want to print  
System.out.print("Enter the value of n: ");  
Scanner sc= new Scanner(System.in);  
n=sc.nextInt();  
//loo for upper left part  
for (i = 1; i <= n; i++)    
{   
for (j = 1; j <= n; j++)   
{   
min = i < j ? i : j;   
System.out.print(n - min + 1+ " ");   
}  
//loop for upper right part  
for (j = n - 1; j >= 1; j--)   
{   
min = i < j ? i : j;   
System.out.print(n - min + 1+ " ");   
}   
System.out.println();   
}   
//loop for lower left part  
for (i = n - 1; i >= 1; i--)    
{   
for (j = 1; j <= n; j++)    
{   
min = i < j ? i : j;   
System.out.print(n - min + 1+ " ");   
}   
//loop for lower right part  
for (j = n - 1; j >= 1; j--)    
{   
min = i < j ? i : j;   
System.out.print(n - min + 1+ " ");   
}   
System.out.println();   
}   
}   
}   