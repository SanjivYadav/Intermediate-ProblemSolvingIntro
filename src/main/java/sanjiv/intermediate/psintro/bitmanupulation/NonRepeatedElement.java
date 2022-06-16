package sanjiv.intermediate.psintro.bitmanupulation;

/*
* Given an array where all the elements are repeated twice except one element, find that element
*
*
* */
public class NonRepeatedElement {
    public static void main(String[] args) {
        int[] arr = {3,5,8,6,5,3,6};
        int result = findNonRepeatedElement(arr);
        System.out.println("Non repeated element is : "+result);
    }

    private static int findNonRepeatedElement(int[] arr){
        int x =0;
        for(int element : arr){
            x = x^element;
        }
        return x;
    }
}
