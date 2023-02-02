public static void plusMinus(List<Integer> arr) {
    // Write your code here
    int negative_count = 0;
    int positive_count = 0;
    int zero_count = 0;
    int s = arr.size();
    for(Integer num : arr){
        if(num < 0) 
        negative_count+=1;
        else if(num > 0) 
        positive_count+=1;
        else 
        zero_count+=1; 
    }
   double p = (double)positive_count/s;
   double n= (double)negative_count/s;
    double z =(double)zero_count/s;
    System.out.println(String.format("%.6f",p));
    System.out.println(String.format("%.6f",n));
    System.out.println(String.format("%.6f",z));
    

    }
