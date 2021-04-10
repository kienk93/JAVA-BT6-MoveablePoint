package Moveablepoint;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(50,50);
        System.out.println(point1);
        MoveablePoint moveablePoint = new MoveablePoint(50,50,2,2);
        moveablePoint.move();
        System.out.println(moveablePoint);
        moveablePoint.move();
        moveablePoint.move();
        moveablePoint.move();
        moveablePoint.move();
        System.out.println(moveablePoint);



    }
}
