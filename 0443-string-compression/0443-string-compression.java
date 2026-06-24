class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int i = 0;
        int idx = 0;

        while (i < n) {

            char ch = chars[i];
            int count = 0;

            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            chars[idx++] = ch;

            if (count > 1) {
                String str = String.valueOf(count);

                for (char digit : str.toCharArray()) {
                    chars[idx++] = digit;
                }
            }
        }

        return idx;
    }
}