public class problemofarray {
   public static void main(String[] args) {
    int numbers[] ={23,12,6,7,15,3,5,56};

    int min = Integer.MAX_VALUE;

    for(int number:numbers){
        if(number <min){
            min = number;
        }
    }
    System.out.println("minimum is"+min);
   } 
}
