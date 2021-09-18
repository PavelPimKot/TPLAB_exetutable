import TriangleStuffPackage.Triangle;

public class Application {
    public static void main(String[] args) {
        Triangle triangle = Triangle.valueOf(1, 1, 1, 1, 1, 1);
        Triangle triangle2 = Triangle.valueOf(1, 1, 1, 1, 1, 1);
        System.out.println(triangle2.isSimilar(triangle));
    }
}

