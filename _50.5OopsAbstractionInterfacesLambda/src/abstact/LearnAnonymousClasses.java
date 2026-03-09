package abstact;

public class LearnAnonymousClasses {

//    class InnerClass extends OuterClas {
//
//    }

    // this is anonymous class ,also called child class of outer class
    // this can use once , similar to upper comment thing
    OuterClas obj = new OuterClas(){
      void sing(){

      }
        public void outerMethod(){

        }
    };

    // this is subClass using Anonymous class
    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod() {

        }
    };

    // obj3 and obj2 both are same
    SuperInterface obj3 = () -> {

    };



    public static void main(String[] args) {
        WalkAble walkAble = ( steps) -> {
            System.out.println("Walked " +steps+ " steps");
            return steps;
        };
        walkAble.walk(5);

        WalkAble obj2 = ( steps) -> 2*steps;

        System.out.println(obj2.walk(8));
    }


}

interface WalkAble {
    int walk(int steps);
}

class OuterClas{

    public void outerMethod(){

    }
}


@FunctionalInterface
interface SuperInterface {

    void interfaceMethod();
}




