package LocalRepo.Projects.Practices;

import java.util.Scanner;

public class MarkPercentage {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Your First Sub Mark (out of 100) :");
            double sub1 = sc.nextDouble();
            System.out.println("Enter Your Second Sub Mark :"); // Subject Declarations
            double sub2 = sc.nextDouble();
            System.out.println("Enter Your Third Sub Mark :");
            double sub3 = sc.nextDouble();
            double totalMark = sub1 + sub2 + sub3;
            double Percentage = (totalMark / 300) * 100; // Calculate alll
            double cgpa = Percentage / 9.5;
            System.out.println("Your Mark is : " + totalMark);
            System.out.println("Your Percentage is : " + Percentage);
            System.out.println("Your CGPA is : " + cgpa);
        }

    }

}
