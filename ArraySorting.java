package HW_3;

// Задача 2:
// На вход программы подаётся массив из чисел,
// необходимо вывести его в отсортированном виде с помощью метода пузырька.

import java.util.Arrays;

public class ArraySorting {
    private int[] arrMain;

    public ArraySorting(int[] arrMain) {
        this.arrMain = arrMain;
    }

    public int[] bubbleSort() {
        for (int i = 0; i < arrMain.length - 1; i++) {
            // внутренний цикл прохода
            for (int j = arrMain.length - 1; j > i; j--) {
                if (arrMain[j - 1] > arrMain[j]) {
                    int tmp = arrMain[j - 1];
                    arrMain[j - 1] = arrMain[j];
                    arrMain[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arrMain));
        return arrMain;
    }

    public static void main(String[] args) {
        int[] arr = {1,-9,3,23123,342,5,2,6,37,2,-23,43,-98};
        ArraySorting arraySorting = new ArraySorting(arr);
        arraySorting.bubbleSort();
    }
}



