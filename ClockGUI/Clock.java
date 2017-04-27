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
import java.util.ArrayList;

public class Clock {
    private int hour;
    private int minute;
    
    ArrayList<ClockDisplay> displays;
    
    Clock(int hour, int minute){
        this.hour=hour;
        this.minute=minute;
        displays=new ArrayList<ClockDisplay>();
        displays.add(0, new StandardDisplay());
    }
    Clock(int hour12, int minute, String ampm)
    {
     this.hour=hour12;
     this.minute=minute; 
     displays=new ArrayList<ClockDisplay>();
     displays.add(0, new StandardDisplay());
    }
    
    //no arg constructor
    Clock(){
        hour=12;
        minute=Integer.parseInt("00");
        displays=new ArrayList<ClockDisplay>();
        displays.add(0, new StandardDisplay());
    }
    
   public void setTime(int hour12, int minute, String ampm){
       int newHour=12;
       if (ampm.equals("am")){
       hour=hour12;
       this.minute=minute;
       }
       else{
            for (int i=0; i<12;i++){
                if (hour12==i){
                 hour=newHour+i;}
            this.minute=minute;
       }//end for
       }//end else 
   }
       
   public void setTime(String time){
        String myHour="";
        String myMinute="";
        if (time.length()==7 || time.length()==5){
                myHour=time.substring(0,1);
                myMinute=time.substring(3,4);
        }
        else if (time.length()==6 || time.length()==4){
                myHour=time.substring(0,1);
                myMinute=time.substring(2,4);
        }
        hour= Integer.parseInt(myHour);
        minute= Integer.parseInt(myMinute);
    }
    
    
public void showClockTime(){
    for (ClockDisplay x:displays){
        x.ShowTime(hour, minute);
    }
}

public void setDisplay(ClockDisplay aDisplay){
    displays.add(aDisplay);
}
  
public void setDisplay(ArrayList<ClockDisplay> anArray){
    displays.addAll(anArray);
}

}
