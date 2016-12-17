/**
 * @author Raffi
 */

import java.util.Scanner;

public class permutations {

    public static void permute(int[] array, int num) {

        if (num == array.length) {

            for (int i = 0; i < array.length; i++) {
                System.out.print(" " + array[i] + " ");
            }

            System.out.println();

        } else {

            for (int i = num; i < array.length; i++) {
                int temp = array[num];
                array[num] = array[i];
                array[i] = temp;

                permute(array, num + 1);

                temp = array[num];
                array[num] = array[i];
                array[i] = temp;
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N: ");

        int value = sc.nextInt();
        int[] parameters = new int[value];

        for (int i = 0; i < value; i++)
            parameters[i] = i + 1;

        System.out.println("Permutations:");

        permute(parameters, 0);
        sc.close();
    }
}


