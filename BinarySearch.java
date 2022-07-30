package HW_3;

// Задача 3:
// На вход программы подаётся искомое число и отсортированный массив,
// необходимо реализовать алгоритм бинарного поиска для проверки того,
// что число присутствует в массиве.

public class BinarySearch {
    private int[] arrMain;

    public BinarySearch(int[] arrMain) {
        this.arrMain = arrMain;
    }

    public static int searchBin(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        // условие прекращения (элемент не представлен)
        while(firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // если средний элемент - целевой элемент, вернуть его индекс
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            }

            // если средний элемент меньше
            // направляем наш индекс в middle+1, убирая первую часть из рассмотрения
            else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            }
                // если средний элемент больше
                // направляем наш индекс в middle-1, убирая вторую часть из рассмотрения
            else if (arr[middleIndex] > elementToSearch) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,-9,6,8,34,2,-4,5,54,0};
        ArraySorting arraySorting = new ArraySorting(arr);
        int[] arrSort = arraySorting.bubbleSort();
        int index = BinarySearch.searchBin(arrSort, 8); // передай отсортированный массив и элемент который хочешь найти
        System.out.println("Search element index = " + index);
    }
}
