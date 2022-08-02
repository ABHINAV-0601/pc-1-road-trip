package com.jap.fibonacci;

public class FibonacciSeries
{
    // Write the logic in the method to generate the next number in the Fibonacci series
    public long fibonacci(long number) {

        if(number < 0){
            return -1;
        }
        else if(number <= 1){
            return number;
        }
        else {
            return fibonacci(number-1) + fibonacci(number - 2);
        }


    }
    // Print the series inside the method
    public void printFibonacciSeries(long number){
        for (int i = 0; i < number; i++) {

            System.out.print(" " + fibonacci(i));
        }

    }
    public static void main( String[] args )
    {
        FibonacciSeries fib = new FibonacciSeries();
        // Call the  printFibonacciSeries() method and pass the value.
            fib.printFibonacciSeries(9);

    }
}
