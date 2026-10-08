public class Q54_blockingqueue_vs_priorityqueue {
    public static void main(String[] args) {

        System.out.println("BlockingQueue vs PriorityQueue");
        System.out.println();

        System.out.println("BlockingQueue:");
        System.out.println("1. Designed for multithreaded programs.");
        System.out.println("2. It can wait when the queue is empty or full.");
        System.out.println("3. Useful for producer-consumer applications.");
        System.out.println();

        System.out.println("PriorityQueue:");
        System.out.println("1. Processes elements according to priority.");
        System.out.println("2. It does not provide blocking operations.");
        System.out.println("3. Useful when priority-based processing is required.");
    }
}