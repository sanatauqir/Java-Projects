/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;
import static hw5.Plot.*;
/**
 *
 * @author Sana
 */
public class PlotTester {
    
    public static void main(String[] args){
    Plot myPlot = new Plot();
    myPlot.setAxis(new double[] {0,1,0,1});
    myPlot.setFunction(new MyFunction());
   
    }
}
