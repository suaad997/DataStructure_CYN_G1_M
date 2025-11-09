package Arrays;

import java.util.Scanner;

public class Arrayss {
Scanner scanner=new Scanner(System.in);
    public void traversal(int []numbers){

        System.out.println("the elements are :");
        for(int i=0;i<numbers.length;i++)
            System.out.println("index["+i+"]"+" ,element: "+numbers[i]);


    }
    public void revers_traversal(int []numbers){

        System.out.println("the reversed elements are :");
        for(int i=numbers.length-1;i>=0;i--)
            System.out.println("index["+i+"]"+" ,element: "+numbers[i]);


    }

    public void input(int []numbers){

        System.out.println(" please enter "+numbers.length+" numbers:");
        for (int i=0; i<numbers.length;i++){
            numbers[i]=scanner.nextInt();
        }
    }


    public void update(int []numbers, int index ,int nelement){
        numbers[index]=nelement;
      //  return index;
    }


}
