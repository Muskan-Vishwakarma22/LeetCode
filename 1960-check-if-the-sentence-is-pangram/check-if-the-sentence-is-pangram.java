class Solution {
    public boolean checkIfPangram(String sentence) {
       int mask = 0;
       for(int i = 0; i<sentence.length();i++){
        int bit = sentence.charAt(i)-'a';
        mask = mask | (1 << bit);
       }
       return mask == (1<<26)-1;
    }
}