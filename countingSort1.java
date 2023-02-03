    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    Map<Integer,Integer> map = new HashMap<>();
    for(int num :  arr){
        map.put(num,map.getOrDefault(num, 0)+1);
    }
    List<Integer> l = new ArrayList<>();
    for(int num = 0 ; num < 100 ; num++){
         if(map.containsKey(num)){
            l.add(map.get(num));
        }
        else{
            l.add(0);
        }
    }
    return l;
    }
