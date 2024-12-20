public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 2;
        }
        // Accessing a valid index
        System.out.println(arr[0]); //This will print 0
        System.out.println(arr[4]); //This will print 8
        //To handle potential exceptions use try-catch blocks or check the index before accessing the element.

    }
}