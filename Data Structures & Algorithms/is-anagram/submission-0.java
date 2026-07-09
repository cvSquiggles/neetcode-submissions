class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        int length = sArray.length > tArray.length ? sArray.length : tArray.length;

        for(int i = 0; i < length; i++)
        {
            if(sArray[i] != tArray[i])
            {
                return false;
            }
        }

        return true;
    }
}
