class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        ArrayList<String> sorted = new ArrayList<String>();

        for(String x : strs)
        {
            char[] y = x.toCharArray();
            Arrays.sort(y);
            sorted.add(new String(y));
        }

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < sorted.size(); i++)
        {
            map.computeIfAbsent(sorted.get(i), k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}
