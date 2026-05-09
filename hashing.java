import java.util.HashMap;

public class hashing {
    public static void main(String[] args) {
        HashMap<String,Integer>hm =new HashMap<>();
        hm.put("india", 1120);
        hm.put("indonesia  ", 100);

         System.out.println(hm);

        int population=  hm.get("india");
        System.out.println(population);

        int remove=hm.remove("india");
        System.out.println(remove);


        hm.put("Frontend", 1000);
        int number = hm.get("Frontend");
        System.out.println(number);

    }
}
