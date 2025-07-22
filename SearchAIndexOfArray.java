import java.util.*;
public class SearchAIndexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array:");
        
        int [] arr = new int [size];
        for(int i = 0; i < size; i++) {
            arr[i] =sc.nextInt();   
        }
        int x = sc.nextInt();

        for(int i =0;i<arr.length;i++){
            if(arr[i] == x){
                System.out.println("Element found at index: " + i);
                
            }
        }
}
}