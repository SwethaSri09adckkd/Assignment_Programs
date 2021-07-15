class SortArrayByParity {
     void swap(int[] nums, int x, int y){       
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int i = 0, j = 1;
        while(i<n || j<n){
            while(i<n && nums[i]%2==0){
                i += 2;
            }
            while(j<n && nums[j]%2!=0){
                j += 2;
            }
            if(i<n && j<n)
            {
                swap(nums,i,j);
            }
            i += 2;
            j += 2;
        }
        return nums;
    }
}
