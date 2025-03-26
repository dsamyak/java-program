import java.util.*;

public class DataStructureDemo {

    public static void main(String[] args) {
      
        Vector<String> names = new Vector<>();
        names.add("Samyak");
        names.add("saurabh");
       names.add("Rajveer");
        System.out.println("Initial Vector: " + names);

        names.add("Sahil");
        names.remove("sumedh");
        System.out.println("Updated Vector: " + names);

        if (names.contains("bhushan")) {
            System.out.println("bhushan is in the Vector.");
        }
        Collections.sort(names);
        System.out.println("Sorted Vector: " + names);
 
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Initial ArrayList: " + numbers);

        numbers.add(4);
        numbers.remove(Integer.valueOf(1));
        System.out.println("Updated ArrayList: " + numbers);

        System.out.print("ArrayList elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        
        HashMap<String, Integer> studentMarks = new HashMap<>();
        studentMarks.put("saurabh", 90);

        studentMarks.put("Rajveer", 89);

        studentMarks.put("Samyak", 92);

      
        studentMarks.put("sahil", 88);
        studentMarks.remove("Sahil");
        System.out.println("Updated HashMap: " + studentMarks);

        String searchName = "saurabh";
        if (studentMarks.containsKey(searchName)) {
            System.out.println(searchName + "'s marks: " + studentMarks.get(searchName));
        } else {
            System.out.println(searchName + " not found in records.");
        }
    }
}