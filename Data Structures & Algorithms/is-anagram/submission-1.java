class Solution {
    public boolean isAnagram(String s, String t) {

        int m = s.length();
        int n = t.length();
        if(m!=n){
            return false;
        }
        Map<Character,Integer> smap = new HashMap<>();
        Map<Character,Integer> tmap = new HashMap<>();
        for(int i=0;i<n;i++){
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }
        for(int i=0;i<m;i++){
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> e: smap.entrySet()){
            if (!e.getValue().equals(tmap.get(e.getKey()))) {
                return false;
            }
        }
        return true;

    }
}
