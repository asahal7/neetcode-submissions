class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> brackets = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                brackets.push(s.charAt(i));
                continue;
            }
            if (brackets.isEmpty()) return false;
            char top = brackets.pop();
            if (s.charAt(i) == ')') {
                if (top != '(') return false;
            }
            if (s.charAt(i) == '}') {
                if (top != '{') return false;
            }
            if (s.charAt(i) == ']') {
                if (top != '[') return false;
            }
        }
        return brackets.isEmpty();
    }
}
