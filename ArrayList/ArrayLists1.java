//data store in continue in memory
//fixed size
//size variable

import java.util.ArrayList;
import java.util.Collections;
class ArrayLists1{
    public static void main(String[]args){
        ArrayList<Integer> list=new ArrayList<Integer>();
        
        //add element
        list.add(0);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //get element
        int element =list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size =list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }

}
/*
[0, 2, 3]
0
[0, 1, 2, 3]
[5, 1, 2, 3]
[5, 1, 2]
3
512
[1, 2, 5]
*/