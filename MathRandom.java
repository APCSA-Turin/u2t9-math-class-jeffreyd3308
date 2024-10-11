public class MathRandom {
    public static void main(String[] args) {
        int rand1 = (int) (Math.random() * 9) + 2;
        int rand2 = (int) (Math.random() * 9 + 2);
        int rand3 = (int) Math.random() * 9 + 2;
        System.out.println(rand1);
        System.out.println(rand2);
        System.out.println(rand3);

    }
}