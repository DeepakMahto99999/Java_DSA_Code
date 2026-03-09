package functionStatic;

public class student {

    String name;
    int rno;
    double percent;
    private static int numberOfStudents;

    public student(String name , int rno , double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
        numberOfStudents++;
    }

    public static int getNumberOfStudents(){
        return numberOfStudents;
    }

}
