class binarysearchop {
    public static int bsearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { -1,0,3,5,9,12};
        int key = 0;
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);}
        System.out.println("index of the target is :-" + bsearch(arr, key));
    }
}
//tc will be -O(logn)