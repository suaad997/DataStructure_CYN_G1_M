package Stack;

public class Main {
    public static void main(String[] args) {
        ArrayStack<Integer> astack=new ArrayStack<Integer>();
        astack.push(10);
        astack.push(20);
        astack.push(30);
        astack.push(40);
        System.out.println("the top is: "+astack.top());


        while (!astack.isEmpty()){
            System.out.println("element removerd:"+astack.pop());
        }


    }
}
