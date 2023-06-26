package DataStructure;
import java.util.Map;
import java.util.TreeMap;

// Map is a data structure that stores data in key-value pairs.
// Map is an interface. It is implemented by HashMap, TreeMap, LinkedHashMap, and Hashtable classes.

// TreeMap is an implementation of the Map interface. It is a collection that cannot contain duplicate keys. It is an ordered collection. It is a collection that stores data in key-value pairs. It is a collection that is sorted.

public class TreeMapDemo {
    public static void main(String[] args) {
        // Create a TreeMap object called capitalCities
        Map<String, String> capitalCities = new TreeMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Print the TreeMap
        System.out.println(capitalCities); // {England=London, Germany=Berlin, Norway=Oslo, USA=Washington DC}

        // Access an item
        System.out.println(capitalCities.get("England")); // London

        // Remove an item
        capitalCities.remove("England");

        // Print the TreeMap
        System.out.println(capitalCities); // {Germany=Berlin, Norway=Oslo, USA=Washington DC}

        // Replace an item
        capitalCities.replace("Germany", "Berlin", "Munich");

        // Print the TreeMap
        System.out.println(capitalCities); // {Germany=Munich, Norway=Oslo, USA=Washington DC}

        // Loop through a TreeMap
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

        // Clear the TreeMap
        capitalCities.clear();

        // Print the TreeMap
        System.out.println(capitalCities); // {}
    }
}
