class Solution {
    public boolean isAnagram(String s, String t) {
        int m=s.length();
        int n=t.length();
        if(m!=n){
            return false;
        }
        else{
        int[] count=new int[26];
        for(int i=0;i<m;i++){
            int j=s.charAt(i)-'a';
            count[j]++;
        }

        for(int i=0;i<n;i++){
            int j=t.charAt(i)-'a';
            count[j]--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0)
            return false;
        }
        }
        return true;
    }
}