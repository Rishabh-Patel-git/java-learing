package list.arrayList;
import java.util.*;

public class MyArrayList {

	public static void main(String[] args) {
			
		// arraylist is a resizeable array or dynamic array 
		// internally it uses array but as size increases it double its size
		 
		// creating 
		ArrayList<String> fruit = new ArrayList<>();
					// or (preferable)
		List<String> vegetable = new ArrayList<>();
		
		// functions
		fruit.add("Apple");
		fruit.add("orange");
		//fruit.add(23);            // without generics
		vegetable.add("potato");
		
		// generics: in array list we can put different types of data types but generics helps us to define which type
		// it can also be used in classes
		ArrayList <String> animal = new ArrayList<>();
		
		animal.add("dog");
		//animal.add(23);    with generics it shows error    
		
		Pair <String, Integer> p1 = new Pair<>("rishabh", 23);
		System.out.println(p1);
		// integer not int from refer class 
		
		//methods
		//1. Add all used to merge two arraylists
		fruit.addAll(vegetable);
		
		//2. get(index)
		System.out.println(fruit.get(1));
		
		//3. set(index,value)
		System.out.println(fruit.set(1,"bannana"));
		
		//4. remove(index)
		
		//5. removeAll(index 1, index 2.... or other list and its elements) and clear();
		
		//6. contains()
		
		//7. size()
		System.out.println(fruit.size());
		
		// 8. isEmpty
		
		//9. toArray
		Object x = fruit.toArray();
		System.out.println(x);
			// or
		String[] temp = new String[fruit.size()];
		
		fruit.toArray(temp);
		for(String e: temp) {
			System.out.println(e);
		}
		
		
		
		
		
	}

}
