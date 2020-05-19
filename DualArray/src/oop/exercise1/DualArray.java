package oop.exercise1;

public class DualArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,0,2,1,0,3};
        isDual(a);
    }
    public static boolean isDual(int[] a) {
        int count = 0; int sum = 0; int dualSum = a[0] + a[1];
        if (a.length % 4 == 0) {
            for (int value : a) {
                count++;
                sum += value;
                if (count == 2) {
                    if (dualSum != sum) {
                        System.out.println("Is not Dual");
                        return false;
                    }
                    sum = 0;
                    count = 0;
                }
            }
            System.out.println("Is Dual");
            return true;

        }
        System.out.println("Is not Dual");
        return false;

    }
}
