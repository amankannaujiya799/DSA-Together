class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        
        // code here
        int n = arr.length;
        int[] b = new int[n + 1]; 
        int repeating = -1;
        int missing = -1;
         for (int i = 0; i < n; i++) {
            b[arr[i]]++;
         }
            
        for (int i = 1; i <= n; i++) {
            if (b[i] == 0) {
                missing = i;
            }
                else if (b[i] == 2) 
                {
                repeating = i;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        return result;
    }
            }
        