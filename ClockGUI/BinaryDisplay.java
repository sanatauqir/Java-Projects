/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam1;

/**
 *
 * @author sanatauqir
 */

public class BinaryDisplay extends ClockDisplay{
    
   BinaryDisplay(String message){
       super(message);
   }
   
   BinaryDisplay(){
       super("The time is: ");
   }
    
    public void ShowTime(int hour, int minute){
       if (hour<12){
           int newHour= Integer.parseUnsignedInt(Integer.toBinaryString(hour));
           int newMinute= Integer.parseUnsignedInt(Integer.toBinaryString(minute));
           System.out.println("The time is: " + newHour+":"+newMinute+" a.m.");}
       else{
           int newHour= Integer.parseUnsignedInt(Integer.toBinaryString(hour));
           int newMinute= Integer.parseUnsignedInt(Integer.toBinaryString(minute));
           System.out.println("The time is: " + newHour+":"+newMinute+" p.m.");
       }
   }
    
}
