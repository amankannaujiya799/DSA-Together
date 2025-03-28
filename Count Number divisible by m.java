class Solution {
    static int countDivisibles(int A, int B, int M){
        // code here
        int a = 0;
    
        for(int i = A; i<=B; i++)
        {
            if(i % M == 0)
            {
                   a++; 
            }
        
        }
      return a;
     
    }
    }