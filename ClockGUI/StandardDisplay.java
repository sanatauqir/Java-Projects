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
public class StandardDisplay extends ClockDisplay{
    
   StandardDisplay(String message){
       super(message);
   }
   
   StandardDisplay(){
       super("The time is: ");
   }
   
   public void ShowTime(int hour, int minute){
       if (hour<12)
           System.out.println(this.getMessage() + hour+":"+minute+" a.m.");
       else
           System.out.println(this.getMessage() + hour+":"+minute+" p.m.");
       
   }
   
}
