public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        //
        // Surface Area: 600
        // Volume: 1000

        double side1 = 20;
        double side2 = 40;
        double side3 = 60;

        System.out.println("Surface Area: " + 2*(side1 * side2 + side2 * side3 + side1 * side3));
        System.out.println("Volume: " + side1 * side2 * side3);
        }
    }
