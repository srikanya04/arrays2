class Main {
    public static void main(String args[]) {
        int[][] a =new int [][] {
            {3, 5, 2},
            {7, 1, 9},
            {4, 8, 6}
        };

        for (int i = 0; i < a.length; i++) {
            int max = a[i][0];
            for (int j = 1; j < a.length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println("Row " + (i+1) + " max = " + max);
        }
    }
}
