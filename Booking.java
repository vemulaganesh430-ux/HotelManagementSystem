public class Booking {
    Customer customer;
    Room room;
    int nights;
    Booking(Customer customer,Room room,int nights){
        this.customer=customer;
        this.room=room;
        this.nights=nights;
    }
    void  displayBooking(){
        System.out.println("Customer: "+customer.name);
        System.out.println("Room Number: "+room.roomNumber);
        System.out.println("Nights: "+nights);
    }
    void CalulateBill(){
        double total=room.price*nights;
        System.out.println("Room price:"+room.price);
        System.out.println("Nights:"+nights);
        System.out.println("Total Bill:"+total);
    }
}