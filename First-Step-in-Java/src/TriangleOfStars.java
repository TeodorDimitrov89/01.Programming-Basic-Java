public class TriangleOfStars {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            String repeated = new String(new char[i]).replace("\0", "*");
            System.out.println(repeated);
        }
    }
}
