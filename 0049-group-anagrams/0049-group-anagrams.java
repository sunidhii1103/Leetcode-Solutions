import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> frequencyStringsMap = new HashMap<>();

        for (String str : strs) {

            String frequencyString = getFrequencyString(str);

            if (frequencyStringsMap.containsKey(frequencyString)) {

                frequencyStringsMap.get(frequencyString).add(str);

            } else {

                List<String> strList = new ArrayList<>();
                strList.add(str);

                frequencyStringsMap.put(frequencyString, strList);
            }
        }

        return new ArrayList<>(frequencyStringsMap.values());
    }

    private String getFrequencyString(String str) {

        // Frequency array for 26 lowercase letters
        int[] freq = new int[26];

        // Count frequency of each character
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        // Build a unique frequency string
        StringBuilder frequencyString = new StringBuilder();

        char ch = 'a';

        for (int count : freq) {
            frequencyString.append(ch);
            frequencyString.append(count);
            ch++;
        }

        return frequencyString.toString();
    }
}