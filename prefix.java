public class prefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs [0];
        for (String s : strs)
        while(!s.startsWith(prefix))
        prefix=prefix.substring(0,prefix.length()-1);
        return(prefix);
    }
    public static void main(String[] args) {
        String [] strs ={"flower" ,"flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
        
    }

        
    }