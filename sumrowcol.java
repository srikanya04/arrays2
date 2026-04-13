class Main {
    public static void main(String args[]) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        
        for(int i=0;i<3;i++) {
            int rowSum=0, colSum=0;
            for(int j=0;j<3;j++) {
                rowSum += a[i][j];
                colSum += a[j][i];
            }
            System.out.println("Row " + i + " sum = " + rowSum);
            System.out.println("Col " + i + " sum = " + colSum);
        }
    }
}
