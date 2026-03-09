class ArrayExample {


    void multiArrays() {
//        int[][] arr_1= new int[5][3];
        int[][] arr = {{56, 43, 6}, {34, 7, 8}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

//        int[][][] arr_3 = new int[5][3][2]; // 5*3*2 = 30
//        int[][][] arr_31 = {
//                {{56, 43, 6}, {34, 7, 8}, {12, 56, 8}},
//                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
//                {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}
//        };
//        System.out.println("3D Array: " + arr_31[0][0][0]);
//        // arr[0] = array , arr[0][1]
//
//        System.out.println(arr[0][0]); // 56
//        System.out.println(arr[0][1]); //43
//        System.out.println(arr[0][2]); // 6
//
//        System.out.println(arr[1][0]); // 34
//        System.out.println(arr[1][1]); // 7
//        System.out.println(arr[1][2]); // 8
//
//        System.out.println(arr[1][0]); // 12
//        System.out.println(arr[1][1]); // 56
//        System.out.println(arr[1][2]); // 8


    }


    void demoArrays() {
        int[] ages = new int[3];
        float[] weight = new float[3];
        String[] names = {"rahul", "raj", "radha"};

//        System.out.println("length of age: " + ages.length);
//        System.out.println("length of weight: " + weight.length);
//        System.out.println("length of names: " + names.length);


        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;
//      ages[5] =45; // out of bounds


//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);


        for (int i = 0; i < 3; i++) {
            System.out.println(ages[i]);
        }

        for (int age : ages){
            System.out.println(age);
        }

        int i = 0;
        while (i < 3){
            System.out.println(ages[i]);
           i++;
        }

    }
}

public class Main {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
//        obj.demoArrays();

        obj.multiArrays();
    }
}