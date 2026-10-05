class  Payment {

    public void pay(){
        System.out.println("Payment Processing");
    }
}

class CreditCard extends Payment {

    public void pay(){
        System.out.println("Paid using Credit Card");
    }
}

class UPI extends  Payment {
    public void pay(){
        System.out.println("Paid using upi ");
    }
}

class Paypal extends Payment {
    public void pay(){
        System.out.println("paid using paypal");
    }
}

public class Main {

    public static void main(String[] args) {
        Payment p;

        p = new CreditCard();
        p.pay();

        p = new UPI();
        p.pay();

        p = new Paypal();
        p.pay();
    }
}