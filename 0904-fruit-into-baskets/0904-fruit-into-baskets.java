class Solution {
    public int totalFruit(int[] fruits) {
        
    HashMap<Integer, Integer> map = new HashMap<>();

        int left = 0;
        int max = 0;

        for (int right = 0; right < fruits.length; right++) {

            // Add the fruit entering the window
            map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);

            // If there are more than 2 fruit types
            while (map.size() > 2) {

                // Remove the fruit leaving the window
                map.put(fruits[left], map.get(fruits[left]) - 1);

                if (map.get(fruits[left]) == 0) {
                    map.remove(fruits[left]);
                }

                left++;
            }

            // Current window length
            int length = right - left + 1;

            // Store the maximum length
            max = Math.max(max, length);
        }

        return max;
    }
}