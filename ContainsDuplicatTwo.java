class ContainsDuplicatTwo {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
       
       HashSet<Integer> hs = new HashSet<Integer>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0; i<nums.length;i++){
           int firstInt=0;
            if(!hs.add(nums[i])){
                firstInt = hm.get(nums[i]);
                int sum = Math.abs(firstInt-i);

                if(sum <= k){
                    return true;
                }
            }

            hm.put(nums[i],i);
           
        }


        return false;
    }
}
