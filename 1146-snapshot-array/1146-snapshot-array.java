class SnapshotArray {
    private final List<int[]>[]ll;
    private int snapId;
    public SnapshotArray(int length) {
        ll = new ArrayList [length];
        for(int i = 0 ; i < length; i++){
            ll[i] = new ArrayList<>();
            ll[i].add(new int[]{0,0});
        }
    }
    
    public void set(int index, int val) {
        List<int[]> nl = ll[index];
        int last = nl.size() - 1;

        if(nl.get(last)[0] == snapId){
            nl.get(last)[1] = val;
        } else {
            nl.add(new int[]{snapId , val});
        }
    }
    
    public int snap() {
        return snapId++;
    }
    
    public int get(int index, int snap_id) {
        List<int[]> nl = ll[index];

        int left = 0;
        int right = nl.size() - 1;

        while(left <= right){
            int mid = left + (right - left)/2;
            if(nl.get(mid)[0] <= snap_id){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return nl.get(right)[1];
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */