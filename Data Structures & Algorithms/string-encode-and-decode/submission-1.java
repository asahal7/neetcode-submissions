class Solution {

    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append('#').append(str);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // Find the position of the next '#'
            int j = i;
            while (s.charAt(j) != '#') {
                j++;
            }

            // Extract the length and convert to int
            int length = Integer.parseInt(s.substring(i, j));

            // Extract the string of that length
            String str = s.substring(j + 1, j + 1 + length);
            result.add(str);

            // Move the index past the current string
            i = j + 1 + length;
        }

        return result;
    }
}


