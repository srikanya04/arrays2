class Main {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 8, 15};

        for (int i=0;i<a.length;i++) {
            for (int j=i+1;j<a.length;j++) {
                if (a[i]>a[j]) {
                    int t=a[i]; a[i]=a[j]; a[j]=t;
                }
            }
        }
        System.out.println("2nd Smallest: " + a[1]);
        System.out.println("2nd Largest: " + a[a.length-2]);
    }
}
