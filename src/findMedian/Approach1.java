package findMedian;

/**
 * find the median of two sorted arrays
 */
public class Approach1 {
    public static void main(String[] args) {
        //Arrays are sorted!
        int[] nums1 = {1, 1, 2, 3, 5, 8, 13, 21};
        int[] nums2 = {2, 3, 5, 7, 11, 13, 17, 19};

        double result = findMedian(nums1, nums2);
        System.out.println("Median: " + result);

    }

    private static double findMedian(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] result = new int[nums1.length + nums2.length];
        int p1 = 0;
        int p2 = 0;
        for (int i = 0; i < l-1; i++) {
            if (nums1[p1] < nums2[p2]) {
                result[i] = nums1[p1];
                p1++;
                if(p1 == nums1.length){
                    for(int j = p2; j < nums2.length; j++){
                        result[i+1] = nums2[j];
                        i++;
                    }
                }
            } else {
                result[i] = nums2[p2];
                p2++;
                if(p2 == nums2.length){
                    for(int j = p1; j < nums1.length; j++){
                        result[i+1] = nums1[j];
                        i++;
                    }
                }
            }
        }

        //Formular for median: even -> (n/2 + n/2-1)/2, odd -> n/2
        if(l % 2 == 0){
            return (double) (result[l/2] + result[l/2-1])/2;
        } else {
            return (double) result[l/2];
        }
    }
}