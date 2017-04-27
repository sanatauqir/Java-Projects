/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;

/**
 *
 * @author Sana
 */
public class ArrayMath {

    /**
     * @param args the command line arguments
     */
    
    public static double[] zeros(int N){
        double[] zeros = new double[N];
        for (int i=0; i<zeros.length;i++){
            zeros[i]=0;
        }
        return zeros;
    }
    
    public static double[] ones(int N){
        double[] ones = new double[N];
        for (int i=0; i<ones.length;i++){
            ones[i]=1;
        }
        return ones;
    }
 
    public static double[] linspace(double low, double high, int numbers){
       double stepsize = (high-low) / (numbers-1);
       double[] anArray = new double[numbers];
       anArray[0]=low;
       for(int i=1;i < numbers;i++)
       { 
           low+=stepsize;
           anArray[i]=low;
       }
       return anArray;
    }
    
    public static double[] add(double[]a, double[]b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i]=a[i]+b[i];}
        return newArray;
    }
    
    public static double[] add(double[]a, double b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i]=a[i]+b;}
        return newArray;
    }
    
    public static double[] add(double a, double[] b){
        double[] newArray = new double[b.length];
        for (int i=0; i<b.length;i++){
                newArray[i]=b[i]+a;}
        return newArray;
    }
    
    public static double[] subtract(double[]a, double[]b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i]=a[i]-b[i];}
        return newArray;
    }
    
    public static double[] subtract(double[]a, double b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i]=a[i]-b;}
        return newArray;
    }
    
    public static double[] subtract(double a, double[] b){
        double[] newArray = new double[b.length];
        for (int i=0; i<b.length;i++){
                newArray[i]=b[i]-a;}
        return newArray;
    }
    
    public static double[] multiply(double[]a, double[]b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i]=a[i]*b[i];}
        return newArray;
    }
    
    public static double[] multiply(double[]a, double b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i]=a[i]*b;}
        return newArray;
    }
    
    public static double[] multiply(double a, double[] b){
        double[] newArray = new double[b.length];
        for (int i=0; i<b.length;i++){
                newArray[i]=b[i]*a;}
        return newArray;
    }
    
    public static double[] divide(double[]a, double[] b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i]=a[i]/b[i];}
        return newArray;
    }
    
    public static double[] divide(double[]a, double b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i]=a[i]/b;}
        return newArray;
    }
    
    public static double[] divide(double a, double[] b){
        double[] newArray = new double[b.length];
        for (int i=0; i<b.length;i++){
                newArray[i]=b[i]/a;}
        return newArray;
    }
    
    public static double[] pow(double[]a, double[]b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i] = Math.pow(a[i],b[i]);}
        return newArray;
    }
    
    public static double[] pow(double[]a, double b){
        double[] newArray = new double[a.length];
        for (int i=0; i<a.length;i++){
                newArray[i] = Math.pow(a[i],b);}
        return newArray;
    }
    
    public static double[] pow(double a, double[] b){
        double[] newArray = new double[b.length];
        for (int i=0; i<b.length;i++){
                newArray[i] = Math.pow(b[i],a);}
        return newArray;
    }
    
    public static double min(double[] a){
        double smallest=a[0];
        for (int i=1; i<a.length;i++){
            if (a[i]<smallest)
                smallest = a[i];
        }
        return smallest;
    }
    
    public static int imin(double[] a){
        int smallest=0;
        for (int i=1; i<a.length;i++){
            if (a[i] < a[smallest])
                smallest = i;
        }
        return smallest;
    }
    
    public static double max(double[] a){
        double largest=a[0];
        for (int i=1; i<a.length;i++){
            if (a[i]>largest)
                largest = a[i];
        }
        return largest;
    }
    
    public static int imax(double[] a){
        int largest=0;
        for (int i=1; i<a.length;i++){
            if (a[i]>a[largest])
                largest=i;
        }
        return largest;
    }
   
    
    public static void println(double[] myArray){
        System.out.print("[");
        for (int i = 0; i < myArray.length; i++) {
            if (i<myArray.length-1){
                System.out.print(myArray[i] + " , ");}
            else
                System.out.print(myArray[i]);
      }
        System.out.println("]");
    }
    
}
