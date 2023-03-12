class twoSumsOptimised {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap(); //hashmap is faster than hashset
        for (int i = 0; i < nums.length; i++) {
            int secValue = target - nums[i];
            if (hashmap.containsKey(secValue)) {
                return new int[] {hashmap.get(secValue), i};
            }
            hashmap.put(nums[i], i);
        }
        return null;
    }
}
