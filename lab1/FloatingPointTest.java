public class FloatingPointTest {
    public static void main(String[] args) {
        float myFloat = 1.36f;
        double myDouble = 1.36;
        System.out.println(myFloat==myDouble);
        float secondFloat = 0.1f;
        secondFloat += 0.6f;
        System.out.println(secondFloat);
        float thirdFloat = 1/49;
        System.out.println(thirdFloat*49);
        double secondDouble = 1/49;
        System.out.println(secondDouble*49);
    }
}