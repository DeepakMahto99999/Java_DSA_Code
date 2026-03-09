
public class Q2 {

    public static void main(String[] args) {
        String str = "PhYSiCS";
        System.out.println(str);
//        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {

            // check -> alphabet - small , capital
            boolean falg = true; // true -> capital
            char ch = str.charAt(i); // A

            if(ch==' ' ) continue;

            int asci = (int)ch; // 65
            if(asci >=97) falg = false;  // small

            if(falg == true){ // capital
                asci +=32;
                char dh = (char)asci; // a
           // raghav  ra        + G + hav
               str = str.substring(0,i) + dh + str.substring(i+1);

            } else  { //small
                asci -=32;
                char dh = (char)asci;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
            System.out.println(str);
    }
}
