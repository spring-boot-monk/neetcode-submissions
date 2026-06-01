class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<2){
            return true;
        }
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int l = 0, r = s.length()-1;
        while (l < r) {
            if (!((ch[l] >= '0' && ch[l] <= '9') || (ch[l] >= 'a' && ch[l] <= 'z'))) {
                l++;
                continue;
            }
            if (!((ch[r] >= '0' && ch[r] <= '9') || (ch[r] >= 'a' && ch[r] <= 'z'))) {
                r--;
                continue;
            }
            if (ch[l] != ch[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
