public class StaticArray {
    private int[] array;
    private int size;
    private int length;

    // Constructor to declare size of the array and initialize it
    public StaticArray(int size) {
        this.size = size;
        this.array = new int[size];
        this.length = 0;
    }

    // Method to insert value inside the static array
    public void insert(int value) {
        if (length < size){
            array[length] = value;
            length++;
        } else {
            System.out.println("Array is FULL");
        }
    }

    // Method to delete value inside the static array
    public void delete(int value) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                for (int j = i; j < length - 1; j++) {
                    array[j] = array[j + 1];
                }
                length--;
            }
        }
    }

    // Method to traverse the static array
    public void traverse(){
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("]");
    }

    // Main method to test the program
    public static void main(String[] args) {
        StaticArray staticArray = new StaticArray(5);
        staticArray.insert(1);
        staticArray.insert(2);
        staticArray.delete(1);
        staticArray.traverse();
    }
}