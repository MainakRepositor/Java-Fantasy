public class arr7 {
    public static void main(String[] args) {  
  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3, 4, 5};  
  
        System.out.println("Elements of given array present on even position: ");  
        //Loop through the array by incrementing value of i by 2  
        //Here, i will start from 1 as first even positioned element is present at position 1.  
        for (int i = 1; i < arr.length; i = i+2) {  
            System.out.println(arr[i]);  
        }  
    }  
}
