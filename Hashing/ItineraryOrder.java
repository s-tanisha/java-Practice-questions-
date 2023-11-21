/*Given a list of tickets, find itinerary in order 
using the given 
list.

Example: 

Input:
"Chennai" -> "Banglore"
"Bombay" -> "Delhi"
"Goa"    -> "Chennai"
"Delhi"  -> "Goa"

Output: 
Bombay->Delhi, Delhi->Goa, Goa->Chennai, Chennai->Banglore,
code in Java using hashset

*/
import java.util.*;

public class ItineraryOrder {
    public static String FindItinerary(String [][] tickets){
        HashSet<String> Destination = new HashSet<>();
        StringBuilder itinerary = new StringBuilder();
        
        for(String [] ticket : tickets){
            // Stores the 2nd index of 2D array in all the elements
            Destination.add(ticket[1]);
        }

        String start = null;
        for(String[] ticket : tickets){
            if(!Destination.contains(ticket[0])){
                start = ticket[0];
                break;
            }
        }
        while(start != null){
            itinerary.append(start).append(" -> ");

            boolean found = false;
            for(String[] ticket : tickets){
                if(ticket[0].equals(start)){
                    start = ticket[1];
                    found = true;
                    break;
                }
            }
            if(!found){
                break;
            }
        }
        return itinerary.toString();
    }
    public static void main(String arg[]){
        String[][] tickets = {
            {"Chennai", "Banglore"},
            {"Bombay", "Delhi"},
            {"Goa", "Chennai"},
            {"Delhi", "Goa"}
        };
        System.out.println(FindItinerary(tickets));

    }
    // public static void main(String[] args) {
    //     String[][] tickets = {
    //         {"Chennai", "Banglore"},
    //         {"Bombay", "Delhi"},
    //         {"Goa", "Chennai"},
    //         {"Delhi", "Goa"}
    //     };

    //     String itinerary = findItinerary(tickets);
    //     System.out.println(itinerary);
    // }

    // public static String findItinerary(String[][] tickets) {
    //     HashSet<String> destinations = new HashSet<>();
    //     StringBuilder itinerary = new StringBuilder();

    //     for (String[] ticket : tickets) {
    //         destinations.add(ticket[1]);
    //     }

    //     String start = null;
    //     for (String[] ticket : tickets) {
    //         if (!destinations.contains(ticket[0])) {
    //             start = ticket[0];
    //             break;
    //         }
    //     }

    //     while (start != null) {
    //         itinerary.append(start).append(" -> ");
    //         boolean found = false;
    //         for (String[] ticket : tickets) {
    //             if (ticket[0].equals(start)) {
    //                 start = ticket[1];
    //                 found = true;
    //                 break;
    //             }
    //         }
    //         if (!found) {
    //             break;
    //         }
    //     }

    //     return itinerary.toString();
    // }
}
