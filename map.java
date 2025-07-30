import java.util.HashMap;

public class map {
    public static void main(String[] args) {
        HashMap<String ,Integer> hm = new HashMap<>();

        hm.put("india", 100);
        hm.put("Nepal", 100);
        System.out.println(hm);
       int population =  hm.get("india");
       System.out.println(population);
       System.out.println();
    }
    
}
