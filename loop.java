public class Main {
    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0]; // Step 1
        for (String s : strs)    // Step 2
            while (!s.startsWith(prefix)) // Step 3
                prefix = prefix.substring(0, prefix.length() - 1); // Step 4
        return prefix; // Step 5
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs)); // Output: fl
    }
}

