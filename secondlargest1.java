class Main {
    public static void main(String[] args) {
        int[] a = {10, 5, 20, 8, 15};
        int max=a[0], smax=Integer.MIN_VALUE;
        int min=a[0], smin=Integer.MAX_VALUE;

        for (int x : a) {
            if (x>max) {smax=max; max=x;}
            else if (x>smax && x!=max) smax=x;

            if (x<min) {smin=min; min=x;}
            else if (x<smin && x!=min) smin=x;
        }

        System.out.println("2nd Smallest: " + smin);
        System.out.println("2nd Largest: " + smax);
    }
}
