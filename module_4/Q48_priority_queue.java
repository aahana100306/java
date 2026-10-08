import java.util.PriorityQueue;

public class Q48_priority_queue {

    static class Task implements Comparable<Task> {

        String name;
        int priority;

        Task(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }

        public int compareTo(Task other) {
            return Integer.compare(other.priority, this.priority);
        }

        public String toString() {
            return name + " (Priority " + priority + ")";
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Task> tasks = new PriorityQueue<>();

        tasks.add(new Task("Complete assignment", 3));
        tasks.add(new Task("Submit project", 5));
        tasks.add(new Task("Read notes", 1));
        tasks.add(new Task("Prepare presentation", 4));

        System.out.println("Tasks:");
        System.out.println(tasks);

        System.out.println();
        System.out.println("Highest-priority task removed:");
        System.out.println(tasks.poll());

        System.out.println();
        System.out.println("Remaining tasks:");
        System.out.println(tasks);
    }
}