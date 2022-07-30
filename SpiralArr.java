package HW_3;

// Задача 5:
// На вход подаётся одно число n = размеру квадратной матрицы,
// на выходе должен получиться массив из чисел от 1 до n выведенный по спирали.


public class SpiralArr {
    private int[][] arrMain;
    private int sideLengthOfArr;
    public SpiralArr(int sideLengthOfArr) {
        this.sideLengthOfArr = sideLengthOfArr;
        this.arrMain = new int[sideLengthOfArr][sideLengthOfArr];
    }

    public int[][] spiralSort() {
        int maxElementIndex = sideLengthOfArr * sideLengthOfArr;
        int i, j, k = 1, wallSize = 0;


        do
        {
            for (j = wallSize; j < sideLengthOfArr - wallSize; j++) {
                if (k > maxElementIndex)
                    break;
                arrMain[wallSize][j] = k++;
            }

            for(i=wallSize+1;i<sideLengthOfArr-wallSize;i++) {
                if(k > maxElementIndex)
                    break;
                arrMain[i][sideLengthOfArr - wallSize - 1] = k++;
            }

            for(j = sideLengthOfArr - wallSize - 2; j >= wallSize; j--) {
                if(k > maxElementIndex)
                    break;
                arrMain[sideLengthOfArr - wallSize - 1][j] = k++;
            }

            for(i = sideLengthOfArr - wallSize - 2; i > wallSize; i--) {
                if(k > maxElementIndex)
                    break;
                arrMain[i][wallSize] = k++;
            }

            wallSize++;
        }
        while(k <= (sideLengthOfArr * sideLengthOfArr));


        for (i = 0; i < arrMain.length; i++) {
            for (j = 0; j < arrMain[i].length; j++) {
                System.out.print("\t" + arrMain[i][j] + "\t");
            }
            System.out.println();
        }

        return arrMain;
    }


    public static void main(String[] args) {
        SpiralArr spiralArr = new SpiralArr(8); // задай размерность массива
        spiralArr.spiralSort();
    }
}
