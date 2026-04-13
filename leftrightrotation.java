class RotateArray {
    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5};
        int n = 2; // positions to rotate

        // Left rotate
        System.out.print("Left Rotate: ");
        for (int i = n; i < a.length; i++) System.out.print(a[i] + " ");
        for (int i = 0; i < n; i++) System.out.print(a[i] + " ");

        System.out.println();

        // Right rotate
        System.out.print("Right Rotate: ");
        for (int i = a.length - n; i < a.length; i++) System.out.print(a[i] + " ");
        for (int i = 0; i < a.length - n; i++) System.out.print(a[i] + " ");
    }
}
