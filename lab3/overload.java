import java.util.Date;

public class overload {
    
    public static void foobar(float a, Date b) {
        System.out.println("sdf");
    }

    
    public static void foobar(Date a, float b) {
        System.out.println("sdf");
    }

    public static void foobar(float a, String b) {
        System.out.println("sdf");
    }

    public static int foobar( float a, Date b) {
        return 1;
    }

    public static int foobar( float a, Date b, int c) {
        return 1;
    }

    public static void foobar( float x, Date y) {
        System.out.println("sdf");
    }

    public void foobar( float x, Date y) {
        System.out.println("sdf");
    }
}