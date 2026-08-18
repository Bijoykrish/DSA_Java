package Collections_learning;

import java.util.*;

public class MapInterface_earning {
    public static void main(String[] args) {
        // values in Key Value pair - key - unique
        // no duplicates in Map value can be duplicate not Key
        // Hashmap, treemap, linkedHashMap, hashtable - order is not maintained
        // but TreeMap - sorted order and LinkedHashMap - insertion order
        // MashMap - allows one Null Key and multiple null Values
        Map<String, String> mapping = new HashMap<>();
        mapping.put("in", "India");
        //mapping.put("in","India2"); if we enter same key then the latest value will be updated with the corresponding key so the 'in= india2'
        // latest Entry will be taken wrt the Key
        mapping.put("en", "England");
        mapping.put("us", "United States");
        System.out.println("Values in the Mapping : " + mapping);
        HashMap<String, String> table = new HashMap<>();
        table.put("br", "Brazil");
        System.out.println("Before Table : " + table);
        table.putAll(mapping);
        System.out.println("After putAll : "+table);
        // remove("Key", "Value") - remove the entry with Key and Value
        table.remove("en");
        System.out.println("Remove the en from the table : " +table);
        System.out.println("Table size : " +table.size());

        table.putIfAbsent("is","India3");
        System.out.println(table);
        System.out.println("Getting the value of 'br' is : "+ table.get("br"));
        System.out.println("Get the value of default value of 'in' is  :"+ table.getOrDefault("in", "Null/Not Found"));
        System.out.println("Get the value of default value of 'ca' is  :"+ table.getOrDefault("ca", "Null/Not Found"));
        // containsKey("Key") - returns True if Key is present or False if not present
        // containsValue("Value") - returns True if Value is present or False if not present
        System.out.println("Contain a key 'in' : "+ table.containsKey("in"));
        System.out.println("Contain a value 'India' : "+ table.containsValue("India"));
        // replace("Key", "Value") - To change the value using the Key
        //replace("Key", "Old_Value", "New_Value") - replace the value
        System.out.println(table);
        System.out.println("Replacing the value of 'in' to 'Indonesia':" +table.replace("in","Indonesia"));
        System.out.println(table);
        //keySet() - to print all the Keys - returns the keyset
        // values() - retuen the values - returns the collection
        Set<String> keyset = table.keySet();
        System.out.println("The Keyset of the 'Table' is : "+keyset);
        Collection<String> value = table.values();
        System.out.println("The Values of the 'Table' is : "+value);
        //entrySet() - get all the entries - key,value pair
        Set<Map.Entry<String,String>> entryset = table.entrySet();
        System.out.println("The Entry set is : " +entryset);
        // Iterating over a map - using forEach loop
        for (Map.Entry<String, String> en: table.entrySet()){
            System.out.println("Key : "+en.getKey() +" and "+" Value : "+en.getValue());
        }





    }
}
