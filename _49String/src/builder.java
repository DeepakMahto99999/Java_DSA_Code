

public class builder {

    static void rev(StringBuilder s){
        int i =0 , j = s.length() -1;

        while(i < j){
            char temp = s.charAt(i);
             s.setCharAt(i,s.charAt(j));
             s.setCharAt(j,temp);
             i++;
             j--;
        }
    }

    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("hello");
////        str += "world"; // this is not allowed
////         str.append("world");
////        System.out.println(str); // hello
//        str.setCharAt(0,'m'); // set char
//        System.out.println(str); // mello
//        str.append(10); // append
//        System.out.println(str); // mello10
//        str.insert(2,'y');
//        System.out.println(str); // meyllo10
//        str.deleteCharAt(0);
//        System.out.println(str); // eyllo10


        StringBuilder sb = new StringBuilder("physics");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
          rev(sb);
        System.out.println(sb);
//        sb.delete(2,4); //  2 to 3 delete
//        System.out.println(sb);
        System.out.println( sb.substring(3));

    }
}
