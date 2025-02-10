public class Exo3 {
    public static void main(String[] args) {
        
        byte myByte = 1;
        short myShort = 2;
        int myInt = 3;
        long myLong = 4L;
        float myFloat = 5.0f;
        double myDouble = 6.0;
        char myChar = 'a';
        boolean myBoolean = true;

        // Types de Référence
        String myString = "Hello";
        Object myObject = new Object();
        Integer myInteger = 7;
        Double myDoubleWrapper = 8.0;
        int[] myArray = {9, 10, 11};

        // Affichage des valeurs
        System.out.println("myByte: " + myByte);
        System.out.println("myShort: " + myShort);
        System.out.println("myInt: " + myInt);
        System.out.println("myLong: " + myLong);
        System.out.println("myFloat: " + myFloat);
        System.out.println("myDouble: " + myDouble);
        System.out.println("myChar: " + myChar);
        System.out.println("myBoolean: " + myBoolean);

        System.out.println("myString: " + myString);
        System.out.println("myObject: " + myObject);
        System.out.println("myInteger: " + myInteger);
        System.out.println("myDoubleWrapper: " + myDoubleWrapper);
        System.out.println("myArray: " + java.util.Arrays.toString(myArray));
    }
}
