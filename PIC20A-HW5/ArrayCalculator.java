package hw5;

public class ArrayCalculator {
   
    interface doubleMath {
        double operation(double a, double b);   
    }
  
    public double[] operateBinary(double[] a, double[] b, doubleMath op) {
        double[] c = new double[2];
        for (int i=0;i<2;i++) 
                c[i] = op.operation(a[i], b[i]);
        return(c);
    }
 
    public static void main(String[] args) {
    
    double[] Aa = {2.0,3.0};
    double[] Ab = {3.0,4.0};
    double[] Ac;
    
    ArrayCalculator myApp = new ArrayCalculator();
    doubleMath addition = (a, b) -> a + b;
    doubleMath multiply = (a, b) -> a * b;
    Ac=myApp.operateBinary(Aa, Ab, addition);
    System.out.println("Addition Result=");
    for (int i=0;i<2;i++) 
        System.out.print(Ac[i]+",");

        
    Ac=myApp.operateBinary(Aa, Ab, multiply);    
    System.out.println("\nMultiplication Result= " );
    for (int i=0;i<2;i++) System.out.print(Ac[i]+",");
    }
}
