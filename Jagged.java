class Main
 {
    public static void main(String args[]) {
        int[][] a = {
            {1, 2, 3},    // row 1 → 3 elements
            {4, 5},       // row 2 → 2 elements
            {6, 7, 8, 9}  // row 3 → 4 elements
        };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
