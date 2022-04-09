package week10;

public class CountOfEven {
    public static void main(String[] args) {
int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(countOfEvenNumber(arr));

    }

    public static int countOfEvenNumber(int[] arr) {
        int count = 0;

        for (int each : arr) {
            if (each % 2 == 0) {
                count++;
            }
        }
        return count;
    }

}
