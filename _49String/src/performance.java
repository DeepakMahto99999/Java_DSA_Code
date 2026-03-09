

public class performance {

    public static void main(String[] args) {
        String str = "";
        for (int i = 1; i <= 10; i++) {
            str = str + i;
        }
        // "" "1" "12" "123"
        //     1 + 2  +  3  + 4... = 55
        System.out.println(str);
    }
}
