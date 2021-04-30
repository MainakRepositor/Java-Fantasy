import java.util.*;  
class AutobiographicalNumberExample  
{  
public static void main(String args[])   
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number you want to check: ");  
//reading an integer from the user to check  
int num = sc.nextInt();  
//determines the absolute value of the given number  
num = Math.abs(num);  
//assigning the value of num into variable n  
int n = num;  
//the valueOf() method returns the string representation of int argument  
String str = String.valueOf(num);  
//creates an array of digits  
int digitarray[] = new int[str.length()];  
for(int i = digitarray.length - 1; i >= 0; i--)  
{  
//determines the last digit of the given number      
digitarray[i] = n % 10;  
//removes the last digit  
n = n/10;  
}  
boolean flag = true;  
//an inner loop compares the iterator of the outer loop with each digit of the inner loop //if they are equal then increment the occurrence count of the digit  
for(int i = 0; i < digitarray.length; i++)  
{  
int count = 0;  
for(int j = 0; j < digitarray.length; j++)  
{  
if(i == digitarray[j])  
//increments the count by 1 if the above condition returns true  
count++;  
}  
if(count != digitarray[i])  
{  
flag = false;  
//breaks the execution if the condition becomes true  
break;  
}  
}  
if(flag)  
//prints if the status returns true  
System.out.println(num + " is an autobiographical number.");  
else  
//prints if status returns false  
System.out.println(num + " is not an autobiographical number.");  
}  
}  