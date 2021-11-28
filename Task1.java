package by.overone.lesson27homework;

public class Task1 {

    public static void main(String[] args){
        IShape shaperectangle = (x,y) -> x*y;
        double rectangleSquare = shaperectangle.getSquare(2,4);

        IShape shapetriangle = (x,y) -> 0.5 * x * y;
        double triangleSquare = shapetriangle.getSquare(2,3);

        IShape shapecircle = (x,y) -> x * y*y;
        double circleSquare = shapecircle.getSquare(3.14,2);
        System.out.println("rectangleSquare" + "=" + rectangleSquare + " " + "triangleSquare" + "=" + triangleSquare + " " + "circleSquare" + "=" + circleSquare);
    }
}

interface IShape{
    double getSquare(double x, int y);
}
