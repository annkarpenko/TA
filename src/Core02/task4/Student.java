package src.Core02.task4;

public class Student {
    private String firstName;
    private int rating;

    public static int count = 0;

    public Student(){}

    public Student (String firstName, int rating){
        this.firstName=firstName;
        this.rating=rating;
        count++;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void printStudentData(){
        System.out.println("First name is "+ firstName + " rating is " + rating);
    }

    public static boolean betterStudent (Student student1, Student student2){
        return student1.getRating() > student2.getRating();
    }

    public void changeRating (int newRating){
        this.rating = newRating;
    }

    public static int averageRating (int r1, int r2, int r3){
        return (r1 + r2 + r3)/3;
    }

}


/*


*/

