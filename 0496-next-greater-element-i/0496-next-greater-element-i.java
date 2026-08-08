class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int [] arr = new int[nums1.length];
         int k = 0;
         for(int i = 0 ; i < nums1.length ;i++){
             for(int j = 0 ; j < nums2.length ; j++){
                
                if(nums1[i] == nums2[j]){
                    k = j;
                }
             }
                if(k == nums2.length - 1){
                    arr[i] = -1;
                    
                }

                
                
                    int a = nums1[i];
                    for(int l = k+1 ; l < nums2.length ; l ++){
                        if(nums2[l] > a){
                            arr[i] = nums2[l];
                            break; 
                        }
                        else{
                            arr[i] = -1;
                        }
                        
                    }
    }
          return arr;      
         }

    }
// import java.util.*;

// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         HashMap<Integer, Integer> nextGreater = new HashMap<>();
//         Stack<Integer> stack = new Stack<>();

//         for (int i = 0; i < nums2.length; i++) {
//             while (!stack.isEmpty() && nums2[i] > stack.peek()) {
//                 nextGreater.put(stack.pop(), nums2[i]);
//             }

//             stack.push(nums2[i]);
//         }

//         int[] answer = new int[nums1.length];

//         for (int i = 0; i < nums1.length; i++) {
//             answer[i] = nextGreater.getOrDefault(nums1[i], -1);
//         }

//         return answer;
//     }
// }