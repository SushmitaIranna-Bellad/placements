package Assignments.Assignment4.Module8.StringHashingBitManipulationAndCollection;
// LeetCode 49 - Group Anagrams
import java.util.*;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        GroupAnagrams obj = new GroupAnagrams();
        String[] words = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(obj.groupAnagrams(words));
    }
}

