import java.util.*;  
 
 class XylemPhloemExample  
{  
public static void main(String args[])  
{  
//the variable extreme_sum stores the sum of extreme digits   
//the variable mean_sum stores the sum of mean digits   
int num, extreme_sum = 0, mean_sum = 0, n;   
Scanner sc= new Scanner (System.in);  
System.out.print("Enter a number: ");  
//reading an integer from the user  
num = sc.nextInt();  
//finds the absolute value of the given number  
num = Math.abs(num);  
//copying the given number into n  
n = num;  
//the while loop executes until the specified condition becomes false  
while(n != 0)  
{  
//returns true if one of the conditions is true  
if(n == num || n < 10)  
//finds the last digit and add it to the variable extreme_sum  
extreme_sum = extreme_sum + n % 10;  
else  
//finds the mean digits and add it to the variable mean_sum  
mean_sum = mean_sum + n % 10;  
//removes the last digit from the number  
n = n / 10;  
}  
System.out.println("The sum of extreme digits: " + extreme_sum );  
System.out.println("The sum of mean digits: " + mean_sum);  
//comparing the sum of extreme digits and with the sum of mean digits  
if(extreme_sum  == mean_sum)  
//prints if sums are equal  
System.out.println(num + " is a xylem number.");  
else  
//prints if sums are not equal  
System.out.println(num + " is a phloem number.");  
}  
}  