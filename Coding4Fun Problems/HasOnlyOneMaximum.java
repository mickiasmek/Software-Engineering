package oop.exercise1;

public class HasOnlyOneMaximum {
    public static void main(String [] args){
        int[] a = {-6, 2,8, 5, -6, 5,8, 6};
        hasOnlyOneMaximum(a);

    }
    public static boolean hasOnlyOneMaximum(int[]a){
        if(a.length ==0) {System.out.println("False");return false;}
        int max = a[0]; int count = 0;
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        for (int j = 1; j<a.length;j++){
            if(max == a[j]){
                count ++;
            }
            if(count >1){
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return true;

    }
}
