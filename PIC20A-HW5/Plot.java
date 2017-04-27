/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5;
import java.awt.*;
import javax.swing.*;
import static hw5.ArrayMath.*;
import static hw5.MyFunction.*;
import java.awt.geom.Line2D;
/**
 *
 * @author Sana
 */
public class Plot extends JPanel{
    public double xmin=0;
    public double xmax=0;
    public double ymin=0;
    public double ymax=0;
    public static final int XMIN = 25;
    public static final int XMAX = 400;
    public static final int YMIN = 300;
    public static final int YMAX = 25;
    Plottable2D plotFunction;
    Shape myShape;
    double[]xS;
    double[]yS;
    
    public void setAxis(double[] a){
       xmin=a[0];
       xmax=a[1];
       ymin=a[2];
       ymax=a[3];
    }
    
    public void setFunction(Plottable2D plotFunction){
        this.plotFunction = plotFunction; 
        xS = new double[100];
        for (int i=0;i<99;i++)
            xS=linspace(xmin, xmax, 99);
        yS = plotFunction.evaluate(xS);
        
        //scaling to actual pixels
        
        JFrame frame= new JFrame("My Plot");
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        this.repaint();
    }
  
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        
        String xminString = "" + xmin;
        String xmaxString = "" + xmax;
        String yminString = "" + ymin;
        String ymaxString = "" + ymax;
        
        g2d.setColor(Color.BLUE);
        g2d.drawLine(XMIN,YMIN,XMAX,YMIN);
        g.drawString(xminString,XMIN, YMIN+10);
        g.drawString(xmaxString,XMAX, YMIN+10);
        g2d.drawLine(XMIN,YMIN, XMIN, YMAX);
        g.drawString(yminString,XMIN-15,YMIN);
        g.drawString(ymaxString,XMIN-15,YMAX);    
        
        for (int i=0;i<99-1;i++){
            double a = (xS[i]*(XMAX-XMIN))+XMIN;
            double b = (YMIN-(yS[i]*(YMIN-YMAX)));
            double c = (xS[i+1]*(XMAX-XMIN))+XMIN;
            double d = (YMIN-((yS[i+1]*(YMIN-YMAX))));
            System.out.println(a + " / " + b + " / ");
            System.out.println(c + " / " + d + " / ");
            g2d.draw(new Line2D.Double(a, b, c,d));
        }
    }
}
