public static String timeConversion(String s) {
    // Write your code here
    int size = s.length();
    String hour = s.substring(0,2);
    int int_hour = Integer.valueOf(hour);
    String format = s.substring(size-2);
    if(format.equals("AM") && int_hour == 12)
        return "00" + s.substring(2,size-2);
    else if(format.equals("PM") && (int_hour > 0 && int_hour <= 11) )
       { int_hour += 12;
        return String.valueOf(int_hour) + s.substring(2,size-2);

    }
    return  s.substring(0,size-2);
    

}
