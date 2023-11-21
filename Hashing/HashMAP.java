import java.util.*;

public class HashMAP {
    public static void main(String args[]){
        HashMap<String, Integer> map= new HashMap<>();

        //To insert 
        map.put("Tanisha", 211204);
        map.put("Meghna", 211234);
        map.put("Dani", 211290);
        //Search
        System.out.println("Search Key Dani Value - "+map.get("Dani"));
        //Iteration 

        //Method -1 
        for( Map.Entry <String, Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

         // to update the existing Key's value
        map.put("Dani", 211207);
        
        // method- 2
        Set<String> keys= map.keySet();

        System.out.println("Another method for iteratiob - ");
        for(String key : keys){
            System.out.println(key+" "+ map.get(key));
        }


    }
}
