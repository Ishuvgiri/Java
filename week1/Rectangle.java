public class Rectangle {
    private double width;
    private double height;
    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public String toString() {
        return "Rectangle{width=" + width + ", height=" + height + "}";
    }
    
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10.5, 5.5);
        System.out.println(rect);
    }
}
