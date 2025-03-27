//practical no 13
public class WrapperClassDemo {

    public static void main(String[] args) {

      
        int primitiveInt = 10;
        double primitiveDouble = 20.5;
        char primitiveChar = 'A';
        
        
        Integer intObj = primitiveInt;  
        Double doubleObj = primitiveDouble;  
        Character charObj = primitiveChar;  

        System.out.println("Autoboxed Integer: " + intObj);
        System.out.println("Autoboxed Double: " + doubleObj);
        System.out.println("Autoboxed Character: " + charObj);

      
        int unboxedInt = intObj; 
        double unboxedDouble = doubleObj; 
        char unboxedChar = charObj; 

        System.out.println("\nUnboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Character: " + unboxedChar);

     
        String strInt = "123";
        String strDouble = "45.67";
        
       
        int parsedInt = Integer.parseInt(strInt);
        double parsedDouble = Double.parseDouble(strDouble);

        System.out.println("\nParsed Integer from String: " + parsedInt);
        System.out.println("Parsed Double from String: " + parsedDouble);
    }
}