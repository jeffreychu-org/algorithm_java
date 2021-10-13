public class QuickSort {
    /**
     * Quick Sort is very much like BST's Pre-order traversal !
     */
    public static void quick_sort(int[] nums){
        quick_sort(nums, 0, nums.length - 1);
    }

    public static void quick_sort(int[] nums, int left_i, int right_i){
        /** end condition - one-element array is sorted already **/
        if(left_i == right_i) return;
        if(left_i > right_i) return;;

        /** main logic - conquer - pick pivot **/
        int pivot_i_guess = pick_pivot_index(nums, left_i, right_i);

        /** main logic - conquer - sort the current array chunk - pivot index would be moved around here **/
        int pivot_final = sort(nums, left_i, pivot_i_guess, right_i);

        /** data flow - divide **/
        quick_sort(nums, left_i, pivot_final - 1);
        quick_sort(nums, pivot_final + 1, right_i);
    }

    public static int sort(int[] nums, int start_i, int pivot_i_guess, int end_i){
        /** goal: use existing space only ! **/
        int pivot_i_now = pivot_i_guess;

        /** step01: swap pivot value to the last element **/
        /** purpose: 讓左側部分先整理好 (最後再將pivot element放到適當位置) **/
        swap(nums, pivot_i_now, end_i); // swap value
        pivot_i_now = end_i; // update index

        /** step02: sort the rest of the array **/
        int left_i = start_i;
        int right_i = end_i - 1;
        while (true){

            while(true){
                if (left_i == right_i) break;                   /** end condition **/
                if(nums[left_i] > nums[pivot_i_now]) break;     /** main logic - 找出不應該出現在「左」側的數 **/
                left_i++;                                       /** next step **/
            }

            while(true){
                if (left_i == right_i) break;                   /** end condition **/
                if(nums[right_i] < nums[pivot_i_now]) break;    /** main logic - 找出不應該出現在「右」側的數 **/
                right_i--;                                      /** next step **/
            }

            if(left_i == right_i) break;                        /** end condition **/

            swap(nums, left_i, right_i);                        /** main logic - swap **/
        }

        /** step03: put pivot element to the right place **/
        int meeting_point_i = left_i; // or meeting_point_1 = right_i;
        if (nums[meeting_point_i] >= nums[pivot_i_now]) {
            swap(nums, pivot_i_now, meeting_point_i);
            pivot_i_now = meeting_point_i;
        }
        // if all element are similar than pivot element, then no need to swap element anywhere

        return pivot_i_now;
    }

    private static void swap(int[] nums, int left_i, int right_i) {
        int tmp = nums[left_i];
        nums[left_i] = nums[right_i];
        nums[right_i] = tmp;
    }

    private static int pick_pivot_index(int[] nums, int left_i, int right_i) {
        int result = (left_i + right_i)/2;
        return result;
    }
}
