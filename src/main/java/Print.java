class Print
{

    static boolean II(int arr[], int n) {
        int i = 0;
        while (i < n - 1 && arr[i] <= arr[i + 1]) i++;
        if (i == n - 1)
            return false;

        i++;
        while (i < n - 1 && arr[i] <= arr[i + 1]) i++;
        if (i == n - 1 && arr[n - 1] <= arr[0])
            return true;
        else
            return false;
    }

    static boolean DD (int arr[], int n) {
        int i = 0;
        while (i < n - 1 && arr[i] >= arr[i + 1]) i++;
        if (i == n - 1) return false;

        i++;
        while (i < n - 1 && arr[i] >= arr[i + 1]) i++;
        if (i == n - 1 && arr[n - 1] >= arr[0])
            return true;
        else
            return false;
    }

    static boolean checkRotatedAndSorted(int arr[], int n){
        return II (arr, n) || DD (arr, n);
    }
}
