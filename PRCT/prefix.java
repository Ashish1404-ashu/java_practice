public class prefix {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs [0];// first word as a input 
        for (String s : strs)// loop with th each word the array
        while(!s.startsWith(prefix))//loops work prefix start with s
        prefix=prefix.substring(0,prefix.length()-1);//checking the word from the behind -1
        return(prefix);
    }
    public static void main(String[] args) {
        String [] strs ={"flower" ,"flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
        
    }

        
    }