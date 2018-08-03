/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservation;

/*
 
 @author Aish
 */
public class Reservation {
    String ticketID = "123213212";
    public void showTicket() {
        System.out.println("Here is your Ticket ID: " + ticketID);
    }
    
    public static void main(String[] args) {
        Reservation id = new Reservation();
        id.showTicket();
        
    }
}
