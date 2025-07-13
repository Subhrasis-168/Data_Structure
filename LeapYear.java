// User function Template for Java
class LeapYear{
    public static String utility(int year) {
        String isLeap = "False";

        // Your code below
        // Assign True or False to isLeap
        // Your code above
        if(year % 4 == 0  && year % 100 != 0){
            return ("True");
        }else if(year % 400 == 0){

        // The line below returns the output
        return ("True");
            
        }else{
        return isLeap;
        }
        
    }
}