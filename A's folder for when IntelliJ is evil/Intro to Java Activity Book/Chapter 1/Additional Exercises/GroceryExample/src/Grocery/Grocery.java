/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grocery;

/*
@author Aish
 */
public class Grocery {
    
    public void weightNow(){
       int weight = 109;
    }
    
    public void checkWeight() {
        System.out.println("Weight is:" + weight);
    }
    
    public static void main(String[] args) {
        Grocery now = new Grocery();
        Grocery check = new Grocery();
        
        now.weightNow();
        check.checkWeight();
    }
}
