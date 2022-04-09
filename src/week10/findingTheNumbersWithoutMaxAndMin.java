package week10;

public class findingTheNumbersWithoutMaxAndMin {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(findDifferenceNums(arr));
        System.out.println(CountOfEven.countOfEvenNumber(arr));
    }

    public static int findDifferenceNums(int[]arr) {
        int dif=0;
        int min=arr[0];  // int min=Integer.Max_Value;
        int max=arr[0];//int max= Integer.Min_Value;

        for(int each:arr){
            if(each<min){
                min=each;
            }
            if(each>max){
                max=each;
            }

        }
        return max-min;
    }
}
