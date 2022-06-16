package sanjiv.intermediate.psintro;

import java.util.Scanner;

/*
* Prime numbers are the numbers which are divisible by 1 and itself.
* It means that there only two factors (1 and no itself) for prime number.
*
*/
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = false;
        isPrime = isPrimeBruteForce(n);
        System.out.println("Brute Froce Approach : Number is Prime :"+isPrime);
        isPrime = false;
        isPrime = isPrimeAfterOptimization(n);
        System.out.println("Optimized approach : Number is prime :"+isPrime);
    }

    private static boolean isPrimeBruteForce(int n){
        int count_no_of_factor =0;
        for(int i=1;i<=n;i++){
            if(n%i == 0)
                count_no_of_factor++;

        }
        if(count_no_of_factor == 2)
            return true;
        return false;
    }

    private static boolean isPrimeAfterOptimization(int n){
        if(n==1)
            return true;
        for(int i=2; i*i <= n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
