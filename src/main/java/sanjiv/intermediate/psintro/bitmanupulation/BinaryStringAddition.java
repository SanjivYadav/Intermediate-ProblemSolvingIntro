package sanjiv.intermediate.psintro.bitmanupulation;

/*
* Add Binary Strings
*
* problem Description
        Given two binary strings, return their sum (also a binary string).
        Example:

        a = "100"

        b = "11"
        Return a + b = "111".
* */
public class BinaryStringAddition {
    public static void main(String[] args) {
        String a = "100";
        String b = "11";
        String result = addTwoBinaryString(a,b);
        System.out.println("Addition of two binary strings are : "+ result);
    }

    private static String addTwoBinaryString(String a, String b){
        StringBuilder sb = new StringBuilder();
        int aLength = a.length()-1;
        int bLength = b.length()-1;
        int carry=0;
        while(aLength >=0 || bLength >=0){
            int ac = aLength >=0 ? a.charAt(aLength)-'0':0;
            int bc = bLength >=0 ? b.charAt(bLength)-'0' : 0;
            int d = (ac+bc+carry)%2;
            sb.append(d);
            carry = (ac+bc+carry)/2;
            aLength--;
            bLength--;

        }
        while(carry >0){
            sb.append(carry%2);
            carry = carry/2;
        }
        return sb.reverse().toString();
    }
}
