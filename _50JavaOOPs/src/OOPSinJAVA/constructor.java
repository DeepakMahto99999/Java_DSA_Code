package OOPSinJAVA;

public class constructor {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Deepak";
        System.out.println(s1.name);
        s1.rno = 8;
//        System.out.println(s1.rno);
//        s1.percent = 98.08;
//        System.out.println(s1.percent);
        System.out.println(s1.schoolName);

        Student s2 = new Student("Rahul" , 67 , 98.3);
//        System.out.println(s2.name);
//        System.out.println(s2.rno);
//        System.out.println(s2.percent);
    }

}
