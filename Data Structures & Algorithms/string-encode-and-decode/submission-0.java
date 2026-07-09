class Solution {

    public String encode(List<String> strs) {
        String encodedString = "";

        for(String str : strs)
        {
            encodedString = encodedString.concat(str.length() + "#" + str);
        }

        System.out.println(encodedString);

        return encodedString;
    }

    public List<String> decode(String str) {

        List<String> decodedStrings = new ArrayList<String>();

        int i = 0;

        while(i < str.length()) {
            int j = i;

            while(str.charAt(j) != '#' && j < str.length())
            {
                j++;
            }

            int lenVal = Integer.parseInt(str.substring(i, j));

            System.out.println("j+1+lenVal is " + (j+1+lenVal) + "; lenVal is " + str.substring(i, j));

            System.out.println("String added: " + str.substring((j+1), (j+1+lenVal)));
            decodedStrings.add(str.substring((j+1), (j+1+lenVal)));
            i = j + lenVal + 1;
        }

        return decodedStrings;
    }
}
