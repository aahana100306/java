class Inventory {

    private int stock = 10;

    void sellProduct(String name, int quantity) {

        synchronized (this) {

            if (stock >= quantity) {

                System.out.println(name + " is buying " + quantity + " item(s).");

                try {
                    Thread.sleep(300);
                }
                catch (InterruptedException e) {
                    System.out.println("Transaction interrupted.");
                }

                stock = stock - quantity;

                System.out.println(name + " completed the purchase.");
                System.out.println("Stock remaining: " + stock);
            }
            else {
                System.out.println(name + " could not purchase.");
                System.out.println("Not enough stock.");
            }
        }
    }
}

class Customer extends Thread {

    Inventory inventory;
    int quantity;

    Customer(Inventory inventory, String name, int quantity) {
        super(name);
        this.inventory = inventory;
        this.quantity = quantity;
    }

    public void run() {
        inventory.sellProduct(getName(), quantity);
    }
}

public class Q8_synchronized_block {

    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Customer c1 = new Customer(inventory, "Customer-1", 4);
        Customer c2 = new Customer(inventory, "Customer-2", 3);
        Customer c3 = new Customer(inventory, "Customer-3", 5);

        c1.start();
        c2.start();
        c3.start();
    }
}