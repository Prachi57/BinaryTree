class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return constructBinarymax(nums,0,nums.length-1);
    }
    public TreeNode constructBinarymax(int[] nums,int start,int end){
        if(start>end){
            return null;
        }
        int position = maxroot(nums,start,end);
        TreeNode root = new TreeNode(nums[position]);
        root.left=constructBinarymax(nums,start,position-1);
        root.right=constructBinarymax(nums,position+1,end);
        return root;
    }
    public int maxroot(int[] arr,int start,int end){
        int max=Integer.MIN_VALUE,maxidx=0;
        for(int i=start;i<=end;i++){
            if(max<arr[i]){
                max=arr[i];
                maxidx=i;
            }
        }
        return maxidx;
    }
}
