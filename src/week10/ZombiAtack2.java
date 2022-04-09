package week10;

import java.util.Scanner;
import java.util.Arrays;

public class ZombiAtack2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(),};

        int day = 0;
        int[] extinct = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

        while (!Arrays.equals(inhabitants, extinct)) {
            System.out.println("Day " + day++ + " " + Arrays.toString(inhabitants));

            int[] temp = Arrays.copyOf(inhabitants, inhabitants.length);

            for (int i = 0; i < inhabitants.length; i++) {
                if (temp[i] == 0) {
                    if (i > 0)
                        inhabitants[i - 1] /= 2;
                    if (i < inhabitants.length - 1)
                        inhabitants[i + 1] /= 2;
                }
            }
        }
        System.out.println("Day " + day + " " + Arrays.toString(inhabitants));
        System.out.println("---- EXTINCT ----");


    }
}

