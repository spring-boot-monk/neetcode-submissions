class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        if(s.length() % 2 != 0){
            return false;
        }
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(x == '(' || x == '{' || x == '['){
                stack.push(x);
            } else {
                if(stack.isEmpty()) return false;
                char y = stack.pop();
                if(x == ')' && y != '(') return false;
                if(x == '}' && y != '{') return false;
                if(x == ']' && y != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}