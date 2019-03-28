package lab2;

public class Main {
    public static void main(String[] args) {
        int size = args.length;
        double[] array = new double[size];
        System.out.print("Не сортированный массив: ");
        for (int i = 0; i < array.length; i++) {     //Преобразование строки пар-ов в массив
            array[i] = Double.parseDouble(args[i]);
        }
        printArray(array);                          // Печать не сортированного массива
        ArraySorter.sort(array);                 // Сортировка массива
        System.out.println();
        System.out.print("Cортированный массив: ");
        printArray(array);

        ArraySorter.sortFor(array);                 // Сортировка массива
        System.out.println();
        System.out.print("Cортированный массив: ");
        printArray(array);  // Печать сортированного массива

        ArraySorter.sortSelect(array);                 // Сортировка массива
        System.out.println();
        System.out.print("Cортированный массив методом вставки: ");
        printArray(array);  // Печать сортированного массива
    }

    private static void printArray(double []array){ //Метод вывода массива
        for (double element: array) {
            System.out.print(element + " ");
        }
    }
}
