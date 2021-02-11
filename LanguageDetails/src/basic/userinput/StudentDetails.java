package basic.userinput;

import java.util.Scanner;

public class StudentDetails {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please Enter the Student ID : ");
        try {
            Long studentId = scanner.nextLong();
            System.out.println("Student ID Is : " + studentId);
            System.out.print("Please Enter the Student Name : " +scanner.nextLine());
            String studentName = scanner.nextLine();
            System.out.println("Student Name Is : " + studentName);
            System.out.print("Please Enter the No Of Subject : ");
            Integer noOfSub = scanner.nextInt();
            Integer totalMark = 0;
            for (int i = 1; i <= noOfSub; i++) {
                System.out.print("Please Enter Mark"+i + " : ");
                Integer mark = scanner.nextInt();
                totalMark = totalMark + mark;
            }
            System.out.println("totalMark = " + totalMark);
            System.out.println("Avg = " + totalMark / noOfSub);
        } finally {
            if(scanner !=null) {
                scanner.close();
            }
        }

    }
}
