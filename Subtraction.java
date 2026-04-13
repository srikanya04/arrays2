class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{9,8,7},{6,5,4},{3,2,1}};

        int[][] sum = new int[3][3];
        int[][] sub = new int[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Sum:");
        for (int[] row : sum) {
            for (int x : row) System.out.print(x+" ");
            System.out.println();
        }

        System.out.println("Subtraction:");
        for (int[] row : sub) {
            for (int x : row) System.out.print(x+" ");
            System.out.println();
        }
    }
}
