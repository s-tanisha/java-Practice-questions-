
import java.util.*;

public class IntroTreeMap {
    public static void main(String a[]){
        TreeMap Map = new TreeMap();
        Map.put("Tanisha", 211204);
        Map.put("Dani", 211207);
        Map.put("Meghna", 211234);
        Map.put("Aparna", 211290);

       for(Map.Entry<String, Integer> entry : Map.entrySet()){

        String key = entry.getKey();
        Integer value = entry.getValue();
        System.out.println(key + ": " + value);
       }
        System.out.println("sorted Roll number wise");
        TreeMap<Integer, String> Roll = new TreeMap<>(new Comparator <Integer>(){
            public int compare(Integer key1, Integer key2){
                return key2.compareTo(key1);
                
            }
        });
        Roll.put(211204, "Tanisha");
        Roll.put(211207, "Dani");
        Roll.put( 211234, "Meghna");
        Roll.put( 211290 , "Aparna");

         System.out.println(Map);
    }

}
