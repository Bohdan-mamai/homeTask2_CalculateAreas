import java.text.DecimalFormat;

public class CalculateArea extends Shape{

    DecimalFormat df = new DecimalFormat("#.##");

    @Override
    public void rectangleArea(float length, float breadth) {
        float calculateRectangleArea = length * breadth;
        System.out.println("Rectangle Area = " + df.format(calculateRectangleArea));
    }

    @Override
    public void squareArea(float side) {
        float calculateSquareArea = side * side;
        System.out.println("Square Area = " + df.format(calculateSquareArea));
    }

    @Override
    public void circleArea(float radius) {
        float calculateCircleArea = (float)(Math.PI * (radius * radius));
        System.out.println("Circle Area = " + df.format(calculateCircleArea));
    }
}
