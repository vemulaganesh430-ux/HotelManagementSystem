public class Customer {
    int customerId;
    String name;
    String phone;
    public Customer(int customerId,String name,String phone){
        this.customerId=customerId;
        this.name=name;
        this.phone=phone;
    }
       void customerDisplay() {
        System.out.println("customerID "+customerId);
        System.out.println("customername "+name);
        System.out.println("phone no "+phone);
       }
    }