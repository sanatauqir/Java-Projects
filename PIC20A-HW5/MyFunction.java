/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;
import static hw5.ArrayMath.*;
/**
 *
 * @author Sana
 */
public class MyFunction implements Plottable2D{
   
   public double[] evaluate(double[] x){
      double[] yArray = new double[x.length];
      double y=0;
      for (int i=0;i<x.length;i++){
          y=x[i]*x[i];
          yArray[i]=y;
      }
      return yArray;
   } 
   
}