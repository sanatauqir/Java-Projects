/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

import java.util.ArrayList;

/**
 *
 * @author Matt
 */
public class ClockTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Clock clock1 = new Clock(14,45);
        clock1.showClockTime();
        clock1.setDisplay(new BinaryDisplay());
        clock1.showClockTime();
        
        ArrayList<ClockDisplay> disp = new ArrayList<ClockDisplay>();
        disp.add(new StandardDisplay("THE TIME'S: "));
        disp.add(new BinaryDisplay("THE TIME'S: "));
        clock1.setDisplay(disp);
        clock1.showClockTime();

        Clock clock2 = new Clock(2,45,"pm");
        clock2.showClockTime();

        Clock clock3 = new Clock();
        clock3.showClockTime();

        clock3.setTime("2:45pm");
        clock3.showClockTime();

        Clock clock4 = new Clock();
        clock4.setTime("02:45pm");
        clock4.showClockTime();


        Clock clock5 = new Clock();
        clock5.setTime("14:45");
        clock5.showClockTime();
        
        Clock clock6 = new Clock();
        clock6.setTime("2:45");
        clock6.showClockTime();
    }
}
