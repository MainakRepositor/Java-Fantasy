import java.util.*;  
class Pattern6  
{  
public static void main(String[] args)  
{  
int i, j, rows;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows youy want to print: ");  
rows = sc.nextInt();  
for (i = rows; i >= 1; i--)  
{  
for (j = rows; j >= i; j--)  
{  
System.out.print(j+" ");  
}  
   
System.out.println();  
}  
}  
}  