package Arrays;

public class FindDuplicate {

    static int findDuplicate(int[] arr) {
        int i = 0, j = 1;
        while (i < j) {
            if (arr[j] == arr[i]) {
                return arr[i];
            }
            i++;
            j++;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 4, 5 };
        int number = findDuplicate(arr);
        System.out.println(number);
    }
}
