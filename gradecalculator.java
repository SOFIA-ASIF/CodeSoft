import java.util.Scanner;
public class gradecalculator {
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String grade;
        System.out.println("Enter marks of the following subjects. Marks should be in between 0 to 100");
        System.out.print("Maths:"); int maths = myObj.nextInt();
        System.out.print("Urdu:");int Urdu = myObj.nextInt(); 
        System.out.print("English:");int English = myObj.nextInt(); 
        System.out.print("Islamiat:");int Islamiat = myObj.nextInt();
         System.out.print("PakistanStudies:");int PakistanStudies = myObj.nextInt();
         int marks = (maths+Urdu+English+Islamiat+PakistanStudies) ;
         int average = marks/5;
         Double percentage = (marks*0.2);
         if(percentage > 90)
         grade = "A+";
         else if (percentage >= 80) {
            grade = "A";
         }
         else if(percentage >= 70)
         grade = "B";
         else if(percentage >= 60)
         grade = "c";
         else if (percentage >= 50)
         grade = "D";
         else 
         grade = "Fail";
         System.out.println("Your Total marks are: " + marks);
         System.out.println("Your Total percentage is: " + percentage);
         System.out.println("Your average marks are: " + average);
         System.out.println("Your grade is:" + grade);

    }
}
