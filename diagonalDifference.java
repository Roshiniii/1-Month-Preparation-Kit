public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    int l_to_r = 0;
    int r_to_l = 0;
    int size = arr.size();
    for(int i=0;i<size;i++){
        l_to_r += arr.get(i).get(i);
        r_to_l += arr.get(i).get(size-(i+1));
    }
    return Math.abs(l_to_r - r_to_l);
    }
