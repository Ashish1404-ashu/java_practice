import java.util.*;
public class intersection {
    public static int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        Set<Integer>result = new HashSet<>();
        for (int num:nums1)set.add(num);
        for (int num :nums2)
        if(set.contains(num)) result.add(num);

        return result.stream().mapToInt(i->i).toArray();

    }
    public static void main (String []args){
        int []nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] res = intersection(nums1,nums2);
        System.out.println(Arrays.toString(res));
}
}