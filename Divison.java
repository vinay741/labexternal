public class Division {
    public static void main(String[] args)
{
       double num1 = 10;  
        double num2 = 2;  
double result = divide(num1, num2);
  System.out.println("Division of " + num1 + " by " + num2 + " is: " + result);
    }
public static double divide(double a, double b) {
       if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return a / b;
    }
}

