package DataStructure;
import java.util.Map;
import java.util.HashMap;

// Map is a data structure that stores data in key-value pairs.
// Map is an interface. It is implemented by HashMap, TreeMap, LinkedHashMap, and Hashtable classes.

// HashMap is an implementation of the Map interface. It is a collection that cannot contain duplicate keys. It is an unordered collection. It is a collection that stores data in key-value pairs. It is a collection that is not sorted.

public class HashMapDemo {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        Map<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Print the HashMap
        System.out.println(capitalCities);
        // {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}

        // Access an item
        System.out.println(capitalCities.get("England")); // London

        // Remove an item
        capitalCities.remove("England");

        // Print the HashMap
        System.out.println(capitalCities); // {USA=Washington DC, Norway=Oslo, Germany=Berlin}

        // Replace an item
        capitalCities.replace("Germany", "Berlin", "Munich");

        // Print the HashMap
        System.out.println(capitalCities); // {USA=Washington DC, Norway=Oslo, Germany=Munich}

        // Loop through a HashMap
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " Value: " + capitalCities.get(i));
        }
        // Key: USA Value: Washington DC
        // Key: Norway Value: Oslo
        // Key: Germany Value: Munich

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

        // Clear the HashMap
        capitalCities.clear();

        // Print the HashMap
        System.out.println(capitalCities); // {}
    }
}
