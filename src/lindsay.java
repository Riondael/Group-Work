
import java.util.Arrays;
import java.util.Scanner;
/**
 *Program to compare two lists to see if they are identical or not.
 * 
 * @author Lindsay Edgeman
 */
public class lindsay {
  /**
   * Main method
   * 
   * @param args arguments from the command line prompt 
   */
    public static void main(String[] args) {
      
         Scanner input = new Scanner(System.in);

        System.out.print("Enter list1: ");
       
        int size1 = input.nextInt();
        
        int[] list1 = new int[size1];
       
        for(int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter list2: ");
       
        int size2 = input.nextInt();
        
        int[] list2 = new int[size2];
       
        for(int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }
        System.out.println("the two lists are " + (equals(list1, list2) ? "" : "not") + "strictly identical");
    }

    public static boolean equals(int[] list1, int[] list2) {
        return Arrays.equals(list1, list2);
    }

}
