public class Room {
int roomNumber;
String roomType;
double price;
boolean available;
public Room(int roomNumber,String roomType,double price,boolean available){
this.roomNumber=roomNumber;
this.roomType=roomType;
this.available=available;
this.price=price;
}
void displayRoom(){
    System.out.println("Room Number:"+roomNumber);
    System.out.println("Room Type:"+roomType);
    System.out.println("Available:"+available);
}
}