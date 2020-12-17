import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Test Circle
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape :
                shapes) {
            System.out.println(shape.getColor());
            if (shape instanceof Colorable){
                System.out.println(((Colorable) shape).howToColor());
            }
        }


    }
}
