class coffeeShop{
    int id;
    String coffeeName;
}
class Customer extends coffeeShop {
    Customer(){
        System.out.println("Customer Action");
    }
    void palaceOrder(){};
    void pay(){};
    void collectToken(){};
    void notifyFeedback(){};
}

class Cashier extends  coffeeShop{
    Cashier(){
        System.out.println("Cashier Action");
    }
    void takeOrder(){};
    void collectPayment(){};
    void generateToken(){};
}
class Barista extends coffeeShop{
    Barista(){
        System.out.println("Barista Action");
    }
    void getOrder(){};
    void createOrder(){};
    void notifyOrder(){};
    void notifyToken(){};
}
public class question10 {
    public static void main(String[] args) {
        Customer cus= new Customer();
        Cashier cas =new Cashier();
        Barista bar = new Barista();
    }
}
