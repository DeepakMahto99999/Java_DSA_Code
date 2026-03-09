package JavaMemory;

    class Data {
        int data;


        public void printData(){
            System.out.println(data);
        }

        public void printData(int times){
            for (int i = 0; i < times; i++) {
                System.out.println(data);
            }
        }
    }

    class childData extends Data{

        @Override
        public void printData(){
            System.out.println("overridden " + data);
        }

        public void insideChildOnly(){

        }
    }

public class LearnPolymorphism {


    public static void main(String[] args) {

//        Object obj = new childData();
        // when u do obj. then it will come obj property


        Data d = new childData();

        d.printData(); // runtime polymorphism also known as method overriding


        childData c = new childData();
        c.insideChildOnly(); // this method only access when childData class is available


        Data d2 = new Data();
        d2.printData(); // compile time polymorphism also known as method overloading


//        Integer a = 5;
//        Data obj = new Data();
//        obj.data =5;
//        changeValue(a , obj);
//        System.out.println(a);
//        System.out.println(obj.data);

    }

    static void changeValue(int a, Data obj){
        a =10;
        obj.data = 100;
    }

}
