package lab2;

public class ArraySorter {
    public static void sort(double[] array) {  //Метод сортировки
        int i;
        boolean hasSwapped = true;
        while (hasSwapped) {
            int nPairs = array.length;
            hasSwapped = false;
            nPairs--;
            i = 0;
            while (i < nPairs) {
                if (array[i] > array[i + 1]) {
                    swap(i, array);
                    hasSwapped = true;
                }
                i++;
            }
        }

    }

    public static double[] sortFor(double[] array) {  //Метод сортировки
        boolean hasSwapped = true;
        for (int nPairs = array.length; hasSwapped; nPairs--) {
            hasSwapped = false;
            for (int i = 1; i < nPairs - 1; i++) {
                if (array[i] > array[i + 1]) {
                    swap(i, array);
                    hasSwapped = true;
                }
            }
        }
        return array;
    }

    public static double[] sortSelect(double[] array) {//Метод сортировки
        int minIdx;
        for (int i = 0;i < array.length; i++) {
            double min = array[i];
            minIdx = 0;
            for (int j = i+1; j < array.length; j++) {

                if (min > array[j]) {
                    min = array[j];
                    minIdx = j;
                }
            }
            if (minIdx != 0){
                swapPair(i,minIdx,array);
            }
        }
        return array;
    }

    private static void swap(int i, double[] array) { //Метод Swap
        double tmp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = tmp;

    }

    private static void swapPair(int i,int j, double[] array) { //Метод Swap
        double tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}

