class Main {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] b = {{9,8,7},{6,5,4},{3,2,1}};
        int[][] mul = new int[3][3];

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                for (int k=0; k<3; k++) {
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Multiplication:");
        for (int[] row : mul) {
            for (int x : row) System.out.print(x+" ");
            System.out.println();
        }
    }
}
