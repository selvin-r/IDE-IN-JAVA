public class Stack1 {

    private int[] arr;
    private int top;
    private int capacity;

    public Stack1 (int size){
        arr = new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int x){

        if(top==capacity-1){
            System.out.println("Stack is overflow");
            return;
        }




        arr[++top]=x;
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is over flow in pop");
            return-1;
        }
        return arr[top--];
    }
  public int peek(){

        if(top==-1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
  }
  public boolean isEmpty(){
        return top==-1;
  }
  public void display(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return;
        }
      System.out.println("Stack element list");

        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
      System.out.println();
  }

    public static  void main(String[] args){

        Stack1 obj = new Stack1(5);
        obj.push(20);
        obj.push(30);
        obj.push(100);
        obj.pop();
        obj.push(50500);
        obj.push(490);
        System.out.println( obj.isEmpty());
        System.out.println( " " + obj.peek());
        obj.display();


    }
}

