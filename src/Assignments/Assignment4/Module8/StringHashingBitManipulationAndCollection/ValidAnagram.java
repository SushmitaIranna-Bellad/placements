package Assignments.Assignment4.Module8.StringHashingBitManipulationAndCollection;

    class ValidAnagram {
        public boolean isAnagram(String s, String t) {
            if (s.length() != t.length()) return false;
            int[] count = new int[26];
            for (char c : s.toCharArray()) count[c - 'a']++;
            for (char c : t.toCharArray()) {
                count[c - 'a']--;
                if (count[c - 'a'] < 0) return false;
            }
            return true;
        }
        public static void main(String[] args) {
            ValidAnagram obj = new ValidAnagram();
            System.out.println(obj.isAnagram("listen", "silent")); // true
            System.out.println(obj.isAnagram("rat", "car"));       // false
        }
    }

