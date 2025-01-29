public class oops1 {
    public static void main(String[] args) {
                dog d1 = new dog();  // Create a new dog object
                d1.bark();            // Call the bark method
            }
        }
        
        class dog {
            String name;   // Corrected from 'string' to 'String'
            int age;       // You may initialize 'age' here if needed
            String colour; // Corrected from 'string' to 'String'
        
            void bark() {
                System.out.println("Dog is barking");
            }
        }
        