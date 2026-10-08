public class Q6_generic_pair {

    static class Pair<K, V> {

        K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K getKey() {
            return key;
        }

        V getValue() {
            return value;
        }

        void setKey(K key) {
            this.key = key;
        }

        void setValue(V value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Pair<Integer, String> pair = new Pair<>(101, "Aahana");

        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());

        pair.setKey(102);
        pair.setValue("Java");

        System.out.println();
        System.out.println("After updating:");
        System.out.println("Key: " + pair.getKey());
        System.out.println("Value: " + pair.getValue());
    }
}