/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monkeys;

/**
 *
 * @author Sana
 */
public class Monkeys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num=10;
        String word = "monkeys";
        while (num>0)
        {
            if (num==1)
                {word="monkey";}
            System.out.println(num + " little " + word + " jumping on the bed.");
            System.out.println("One fell down and broke his head.");
            System.out.println("Mama called the doctor and the doctor said.");
            System.out.println("No more monkeys jumping on the bed");
            num-=1;
            
        }
        System.out.println("The end *claps*");
        
    }
    
}
