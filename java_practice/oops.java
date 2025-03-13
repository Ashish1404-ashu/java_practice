public class oops {
    public static void main(String[] args) {
                dog d1 = new dog();  // Create a new dog object
                d1.bark();            // Call the bark method
            }
        }
        
        class dog {
            String name;   // Define the name of the dog
            int age;       // Define the age of the dog
            String colour; // Define the colour of the dog
        
            // The bark method implementation
            void bark() {
                System.out.println("Dog is barking");
            }
        }
        
