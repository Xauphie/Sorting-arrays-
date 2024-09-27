import java.util.Arrays;//Importing the Arrays class
public class ArraySort{
  public static void main(String args[]) {
 //Declaring and initializing an array
 int[] numbers={42,15,8,23,4};
      Arrays.sort(numbers);
      reverseArray(numbers);
 
     System.out.println(Arrays.toString(numbers));
  }
  
  public static void reverseArray(int[] arr) {
    int start = 0;
    int end = arr.length - 1;
    while (start < end) {
      int temp = arr[start];
      arr[start] = arr[end];
      arr[end] = temp;
      start++;
      end--;
    }
  }
}
