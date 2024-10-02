public class Main {
    /*
    Yo! Remember these Golden Rules while using Recursion 📜

        1. Write a Break Statement/ Base Case.
        2. Then, Write the recursive calls.

    See, Recursion (Without base-case) is like a car. With no breaks, It leads to accidents (Stack-Overflow Errors 🥴).
    So, Add break First. Then write a logic on when the break has to be applied.
    Then, And only then, Write the recursive calls.
    */

    public static void main(String[] args) {
    }

    // Factorial
    public static int factorial(int n) {
      if(n <= 1) return n; // Base Case
      return n * factorial(n-1); // Recursive Call
    }

    // Sum of N Natural Numbers
    public static int sumOfN(int n) {
        if(n <= 1) return n;
        return n * sumOfN(n-1);
    }

    // Fibonacci Series
    public static int fibo(int n) {
        if(n <= 1) return n;
        return fibo(n-2) + fibo(n-1);
    }

    // Power Calculation
    public static int powerOf(int a, int b) {
        if(b == 1) return a;
        return a * powerOf(a, b-1);
    }

    //isPalindrome? Find out.
    public static boolean isPalindrome(String str) {
        if(str.length() <= 1) return true;
        return str.charAt(0) == str.charAt(str.length()-1) &&
                isPalindrome(str.substring(1, str.length()-1));
    }

    // Sum of Array
    public static int sumOfArray(int[] arr, int n) {
        if(n <= 0) return 0;
        return arr[n-1] + sumOfArray(arr, n-1);
    }

    // Reverse String
    public static String revStr(String str) {
        if(str.isEmpty()) return "";
        return str.charAt(str.length()-1) + revStr(str.substring(0, str.length()-1));
    }


}