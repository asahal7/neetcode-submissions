class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to hold sorted string as key and list of anagrams as value
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert string to char array, sort it, then back to string
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add the original string to the correct anagram group
            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(s);
        }

        // Return all the anagram groups as a list of lists
        return new ArrayList<>(map.values());
    }
}

