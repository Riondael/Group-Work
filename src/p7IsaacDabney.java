//Owner: Isaac Dabney
import java.util.Arrays;
import java.util.Scanner;
public class p7IsaacDabney 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount of #'s to be read>> ");
        int[] array = new int[input.nextInt()];
        readArray(array, input);
        System.out.printf("The average is: %s", + calculateAverage(array, input));
        showArray(array);
    }
    public static void readArray(int[] array, Scanner input)
    {
        for(int x = 0; x < array.length; x++)
        {
            System.out.print("Enter Number>> "); 
            array[x] = input.nextInt();
        }
    }
    public static double calculateAverage(int[] array,Scanner input)
    {
        int sum = 0;
        for(int i = 0; i < array.length;i++)
        {
            sum += array[i];
        }
        double average = sum/array.length;
        return average;
    }
    public static void showArray(int[] array)
    {
        System.out.println(Arrays.toString(array));
    }
}
