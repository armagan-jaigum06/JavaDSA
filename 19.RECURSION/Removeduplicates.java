public class Removeduplicates {

    public static void DuplicateRemove(String str, int idx, StringBuilder newStr, boolean map[]){
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        // Work
        char currChar = str.charAt(idx);
        if (map[currChar-'a'] == true) {
            // duplicate
            DuplicateRemove(str, idx+1, newStr, map);
        } else {
            map[currChar - 'a'] = true;
            DuplicateRemove(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "aapnaacolleges";
        DuplicateRemove(str, 0, new StringBuilder(""), new boolean[26]);
        
    }
}
