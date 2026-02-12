import java.util.ArrayList;

class DynamicArray{
    
    public static void main(String args[]){
      
        // Creating an Array of string type
        ArrayList<String> a = new ArrayList<>();

        // 1. Adding elements to ArrayList at the end
        a.add("chicken");
        a.add("cheeks");

      	System.out.println("Original List : "+a);
      	
      	// Adding Elements at the specific index
        a.add(1, "For");

      	System.out.println("After Adding element at index 1 : "+ a);
      	
      	// 2. Removing Element using index
      	a.remove(0);
      
      	System.out.println("Element removed from index 0 : "+ a);
      	
      	// Removing Element using the value
      	a.remove("cheeks");
      
      	System.out.println("Element Geeks removed : "+ a);
      	
      	// 3. Updating value at index 0
      	a.set(0, "KFC");
      
        System.out.println("List after updation of value : "+a);
    }
}
