class Pattern20  
{  
public static void main(String[] args)   
{  
int i, j, k, rows=9;  
for(i=1;i< rows+1 ;i++)  
{  
for(j=i; j < rows+1 ;j++)  
{  
System.out.print(j + " ");  
}  
for(k=1; k < i ;k++)  
{  
System.out.print(k + " ");  
}  
System.out.println();  
}  
}  
}  