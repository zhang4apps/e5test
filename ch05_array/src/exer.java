public class exer {

    public void tezheng() {
        int[] a = new int[10];
        int sum = 0;
        int max = a[0];
        int min = Integer.MAX_VALUE;
        int avg = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 90) + 10;
            sum += a[i];
            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
            System.out.print(a[i] + "\t");
        }
        avg = sum / a.length;
        System.out.println("\nmax:" + max + "\nmin:" + min + "\nsum:" + sum + "\navg:" + avg);
    }

    public void dafen() {
        int[] a = new int[]{5, 4, 6, 8, 9, 0, 1, 2, 7, 3};
        int sum = 0;
        int max = a[0];
        int min = Integer.MAX_VALUE;
        int avg = 0;
        for (int i = 0; i < a.length; i++) {

            sum += a[i];
            if (max < a[i]) {
                max = a[i];
            }
        }
    }
}
