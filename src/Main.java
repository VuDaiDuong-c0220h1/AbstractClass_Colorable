public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(10);
        shapes[1] = new Square(10);
        for (Shape shape : shapes){
            if (shape instanceof Square){
                Colorable colorable = (Square) shape;
                colorable.howToColor();
            }
        }
    }
}
