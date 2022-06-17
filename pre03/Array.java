//Starting with the code in Section 8.6, write a method called powArray that takes a double array, a, and returns a new array that contains the elements of a squared. Generalize it to take a second argument and raise the elements of a to the given power.


public static double[] powArray (double a[]){
    for (int i = 0; i < a.length; i++) {
         a[i] = Math.pow(a[i], 2.0);
    }
    return a;
}

public class Array{
public static void main(String[] args) {
    double[] a = new double[]{5, 6, 8, 7};
    System.out.println(Arrays.toString(powArray(a)));
}
}



