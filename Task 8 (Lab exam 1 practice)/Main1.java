import java.util.Scanner;

class Course{
    String highestName ="";
    double highestMarks = 0;
    int topCount = 0;

    void addStudent(String name, double marks){
        if(marks> highestMarks){
            highestMarks = marks;
            highestName = name;
        }
        if(marks >=80){
            topCount++;
        }
    }
    String getHighestScorer(){
        return highestName + "(" +(int)highestMarks+")";
    }
    int countTopGrades(double  threshhold){
        return topCount;
    }
}
public class Main1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.next();
        Course course = new Course();
        course.addStudent(input.next(), input.nextDouble());
        course.addStudent(input.next(), input.nextDouble());
        course.addStudent(input.next(), input.nextDouble());

        System.out.println("Highest Scorer: " + course.getHighestScorer());
        System.out.println("Number of A+ (80+): " + course.countTopGrades(80));
    }
}
