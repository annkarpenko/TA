package src.Core02.task4;

public class Main {
    public  static void main (String[] args){

        Student s1 = new Student();
        s1.setFirstName("Olivia");
        s1.setRating(78);
        s1.printStudentData();

        Student s2 = new Student();
        s2.setFirstName("Bill");
        s2.setRating(88);
        s2.printStudentData();

        Student s3 = new Student("John", 87);
        s3.printStudentData();


        System.out.println(Student.count);
        boolean firstIsBetter = Student.betterStudent(s1, s3);
        System.out.println("Student " + s1.getFirstName() + " is better then " + s3.getFirstName() + " : " + firstIsBetter);

        int average = Student.averageRating(s1.getRating(), s2.getRating(), s3.getRating());
        System.out.println("Average Rating is " + average);

        System.out.println("****************************");
        System.out.println("Current rating of " + s1.getFirstName() + " is " + s1.getRating());
        s1.changeRating(90);
        System.out.println("New rating of " + s1.getFirstName() + " is " + s1.getRating());
        System.out.println("****************************");

        average = Student.averageRating(s1.getRating(), s2.getRating(), s3.getRating());
        System.out.println("New average Rating is " + average);




}

}
