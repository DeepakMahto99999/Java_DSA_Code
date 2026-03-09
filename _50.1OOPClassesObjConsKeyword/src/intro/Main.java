package intro;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students: {roll no , name , marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];

        // just declaring
//        Student deep;
//        System.out.println(Arrays.toString(students));

        Student kunal = new Student(13,"kunal kushwaha", 85.4f);

//        kunal.rno = 13;
//        kunal.name = "kunal kushwaha";
//        kunal.marks = 88.5f;

//        kunal.changeName("deepak");
//        kunal.greeting();

        System.out.println(kunal);
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        Student random = new Student(kunal);
        System.out.println(random.name);

        Student random2 = new Student();
        System.out.println(random2.name);

        Student one = new Student();
        Student two = one;

        one.name = "Something something";

        System.out.println(two.name);

//        final a dee = new a("Kunal kushwaha");
//        dee.name = "other name";
        // when a non primitive is final , you cannot reassign it.
//        dee = new A("new object");

    }
}
    class Student{
        public int age;
        int rno;
        String name;
        float marks = 90.5f;

        // we need a way to add the values of the above
        // properties object by object

        // we need one word to access every object

        void greeting(){
            System.out.println("Hello! My name is "+name);
        }

        void changeName(String newName){
            this.name = newName;
        }

        Student (Student other){
            this.name = other.name;
            this.rno = other.rno;
            this.marks = other.marks;
        }

//        Student(){
//            this.rno = 13;
//            this.name = "kunal kushwaha";
//            this.marks = 88.5f;
//        }

        Student () {
            // this is how you call a constructor from another constructor
            // internally: new  Student(13,"default person",100.0f);
            this(13,"default person",100.0f);
        }

        // Student arpit = new Student(17,"Arpit",89.7f);
        // here, this will be replaced with arpit
        Student(int rno , String name , float marks){
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }

class A {
    final int num = 10;
    String name;
    public  A(String name){
        this.name = name;
    }


    @Override
    protected void finalize() throws Throwable{
        System.out.println("object is destroyed");
    }
}
