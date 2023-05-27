import java.util.Scanner;
public class Task2 {

   
    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);
        System.out.println("please enter");
        int n = s.nextInt();
        int fib = evenFibonacciSum(n);
        System.out.println("The even Fib Sum is " +fib);
        
        
        
        
    }

    public static int evenFibonacciSum(int n) {
        if(n < 2){
         return n;
            }
        else{
            int fib;
            fib = evenFibonacciSum( n - 1 )+ evenFibonacciSum( n - 2 );
           int sum =  4* evenFibonacciSum( n - 1 )+ evenFibonacciSum( n - 2 );
           return sum;
        }
    }
}
       

   //DOES NOT WORK CORRECTLY
//I CAN GET IT TO DISPLAY THE FIBONACCI NUMBER BUT I CANT FIGURE OUT THE EVEWN SUM
