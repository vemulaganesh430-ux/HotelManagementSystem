import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Customer customer = null;
        Room bookedRoom = null;
        boolean checkedIn = false;
        Room room1 = new Room(101, "Single", 1000, true);
        Room room2 = new Room(102, "Single", 1000, true);
        Room room3 = new Room(201, "Double", 1800, true);
        Room room4 = new Room(301, "Deluxe", 3000, true);
        int choice;
        do {
            System.out.println("\n===== HOTEL MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customer");
            System.out.println("3. Book Room");
            System.out.println("4. View Rooms");
            System.out.println("5. Check-In");
            System.out.println("6. Check-Out");
            System.out.println("7. Generate Bill");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter Customer ID: ");
                    int customerId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phone = sc.nextLine();
                    customer = new Customer(customerId, name, phone);
                    System.out.println("Customer added successfully!");
                    break;
                case 2:
                    if (customer == null) {
                        System.out.println("No customer found.");
                    } else {
                        System.out.println("===== CUSTOMER DETAILS =====");
                        System.out.println("Customer ID: " + customer.customerId);
                        System.out.println("Customer Name: " + customer.name);
                        System.out.println("Phone Number: " + customer.phone);
                    }
                    break;

                case 3:

                    System.out.println("Available Rooms:");

                    room1.displayRoom();
                    room2.displayRoom();
                    room3.displayRoom();
                    room4.displayRoom();

                    System.out.print("Enter room number to book: ");
                    int roomNumber = sc.nextInt();

                    if (roomNumber == room1.roomNumber && room1.available) {
                        room1.available = false;
                        bookedRoom = room1;
                        System.out.println("Room 101 booked successfully!");

                    } else if (roomNumber == room2.roomNumber && room2.available) {
                        room2.available = false;
                        bookedRoom = room2;
                        System.out.println("Room 102 booked successfully!");

                    } else if (roomNumber == room3.roomNumber && room3.available) {
                        room3.available = false;
                        bookedRoom = room3;
                        System.out.println("Room 201 booked successfully!");

                    } else if (roomNumber == room4.roomNumber && room4.available) {
                        room4.available = false;
                        bookedRoom = room4;
                        System.out.println("Room 301 booked successfully!");

                    } else {
                        System.out.println("Room is not available or invalid room number.");
                    }

                    break;

                case 4:

                    System.out.println("Available Rooms:");

                    room1.displayRoom();
                    room2.displayRoom();
                    room3.displayRoom();
                    room4.displayRoom();

                    break;

                case 5:

                    System.out.println("===== CHECK-IN =====");

                    if (customer == null) {

                        System.out.println("Please add customer first.");

                    } else if (bookedRoom == null) {

                        System.out.println("Please book a room first.");

                    } else if (checkedIn) {

                        System.out.println("Customer is already checked in.");

                    } else {

                        checkedIn = true;

                        System.out.println("Customer " + customer.name +
                                " checked in successfully.");

                        System.out.println("Room Number: " +
                                bookedRoom.roomNumber);

                        System.out.println("Room Type: " +
                                bookedRoom.roomType);
                    }

                    break;

                case 6:

                    System.out.println("===== CHECK-OUT =====");

                    if (!checkedIn) {

                        System.out.println("Customer is not checked in.");

                    } else {

                        checkedIn = false;
                        bookedRoom.available = true;

                        System.out.println("Customer checked out successfully.");
                        System.out.println("Room " + bookedRoom.roomNumber + " is now available.");

                        bookedRoom = null;
                    }

                    break;

                case 7:
                    System.out.println("===== GENERATE BILL =====");

                    if (customer == null) {

                        System.out.println("No customer found.");

                    } else if (bookedRoom == null) {

                        System.out.println("No room booked.");

                    } else {

                        System.out.println("Customer Name: " + customer.name);
                        System.out.println("Room Number: " + bookedRoom.roomNumber);
                        System.out.println("Room Type: " + bookedRoom.roomType);
                        System.out.println("Room Price: Rs." + bookedRoom.price);

                        System.out.println("-------------------------");

                        System.out.println("Total Bill: Rs." + bookedRoom.price);
                    }

                    break;

                case 8:

                    System.out.println("Thank you for using Hotel Management System!");

                    break;

                default:

                    System.out.println("Invalid choice!");

            }

        } while (choice != 8);

        sc.close();
    }
}
