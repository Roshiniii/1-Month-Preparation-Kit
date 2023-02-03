public static int birthday(List<Integer> s, int d, int m) {
    // Write your code here
    int count = 0;
    int n = s.size();
    for(int i = 0;i<n-(m-1);i++){
        int sum = 0;
        for(int j = i ; j<m+i;j++)
            {
                sum+=s.get(j);
            
            }
        if(sum == d){
                count++;
            }
        
    }
    return count;

    }
