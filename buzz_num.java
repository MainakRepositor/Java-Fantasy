import java.util.Scanner;  
  
//create FindAllBuzzNumber class to get all the Buzz number in a given range  
class FindAllBuzzNumbers  
{  
    //main() method start  
    public static void main(String args[])  
    {  
        int range;  
          
        //create scanner class object  
        Scanner sc=new Scanner(System.in);  
          
        //show custom message  
        System.out.println("Enter the value of range");  
          
        //store user entered value into variable range  
        range = sc.nextInt();  
  
        for(int i = 1; i <= range; i++)  
            checkNumber(i);  
    }  
  
     // create checkNumber() method to check Buzz number  
    static void checkNumber(int number)   
    {   
        // check whether the number ends with 7, is divisible by 7 or not  
        if(number % 10 == 7 || number % 7 == 0)  
            System.out.println(number + " is an Buzz number");  
    }  
  
}  