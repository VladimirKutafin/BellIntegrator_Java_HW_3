package HW_3;

// Задача 1:
// На вход программы подаётся массив чисел,
// необходимо сделать вывод массива в обратном порядке.


import java.util.Arrays;

public class ReversArr {
    private int[] arrMain;

    public ReversArr(int[] arrMain) {
        this.arrMain = arrMain;
    }

    public void revers() {
        int[] arrRevers = new int[arrMain.length];
        int j = 0;
        for (int i = arrMain.length-1; i >= 0; i--) {
            arrRevers[j] = arrMain[i];
            j++;
        }
        System.out.println(Arrays.toString(arrRevers));
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5,3,6,343,2,1};
        ReversArr reversArr = new ReversArr(arr);
        reversArr.revers();
    }
}
