public class StackClass{
    class Stack2{
        ArrayList<Integer>List=new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        //pusth
        public static void push(int data){
            list.add(data);
        }
        //pop
        public static int pop(){
            int top=list.get(list.size)
        }
    }
    public static void main(String args[]){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!is.Empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}