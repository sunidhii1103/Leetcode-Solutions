class Solution {

    public static int inversionCount(int[] arr) {
        return mergeSort(arr, 0, arr.length - 1);
    }

    private static int mergeSort(int[] arr, int st, int end) {
        if (st >= end) {
            return 0;
        }

        int mid = st + (end - st) / 2;

        int leftCount = mergeSort(arr, st, mid);
        int rightCount = mergeSort(arr, mid + 1, end);

        int invCount = merge(arr, st, mid, end);

        return leftCount + rightCount + invCount;
    }

    private static int merge(int[] arr, int st, int mid, int end) {

        int[] temp = new int[end - st + 1];

        int i = st;
        int j = mid + 1;
        int k = 0;

        int invCount = 0;

        while (i <= mid && j <= end) {

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {

                temp[k++] = arr[j++];

                // Count inversions
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int idx = 0; idx < temp.length; idx++) {
            arr[st + idx] = temp[idx];
        }

        return invCount;
    }
}
