import java.util.Scanner;
public class StudentGradeTracker{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);
        int number;
    double gpa,Percentage,total=0,avg;
    char grade;
    String note;
    
    System.out.print("enter the number of subjects:");
    number=sc.nextInt();
    double[] marks=new double[number];
    for (int i=0; i<number; i++){
        System.out.println("marks in subject number "+i+" is :");
        marks[i]=sc.nextDouble();
        total+= marks[i];
    }
            avg=total/number;
            if(avg>=90){
            gpa=10.0;
            grade='A';
            note=new String("congratulation, you did Outstanding!!!");
            }
            else if(avg>=80){
            gpa=9.0;
            grade='B';
            note=new String("Keep it up you did superb!!");
            }
            else if(avg>=70){
            gpa=8.0;
            grade='C';
            note=new String("you did a good job!!");
            }
            else if(avg>=60){
            gpa=7.0;
            grade='D';
            note=new String("good job, you have potential try more");
            }
            else if(avg>=50){
            gpa=6.0;
            grade='E';
            note=new String("yay! you have passed all the subjects");
            }
            else{
            gpa=5.0;
            grade='F';
            note=new String("OOPS you have failed try better next time :/");
            }
            System.out.println(" ----Grade Summary---- :");
            Percentage=(100*total)/(number*100);
            System.out.println("your marks in each subject");
            for(int i=0; i<number; i++){
                System.out.println(i+1+":   "+marks[i]);
            }
            System.out.println("Total:"+total+"\t\tAverage:"+avg+"\nPercentage:"+Percentage+"%\tGrade obtained:"+grade+"\tGPA:"+gpa+"\n"+note);

    }
}
//use 'javac StudentGradeTracker.java' to compile
//use 'java StudentGradeTracker' to run