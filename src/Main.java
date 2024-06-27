import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("==========Bài 1===========");
        int[] arr = {2,3,0,1,0,1,2,2,3,0,5, 7, 8};
        // {1,0,2,2,3,0,5} => j = 0, i = 0 , is = false
        // {1,0,2,2,3,0,5} => j = 1, i = 1 , is = true
        // {1,2,0,2,3,0,5} => j = 1, i = 1 , is = true
        System.out.println("Hello world!" + Arrays.toString(moveZeroToLast(arr)));

        System.out.println("==========Bài 2===========");
        int a = 1247;
        System.out.println("Input : " + Integer.toString(a));
        System.out.println("Check all digits is odd : " + checkAllIsOdd(a));

        System.out.println("==========Bài 3===========");
        int b = -2;
        System.out.println("Input : " + Integer.toString(b));
        System.out.println("Get first digit of Int : " + getFistDigitInNum(b));

    }

    // Bài 1
    public static int[] moveZeroToLast(int[] inputArr) {
        boolean isFirstZero = false;
        int j = 0;
        for(int i = 0; i < inputArr.length; i++ ) {
            // lấy vị trí số 0 đầu tiên , chỉ lấy 1 lần
            if(inputArr[i] == 0 && !isFirstZero) {
                j = i;
                isFirstZero = true;
            }

            // đổi chỗ 2 value, tăng vị trí 0 lên 1.
            if(inputArr[i] != 0 && isFirstZero) {
                int temp = inputArr[i];
                inputArr[i] = inputArr[j];
                inputArr[j] = temp;
                j++;
            }
        }
        return  inputArr;
    }

    // Bài 2
    public static boolean checkAllIsOdd(int inputInt) {
        if(inputInt > -10 && inputInt < 10) return inputInt % 2 != 0;

        while (true) {
            int digit = inputInt % 10;
            if(digit % 2 == 0) return false;
            if(inputInt < 10 && inputInt > -10) {
                break;
            }
            inputInt = inputInt / 10;
        }

        return true;
    }

    // Bài 3
    public static int getFistDigitInNum(int inputInt) {
        if(inputInt > -10 && inputInt < 10) return inputInt;

        while (true) {
            inputInt = inputInt / 10;
            if(inputInt < 10 && inputInt > -10) {
                return inputInt;
            }
        }
    }
}