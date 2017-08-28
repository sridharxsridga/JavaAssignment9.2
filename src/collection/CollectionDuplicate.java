/*
 * Program to build any collection containing duplicates. Creating its copy with all duplicates removed.
 * This program stores the string values containing duplicates in array list, and to eliminate duplicates passing the values to Liked hash set.
 * and store back the results to arraylist, filtering the duplicate values and displaying the unique names
 * 
 */
package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class CollectionDuplicate {

	public static void main(String[] args) {
ArrayList<String> list = new ArrayList<String>(); //Array list to store name as String variable, Array list stores duplicate values
list.add("Sridhar"); // adding elements to list
list.add("Amit kumar");
list.add("Rajiv");
list.add("Siddhart");
list.add("Sridhar");
list.add("Rajiv");
list.add("Amit kumar");

//traversing list
Iterator iterator1 =list.iterator();
System.out.println("Collection with duplicates");
while(iterator1.hasNext()) {
	System.out.println(iterator1.next());
	
}
/*
 *To Eliminate duplicate values , storing the values from arraylist to linked hash set, which stores only unique values and passing the hashset values to array list listWithOutDuplicate  
 */
ArrayList<String> listWithOutDuplicate = new ArrayList<String>(new LinkedHashSet<String>(list)); 
Iterator iterator2 =listWithOutDuplicate.iterator();// iterator to iterate the elements present in listWithOutDuplicate
System.out.println("\nCollection without duplicates");
while(iterator2.hasNext()) {
	System.out.println(iterator2.next());
	
}


	}

}
