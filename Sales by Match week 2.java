
    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
    int count=0;
    Map<Integer,Integer> map = new HashMap<>();
    for(int num : ar){
        map.put(num,map.getOrDefault(num,0)+1);
    }
    for(Entry<Integer,Integer> entry : map.entrySet()){
        int x = entry.getValue();
        count = count+ x/2 ;
    }
   return count;
    }
