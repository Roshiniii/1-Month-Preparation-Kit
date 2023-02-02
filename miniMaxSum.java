public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    long sum=0,Min=0,Max=0;
    int n = arr.size();
    for(int num : arr){
        sum += num;
    }
    Max = sum - arr.get(0);
    Min = sum - arr.get(n-1);
    System.out.println(Min + " " + Max);

    }
