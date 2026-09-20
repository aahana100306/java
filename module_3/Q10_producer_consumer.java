class Data {

    private int number;
    private boolean available = false;

    synchronized void produce(int number) {

        while (available) {

            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Producer interrupted.");
            }
        }

        this.number = number;
        available = true;

        System.out.println("Produced: " + number);

        notify();
    }

    synchronized void consume() {

        while (!available) {

            try {
                wait();
            }
            catch (InterruptedException e) {
                System.out.println("Consumer interrupted.");
            }
        }

        System.out.println("Consumed: " + number);

        available = false;

        notify();
    }
}

class Producer extends Thread {

    Data data;

    Producer(Data data) {
        this.data = data;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            data.produce(i);
        }
    }
}

class Consumer extends Thread {

    Data data;

    Consumer(Data data) {
        this.data = data;
    }

    public void run() {

        for (int i = 1; i <= 5; i++) {

            data.consume();
        }
    }
}

public class Q10_producer_consumer {

    public static void main(String[] args) {

        Data data = new Data();

        Producer producer = new Producer(data);
        Consumer consumer = new Consumer(data);

        producer.start();
        consumer.start();
    }
}