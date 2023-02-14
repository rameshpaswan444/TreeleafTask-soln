class N_Digitsum
{
    
	
    public static void findNdigitNums(String result, int n, int sum)
    {
        // if the number is less than n–digit and its sum of digits is less than the given sum
      
        if (n > 0 && sum >= 0)
        {
            char d = '0';
            if (result.equals("")) {    
                d = '1';
            }
 
            // consider every valid digit and put it in the current index,
            // and recur for the next index
            while (d <= '9')
            {
                findNdigitNums(result + d, n - 1,sum - (d - '0'));
                d++;
            }
        }
 
        // if the number becomes n–digit and its sum of digits is equal to the given sum, print it
     
        else if (n == 0 &&sum == 0) {
            System.out.print(result + " ");
        }
    }
 
    public static void main(String[] args)
    {
        int n = 5;      // n–digit
        int sum = 42;    // given sum
 
        String result = "";
        findNdigitNums(result, n, sum);
    }
}
