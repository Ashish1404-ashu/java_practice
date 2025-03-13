public class problemofarray {
   public static void main(String[] args) {
    int numbers[] ={23,12,6,7,15,3,5,56};

    int max = Integer.MIN_VALUE;

    for(int number:numbers){
                if(number >max){
            max = number;
        }
    }
    System.out.println("maximum is"+ max);
   } 
}
