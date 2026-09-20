class NumberPrinter {

    private int number = 1;

    synchronized void printOdd() {

        while (number <= 20) {

            while (number % 2 == 0) {

                try {
                    wait();
                }
                catch (InterruptedException e) {
                    System.out.println("Odd thread interrupted.");
                }
            }

            if (number <= 20) {

                System.out.println("Odd Thread: " + number);

                number++;

                notify();
            }
        }
    }

    synchronized void printEven() {

        while (number <= 20) {

            while (number % 2 != 0) {

                try {
                    wait();
                }
                catch (InterruptedException e) {
                    System.out.println("Even thread interrupted.");
                }
            }

            if (number <= 20) {

                System.out.println("Even Thread: " + number);

                number++;

                notify();
            }
        }
    }
}

class OddThread extends Thread {

    NumberPrinter printer;

    OddThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printOdd();
    }
}

class EvenThread extends Thread {

    NumberPrinter printer;

    EvenThread(NumberPrinter printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printEven();
    }
}

public class Q11_odd_even_threads {

    public static void main(String[] args) {

        NumberPrinter printer = new NumberPrinter();

        OddThread odd = new OddThread(printer);
        EvenThread even = new EvenThread(printer);

        odd.start();
        even.start();
    }
}