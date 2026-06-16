class Solution {


    Set<String> set = new HashSet<>();
    HashMap<String,Boolean> map = new HashMap<>();
    boolean solve(String word){
        if(word.length()==0){
            return true;
        }

        if(map.containsKey(word)){
            return map.get(word);
        }
        for(int i=1;i<=word.length();i++){
            String left = word.substring(0,i);

            if(set.contains(left)){
                String right = word.substring(i);
                if(solve(right)){
                    map.put(word,true);
                    return true;
                }
            }
        }
        map.put(word,false);
        return false;
    }
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        
        List<String> lst = new ArrayList<>();
        
        for(String w : words){
            set.add(w);
        }

        for(String a : words){
            set.remove(a);
            map.clear();
            if(solve(a)){
                lst.add(a);
            }
            set.add(a);
        }



        return lst;

         
    }
}