public class Q11_stringbuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.insert(5, "Basic ");
        System.out.println(sb);
        sb.replace(0, 4, "Core");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}