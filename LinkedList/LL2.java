import java.util.*;
class LL2{
    public static void main(String[]args){
        LinkedList<String>list=new LinkedList<String>();

        list.addFirst("a");
        list.addFirst("is");
        System.out.println(list);//[is, a]

        list.addFirst("this");
        list.add("list");
        System.out.println(list);//[this, is, a, list]
        System.out.println(list.size());//4

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");//this->is->a->list->null
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);//[is, a, list]

        list.removeLast();
        System.out.println(list);//[is, a]

        list.remove(1);
        System.out.println(list);//[is]



    }
}
/*
[is, a]
[this, is, a, list]
4
this->is->a->list->null
[is, a, list]
[is, a]
[is]
*/