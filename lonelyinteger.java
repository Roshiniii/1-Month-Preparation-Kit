public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    int unique=0;
    Map<Integer,Integer> map = new HashMap<Integer,Integer>();
    for(int num : a){
        if(!map.containsKey(num)){
            map.put(num,1);
        }
        else{
            int count = map.get(num);
            map.put(num,count+1);
        }
    }
    Integer value = 1;
    for(Entry<Integer , Integer> entry: map.entrySet()) {
        if(entry.getValue() == value)
        unique = entry.getKey();
    }
    
return unique;
}
