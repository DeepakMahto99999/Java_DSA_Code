package OOPSinJAVA;

public class Student{
//    public  String name;
//    private int rno;

    String name;
    int rno;
    double percent;
    final String schoolName = "BBPS";

    // default constructor
    public Student(){

    }

//    // constructor
//    public  Student(String naam, int roll , double per){
//     name = naam;
//     rno = roll;
//     percent = per;
//    }

    // constructor using this keyword
    public  Student(String name, int rno , double percent){
        this.name = name;
        this.rno = rno;
        this.percent = percent;
    }

    // getter
    public int getRno(){  // getter
        return rno;
    }

    // setter
//    public void setRno(int roll){  //setter
//        rno = roll;
//        System.out.println(roll);
//    }

//    public void setRno(int rno){  //setter
//        rno = rno;
//    }

    // this keyword
    public void setRno(int rno){  //setter
        this.rno = rno;
    }
}
