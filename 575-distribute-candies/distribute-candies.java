class Solution {
    public int distributeCandies(int[] candyType) 
    {
     int n = candyType.length;
     int mini = Integer.MIN_VALUE;
     HashSet<Integer> set = new HashSet<>();
     for(int num : candyType)
     {
        set.add(num);
     }  
     int a = set.size();

     mini = Math.min(a, n/2);

    return mini; 
    }
}