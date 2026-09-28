class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int left = Integer.MAX_VALUE;
        int right = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            left = Math.min(left, day);
            right = Math.max(right, day);
        }

        while (left < right) {
            int day = left + (right - left) / 2;

            int bouquets = 0;
            int consecutive = 0;

            for (int bloom : bloomDay) {
                if (bloom <= day) {
                    consecutive++;

                    if (consecutive == k) {
                        bouquets++;
                        consecutive = 0;
                    }
                } else {
                    consecutive = 0;
                }
            }

            if (bouquets >= m) {
                right = day;       
            } else {
                left = day + 1;    
            }
        }

        return left;

    //     int low = Integer.MAX_VALUE;
    //     int high = Integer.MIN_VALUE;

    //     for(int bloom : bloomDay){
    //         low = Math.min(bloom , low);
    //         high = Math.max(bloom , high);

    //         while(low <= high){
    //             int mid = low + (high - low)/2;

    //             int bouquets = 0;
    //             int cons = 0;

    //             for(int bloome : bloomDay){
    //                 if(bloome <= mid){
    //                     cons ++;
    //                     if(bouquets == k){
    //                         bouquets ++;
    //                         cons = 0;
    //                     }
    //                     }else{
    //                         cons = 0;
    //                     }
    //             }
    //                 if(bouquets >= m){
    //                     high = mid;
    //                 }
    //                 else{
    //                     low = mid + 1;
    //                 }
    //             }
    // }return low;
}
}