public class Power {
  public static double power(double x, int n) {
   double power = 1;
     for (int i=0; i<n; i++){
     power = power*x;
     }
    return power;
  }
     


public static int Factorial(int n) {
    int result = n;
    if (n >= 1) {
        for (int i = n-1; i >= 1; i--) {
            result = result * i;
        }
        return result;
    }
    else {
        return 1;
    }
}

