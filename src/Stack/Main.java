package Stack;

public class Main {
    public static void main(String[] args) {
        SlinkedStack<Integer> lstack=new SlinkedStack<Integer>();
        lstack.push(10);
        lstack.push(20);
        lstack.push(30);
        lstack.push(40);
        System.out.println("the top is"+lstack.top());


        while (!lstack.isEmpty()){
            System.out.println("element removerd:"+lstack.pop());
        }


    }
}
