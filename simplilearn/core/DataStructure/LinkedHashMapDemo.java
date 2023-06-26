package DataStructure;
import java.util.LinkedHashMap;
import java.util.Map;

// Map is a data structure that stores data in key-value pairs.
// Map is an interface. It is implemented by HashMap, TreeMap, LinkedHashMap, and Hashtable classes.

// LinkedHashMap is an implementation of the Map interface. It is a collection that cannot contain duplicate keys. It is an ordered collection. It is a collection that stores data in key-value pairs. It is a collection that is not sorted.
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Create a LinkedHashMap object called capitalCities
        Map<String, String> capitalCities = new LinkedHashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Print the LinkedHashMap
        System.out.println(capitalCities); // {England=London, Germany=Berlin, Norway=Oslo, USA=Washington DC}

        // Access an item
        System.out.println(capitalCities.get("England")); // London

        // Remove an item
        capitalCities.remove("England");

        // Print the LinkedHashMap
        System.out.println(capitalCities); // {Germany=Berlin, Norway=Oslo, USA=Washington DC}

        // Replace an item
        capitalCities.replace("Germany", "Berlin", "Munich");

        // Print the LinkedHashMap
        System.out.println(capitalCities); // {Germany=Munich, Norway=Oslo, USA=Washington DC}

        // Loop through a LinkedHashMap
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
        }
        // Key: Germany Value: Munich
        // Key: Norway Value: Oslo
        // Key: USA Value: Washington DC

        // Check if an item exists
        if (capitalCities.containsKey("Norway")) {
            System.out.println("Norway exists"); // Norway exists
        } else {
            System.out.println("Norway does not exist");
        }

        // Check if an item exists
        if (capitalCities.containsValue("Oslo")) {
            System.out.println("Oslo exists"); // Oslo exists
        } else {
            System.out.println("Oslo does not exist");
        }

        // Clear the LinkedHashMap
        capitalCities.clear();

        // Print the LinkedHashMap
        System.out.println(capitalCities); // {}
    }
}
