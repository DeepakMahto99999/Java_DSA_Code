class Main {
    public static void main(String[] args) {
        int num = 5;
        num++;             // Postfix increment
        int kam = num;     // Assign updated num to kam
        System.out.println("kam: "+kam);

        int tum = 5;
        int bum = tum++;    // Postfix increment
        System.out.println("bum: "+bum);

        int lum = 10;
        ++lum;             // Prefix increment
        int chap = lum;    // Assign updated lum to chap
        System.out.println("chap: "+chap);

        int kaam = 10;
        int kk = ++kaam;    // Prefix increment
        System.out.println("kaam: "+ kk);



    }
}