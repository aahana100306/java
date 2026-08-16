public class Q14_switches {
    public static void main(String[] args) {
        int num=2;
        switch(num){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("not in 1,2,3");
        }

        if (num<2) {
            System.out.println("less than 2");
        }
        else if (num==2) {
            System.out.println("equal to 2");
        }
        else {
            System.out.println("greater than 2");
        }

        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                System.out.println(i+" is an odd number");
            }
            else {
                System.out.println(i+" is an even number");
            }
        }
    }
}