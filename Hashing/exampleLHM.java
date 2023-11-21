import java.util.*;

public class exampleLHM {
    public static void main(String args[]){
        LinkedHashMap<Integer, String> Students = new LinkedHashMap<Integer, String>();

        // add elements
        Students.put(211204, "Tanisha");
        Students.put(211207, "Meghna");
        Students.put(211234, "Meghna");
        Students.put(211290, "Aparna");

        //iteration
        
        System.out.println("Students of CS- 54 batch -");

        for(Map.Entry<Integer, String> List :
         Students.entrySet() ){
            Integer key = List.getKey();
            String value = List.getValue();

            System.out.println(key +" : "+ value);
        }

        // update
        Students.put(211207, "Yashwardhan");
        
        // remove 
        Students.remove(211290);
    
        System.out.println("Students of CS- 54 batch -");
         for(Map.Entry<Integer, String> List : Students.entrySet() ){
            Integer key = List.getKey();
            String value = List.getValue();

            System.out.println(key +" : "+ value);
        }

    }
}
