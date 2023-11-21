public class SortingAlgorithms {
    // Bubble Sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap temp and array[i]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    // Selection Sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    // Quick Sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);

            // Recursively sort elements before and after the partition
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;

                // swap arr[i] and arr[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // Merge Sort
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = (left + right) / 2;

            // Recursively sort both halves
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            // Merge the sorted halves
            merge(array, left, middle, right);
        }
    }

    private static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Create temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; ++i) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArray[j] = array[middle + 1 + j];
        }

        // Merge the temporary arrays

        // Initial indexes of the two sub-arrays
        int i = 0, j = 0;

        // Initial index of the merged sub-array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray[], if there are any
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArray[], if there are any
        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Utility method to print an array
    public static void printArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        // Bubble Sort
        System.out.println("Bubble Sort:");
        bubbleSort(array);
        printArray(array);

        // Insertion Sort
        int[] arrayInsertion = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\nInsertion Sort:");
        insertionSort(arrayInsertion);
        printArray(arrayInsertion);

        // Selection Sort
        int[] arraySelection = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\nSelection Sort:");
        selectionSort(arraySelection);
        printArray(arraySelection);

        // Quick Sort
        int[] arrayQuickSort = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\nQuick Sort:");
        quickSort(arrayQuickSort, 0, arrayQuickSort.length - 1);
        printArray(arrayQuickSort);

        // Merge Sort
        int[] arrayMergeSort = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("\nMerge Sort:");
        mergeSort(arrayMergeSort, 0, arrayMergeSort.length - 1);
        printArray(arrayMergeSort);
    }
}
