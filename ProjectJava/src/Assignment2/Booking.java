/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author hoangthao
 */
public class Booking {

    private String bookingID;

    private Integer numberOfTicket;

    private Integer price;

    private String cabinType;

    private Integer totalPrice;

    private String destination;
    
    Booking() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public Integer getNumberOfTicket() {
        return numberOfTicket;
    }

    public void setNumberOfTicket(Integer numberOfTicket) {
        this.numberOfTicket = numberOfTicket;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCabinType() {
        return cabinType;
    }

    public void setCabinType(String cabinType) {
        this.cabinType = cabinType;
    }

    public Integer getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Booking(String bookingID, Integer numberOfTicket,
            Integer price, String cabinType, Integer totalPrice, String destination) {
        this.bookingID = bookingID;
        this.numberOfTicket = numberOfTicket;
        this.price = price;
        this.cabinType = cabinType;
        this.totalPrice = totalPrice;
        this.destination = destination;
    }
    public Booking(String bookingID, Integer numberOfTicket,Integer price){
        this.bookingID = bookingID;
        this.numberOfTicket = numberOfTicket;
        this.price = price;
    }
    public Booking(String cabinType, Integer totalPrice, String destination){
        this.cabinType = cabinType;
        this.totalPrice = totalPrice;
        this.destination = destination;
    }

    /**
     *
     * @param bookingID
     * @param numberOfTicket
     * @param price
     * @param cabinType
     * @param totalPrice
     * @param destination
     */
    public void ticketInformation(String bookingID, Integer numberOfTicket,
            Integer price, String cabinType, Integer totalPrice, String destination){
        this.bookingID = bookingID;
        this.numberOfTicket = numberOfTicket;
        this.price = price;
        this.cabinType = cabinType;
        this.totalPrice = totalPrice;
        this.destination = destination;
        
        
    }
    //calculate total price
        public int totalPrice(){
            return this.price * this.numberOfTicket; 
            
    }
        public void ticketConfirmation(){
            System.out.println("Ticket Information: " + "\n" +bookingID +"\n"+numberOfTicket+"\n" +
                    price + "\n" + cabinType + "\n" + "$" +totalPrice +"\n"+ destination);
            
        }

}
