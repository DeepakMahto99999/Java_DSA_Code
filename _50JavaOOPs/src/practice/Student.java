package practice;

 class overloading {
    public static void main(String[] args) {
        Student s1 = new Student("Deepak");
        Student s2 = new Student("rahul", 45);
        Student s3 = new Student(1000000000);
    }
}
  public  class Student {
        Student(String name) {
            System.out.println("Constructor with one argument :" +
                    " String : " + name);
        }
        Student(String name, int Id) {
            System.out.println("Constructor with two arguments : " +
                    " String and Integer : " + name + " " + Id);
        }
        Student(long money) {
            System.out.println("Constructor with one argument : " +
                    "Long : " + money);
        }
    }

