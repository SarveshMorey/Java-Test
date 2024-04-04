public class MergeArrays {
    public static void mergeArrays(int[] destination, int[] source) {
        int m = destination.length;
        int n = source.length;

        int i = n - 1; 
        int j = 0;   
        int k = 0;  

        while (i >= 0) {
            if (destination[i] != 0) {
                destination[m - 1 - k] = destination[i];
                k++;
            }
            i--;
        }
        i = m - k; 
        while (i < m && j < n) {
            if (destination[i] < source[j]) {
                destination[k] = destination[i];
                i++;
            } else {
                destination[k] = source[j];
                j++;
            }
            k++;
        }

        while (j < n) {
            destination[k] = source[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] destination = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] source = {1, 8, 9, 10, 15};
        mergeArrays(destination, source);
        System.out.print("Merged array: ");
        for (int num : destination) {
            System.out.print(num + " ");
        }
    }
}
