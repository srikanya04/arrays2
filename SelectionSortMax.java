class SelectionSortMax {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        for (int x = 0; x < arr.length - 1; x++) {
            int maxIndex = x;

            // find maximum in remaining array
            for (int j = x + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap with current x
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[x];
            arr[x] = temp;
        }

        // print result
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
 