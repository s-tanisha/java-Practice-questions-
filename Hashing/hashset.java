import java.util.*;

public class hashset{
    public static void main(String args[]){
        //creating
        HashSet<Integer> set = new HashSet();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        set.add(1);
        set.add(6);
        set.add(7);
        set.add(2);

        System.out.println("Size of set is : "+set.size());

        System.out.println(set);
        Iterator it = set.iterator();

        while(!it.hasNext()){
            System.out.println(it.Next());
        }


    }
}
