public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    Map<String,Integer> map = new HashMap<String,Integer>();
    for(String s : strings){
        map.put(s,map.getOrDefault(s,0)+1);
    }
    List<Integer> res = new ArrayList<>();
    for(String s: queries){
        if(map.containsKey(s)){
            res.add(map.get(s));
        }
        else{
            res.add(0);
        }
    }
    return res;
    }
