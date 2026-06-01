class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();

        for(int i = 0; i< nums.length; i++){
            int diff = target - nums[i];

            if(hMap.containsKey(diff)){
                return new int[]{hMap.get(diff), i};
            }
            hMap.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
