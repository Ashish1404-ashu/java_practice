import java.util.*;

public class arrayu {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner Sc =new Scanner(System.in);
        marks[0] =Sc.nextInt(); //phy
        marks[1] =Sc.nextInt(); // che 
        marks[2] =Sc.nextInt(); //math

        System.out.println("phy:"+marks[0]);
        System.out.println("chem:"+marks[1]);
        System.out.println("math:"+marks[2]);

        marks[2]=100;
        System.out.println("math:"+marks[2]);

    }
}
