public class Format {
    public static void main(String[] args) {
        float i = 75.5f;
        int b = 51;
        char r = '\u0000'; // Default uninitialized char in Java is represented like this
        double d = 106.5;
        String str = "NAVTEJ";

        System.out.printf("The double value of d is %.1f \n", d);
        System.out.printf("The integer value of b is %d \n", b);
        System.out.printf("The character value of r is %c\n", r);
        System.out.printf("The floating-point of i is %e \n", i);
        System.out.println(str);
    }
}
