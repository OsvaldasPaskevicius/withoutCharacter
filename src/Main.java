
public class Main {
    public static void main(String[] args) {
        String withoutX2 = "xHi";
        String withoutX3 = "Hxi";
        String withoutX4 = "Hi";

        withoutX2 = withoutX2.replace("x", "");
        System.out.println("withoutX2(xHi) -->" + " " + withoutX2);
        withoutX3 = withoutX3.replace("x", "");
        System.out.println("withoutX3(Hxi) -->" + " " + withoutX3);
        System.out.println("withoutX4 -->" + " " + withoutX4);
    }
}