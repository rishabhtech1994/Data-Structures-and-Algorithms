package stack;

public class StackImpl {
    int top = -1;
    static final int MAX = 1000;
    int[] arr = new int[MAX];
    public void push(int element){
        if(top>=MAX-1) {
            System.out.println("Stack full!!");
        }else {
            arr[++top] = element;
            System.out.println(element + " pushed into stack");
        }
    }

    public int pop(){
        if(top<0) {
            System.out.println("Stack empty!!");
        }else {
            return arr[top--];
        }
        return 0;
    }

    public int peek(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }else {
            return arr[top];
        }
    }

    public void print(){
        for(int i =top ;i>-1;i--){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        StackImpl s = new StackImpl();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
        s.print();
    }
}
