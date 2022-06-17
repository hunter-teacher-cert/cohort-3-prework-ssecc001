public class squareroot{
public static void main(String[] args){
public static double squareroot(double a){
    a = 9;
    double g = a/2;
    double ig = (g + (a/g))/2;

    while (Math.abs((g - ig)) > 0.0001){
        g = ig;
        ig = (g + (a/g))/2;
    }
    System.out.print(ig);
    return ig;
}
}
}