package functionStatic;

public class studentClass {


    // crating a new data type
    public static void change(student s){
        s.name = "Rohan";
    }

    public static void main(String[] args) {
        System.out.println(student.getNumberOfStudents());
        student s1 = new student("deepak", 26 , 56);
        student s2 = new student("Rahul" ,67, 93);
        student s3 = new student("Rohan",99,91.3);
        System.out.println(s1.getNumberOfStudents());
        System.out.println(s2.getNumberOfStudents());
        System.out.println(s3.getNumberOfStudents());
    }
}
