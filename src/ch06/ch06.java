public class ch06 {
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    void SelectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void InsertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        ch06 sort = new ch06();
        int bs_arr[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int is_arr[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int ss_arr[] = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        sort.bubbleSort(bs_arr);
        sort.InsertionSort(is_arr);
        sort.SelectionSort(ss_arr);

        System.out.println("Hasil Pengurutan Array");

        System.out.print("Bubble Sort : ");
        sort.printArray(bs_arr);
        System.out.print("Insertion Sort : ");
        sort.printArray(is_arr);
        System.out.print("Selection Sort : ");
        sort.printArray(ss_arr);

    }
}
