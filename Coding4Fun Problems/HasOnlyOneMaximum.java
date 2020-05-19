package se.coding4fun;

public class HasOnlyOneMaximum {
    public static void main(String [] args){
        int[] a = {-6, 2,8, 5, -6, 5, 6};
        hasOnlyOneMaximum(a);

    }
    public static boolean hasOnlyOneMaximum(int[]a){
        if(a.length ==0) {System.out.println("False");return false;}
        int max = a[0]; int count = 0;
        for(int i=1; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
                count = 0;
                continue;
            }if(a[i] == max){
                count++;
            }
        }if(count>0){
            System.out.println("False");
            return false;
        }
        System.out.println("True");
        return true;

    }
}
