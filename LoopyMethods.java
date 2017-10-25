/**
 * APCS - Loop Practice
 *
 * This program is to give you practice writing methods that use for loops. Your
 * task is to study the code and output for methods that I have completed. Then 
 * you should complete and test the methods that are incomplete or missing. 
 *
 *  1) firstTwenty     - uses a for loop to print the numbers from 1 to 20.
 *
 *  2) fiftyToOne      - uses a for loop to print the numbers from 50 to 1.
 *
 *  3) perfectSquares  - uses a for loop to print the first twenty perfect squares.
 *
 *  4) sumTwenty       - calculates the sum of the first 20 integers using a for loop.
 *
 *  5) sumN            - uses a for loop to find the sum of the first n integers. 
 *
 *  6) tenMultsOfTen   - uses a for loop to write the first ten multiples of
 *                       ten.
 *
 *  7) sumNEven        - uses a for loop to find the sum of the first n even integers.
 *                       (start at 2, not zero.)
 *
 *  8) countMtoN       - takes two integer parameters, m and n. The output shows
 *                       the count from m to n by ones. (The method should take two
 *                       integer parameters.)
 *
 *  9) iLoveJava       - uses a for loop to print the sentence "I love java." ten
 *                       times.
 *
 * 10) divBy4and5      - uses a uses a for loop to count from 1 to 200 by ones, but 
 *                       only values that are evenly divisible by 4 and 5 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 11) divBy3and7      - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 3 and 7 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 12) divBy5or7       - uses a for loop to count from 1 to 100 by ones, but only
 *                       values that are evenly divisible by 5 or 7 are printed.
 *                       (you'll need to use an if statement.)
 *
 * 13) sum3sAnd11s     - uses a for loop to count from 1 to 100000 by ones, but no
 *                       values are printed. The sum of just the numbers evenly 
 *                       divisible by 3 and 11 is printed.
 *
 * 14) sum5sOr9s       - uses a for loop to count from 1 to 100000 by ones, but no
 *                       values are printed. The sum of just the numbers evenly 
 *                       divisible by 5 or 9 is printed.
 *
 * 15) tenMonkeys      - uses a for loop to print the lyrics to 10 Little Monkeys
 *                       (http://kids.niehs.nih.gov/lyrics/tenmonk.htm)
 * 
 * 16) fibonacci       - uses a for loop to print the first n terms in the 
 *                       fibonacci sequence.
 *
 * 17) factorial       - uses a for loop to print the factorial of n.
 *
 *
 * Make sure your code follows variable and method naming conventions, is 
 * commented, and proper indentation is used.
 *
 *  ------------------------------------------------------------------------------
 *
 * @author  your name 
 * @version date
 */
 
 public class LoopyMethods
 {
    /**
     * This method prints the numbers from 1 to 20 using a for loop
     */
    public static void firstTwenty()
    {
        for (int i=1; i<=20; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    /**
     * This method uses a for loop to print the numbers from 100 to 1.
     */
    public static void hundredToOne()
    {
        for (int i=100; i<0; i--)
        {   
            System.out.print(i + " ");
        }
        System.out.println();
    }   
        
    /**
     * This method prints the first n perfect squares using a for loop
     */
    public static void perfectSquares(int n)
    {
        for (int i=1; i<=n; i++)
        {
            System.out.print(i*i + " ");
        }
        System.out.println();   
    }
    
    /**
     * This method calculates the sum of the first 20 integers using a for loop.
     */
    public static void sumTwenty()
    {
        int sum = 0;
        for (int i=1; i<=20; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
    /**
     * This method calculates the sum of the first n integers using a for loop
     */
    public static void sumN(int n)
    {
        int sum = 0;
        for (int i=1; i<= n; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
    public static void tenMultsOfTen()
    {
        for (int i=10; i<=100; i+=10)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void sumNEven(int n)
    {
        int sum = 2;
        for (int i=2 ; i<= n; i++)
        {
            sum = sum + i;
        }
        System.out.println(sum);
    }
    
    
    public static void countMtoN(int m, int n)
    {
        for (int i=m; i<=n; i=i+1) 
        {
            System.out.print(i + " ");
	}
	System.out.println();
    }
    
    
    
    public static void iLoveJava()
    {
        for (int i=0; i<10; i++)
	System.out.println("I love java.");
    }
    
    
    public static void divBy4and5()
    {
        for (int i=1; i<=200; i++)
            {
            if (i%4==0 && i%5==0)
            {
                System.out.println(i + " ");
            }
        }
    }
    
    
    // keep making methods here
    public static int factorial(int n)
    {
        int prod = 1;
        
        for (int i=1; i<=n; i++)
        {
            prod *= i;
        }
    
        return prod;
    }
    
    
    public static int factorial2(int n)
        {
        if (n<=1)
            return 1;
        else
            return n * factorial2(n - 1);
        }
    
    public static long fibonacci(int n)
    {
        long a = 0;
        long b = 1;
        
        for (int i=0; i<n; i++)
        {
            long c = a + b;
            a = b;
            b = c;
        }
        
        return a;
    }
    
    public static int fibonacci2(int n)
    {
        if (n==0)
          return 0;
        else if (n==1)
          return 1;
        else
          return fibonacci2(n-1) + fibonacci2(n-2);
    }
    
    public static void main(String[] args)
    {
        firstTwenty();
        hundredToOne();
        perfectSquares(12);
        sumTwenty();
        sumN(100);
        
        // test the rest of the methods here
        System.out.println(factorial(6));
        
        System.out.println(fibonacci(5));
    }
 
 }
 