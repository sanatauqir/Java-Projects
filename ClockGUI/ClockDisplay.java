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
public abstract class ClockDisplay {
    
    private String message="The time is: ";
    
    ClockDisplay(String message){
        this.message=message;
    }
    
    public String getMessage(){
        return message;
    }
    
    public abstract void ShowTime(int hour, int minute);
}
