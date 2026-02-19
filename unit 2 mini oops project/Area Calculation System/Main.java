import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the shape (Circle, Square, or Rectangle):");
        String shape = sc.nextLine();

        Area areaObj = null;
        Float result = null;

        switch (shape.toLowerCase()) {

            case "circle":
                System.out.println("Enter the radius of the circle:");
                int radius = Integer.parseInt(sc.nextLine());
                areaObj = new AreaOfCircle("Circle", radius);
                result = areaObj.calculateArea();
                break;

            case "square":
                System.out.println("Enter the side of the square:");
                int side = Integer.parseInt(sc.nextLine());
                areaObj = new AreaOfSquare("Square", side);
                result = areaObj.calculateArea();
                break;

            case "rectangle":
                System.out.println("Enter the length of the rectangle:");
                int length = Integer.parseInt(sc.nextLine());
                System.out.println("Enter the breadth of the rectangle:");
                int breadth = Integer.parseInt(sc.nextLine());
                areaObj = new AreaOfRectangle("Rectangle", length, breadth);
                result = areaObj.calculateArea();
                break;

            default:
                System.out.println("Invalid Shape");
                sc.close();
                return;
        }

        if (result == null) {
            System.out.println("Invalid Input.");
        } else {
            System.out.printf("The area of the %s is %.2f", shape.toLowerCase(), result);
        }

        sc.close();
    }
}