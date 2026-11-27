class Solution {
    public static String sort(String s){
        char[] ele = s.toCharArray();
        Arrays.sort(ele);
        String s2 = new String(ele);
        return s2;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String sorted = sort(strs[i]);
            if(map.containsKey(sorted)){
                map.get(sorted).add(strs[i]);
            }
            else{
               map.put(sorted, new ArrayList<String>());
               map.get(sorted).add(strs[i]);
            }
        } 
        List<List<String>> result = new ArrayList<>();
        for (ArrayList<String> list : map.values()) {
            result.add(list);
        }
    return result;
    }
}
