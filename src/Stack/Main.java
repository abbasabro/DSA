package Stack;

public class Main {

    public static void main(String[] args) {
        ArrayStack fs=new ArrayStack(10);
        fs.push("Banana");
        fs.push("Chikoo");
        fs.push("Grape Fruit");
        System.out.println(fs.peek());
        fs.push("Grapes");
        fs.push("Apple");
        System.out.println(fs.size());
        System.out.println( fs.pop());
        System.out.println(fs.size);
        System.out.println(fs.peek());
    }
    
}
