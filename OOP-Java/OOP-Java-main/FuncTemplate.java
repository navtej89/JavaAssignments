public class Main {
    public static <T extends Number> T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        }
        return null;
    }

    public static void main(String[] args) {
        int x = 3, y = 4;
        double p = 2.2, q = 3.3;

        System.out.println("Adding integers: " + add(x, y));
        System.out.println("Adding doubles: " + add(p, q));
    }
}
