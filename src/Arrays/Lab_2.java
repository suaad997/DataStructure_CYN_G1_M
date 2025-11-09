package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_2 {
    public static void main(String[] args) {
        Arrayss arr= new Arrayss();
       // Scanner scanner =new Scanner(System.in);
//        int []numbers=new int[5];

        int []numbers={2,4,7,6,4};

        //arr.input(numbers);
       // arr.revers_traversal(numbers);
        arr.update(numbers,4,7);
        arr.traversal(numbers);



        //   System.out.println(Arrays.toString(numbers));
//        for(int num:numbers)
//            System.out.println(num);

    }
}
