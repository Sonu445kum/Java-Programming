package AnudipAssignment;

import java.util.Scanner;

public class Perimeters {
    public static void main(String[] args) {
        int length,breadth,side,radius;
        int choice;
        Scanner sc =new Scanner(System.in);
        while(true){
            // creating menu;
            System.out.println("Press 1 For Find Perimeter Of Rectangle:");
            System.out.println("Press 2 For  Find Perimeter Of Square:");
            System.out.println("Press 3 For Find Perimeter Of Circle:");
            // Asking user to make choice;
            System.out.println("Make your choice:");
            choice=sc.nextInt();
            // Creating switch case branch
            switch (choice){
                // First Case for Find Perimeter of Rectangle;
                case 1:
                    System.out.println("Enter The Length:");
                    length=sc.nextInt();
                    System.out.println("Enter The Breadth:");
                    breadth=sc.nextInt();
                    int PR=2*(length+breadth);
                    System.out.println("The Perimeter of Rectangle:"+PR);
                    break;
                // Second case for find the perimeter of Square;
                case 2:
                    System.out.println("Enter the Side Of Square:");
                    side=sc.nextInt();
                    int PS =4*side;
                    System.out.println("The Perimeter of Square:"+ PS);
                    break;
                // Third case for find the perimeter of circle:
                case 3:
                    System.out.println("Enter the Radius Of Circle:");
                    radius=sc.nextInt();
                    double PC=2*Math.PI*radius;
                    System.out.println("The Perimeter of Circle:"+PC);
                    break;
                // Fourth case for Quit Program;
                case 4:
                default:
                    System.out.println("Invalid output");

            }
        }
    }
    }

