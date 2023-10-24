package com.cbfacademy;

public class SortingAlgo {
    // mergeSort(arr, left, right):
    public void mergeSort(int[] arr, int left, int right) {

        if (left < right)
            return;
        // mid is the point where the array is divided into two sub arrays

        int mid = (left + right) / 2;
        // recursive call to each sub arrays
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, mid);

        merge(arr, left, mid, right);
    }

    private void merge(int[] array, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        // fill the left and right array
        for (int i = 0; i < n1; i++)
            L[i] = array[p + i];
        for (int j = 0; j < n2; j++)
            M[j] = array[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0;
        j = 0;
        k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        // for sorting in descending
        // use if(L[i] >= <[j])
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = M[j];
            j++;
            k++;
        }
    }

    public void quickSort(int[] arr, int startIndex, int endIndex) {

        if (startIndex < endIndex) {
            // Partition the array and get the index of the pivot element
            int pivotIndex = partition(arr, startIndex, endIndex);

            // Recursively sort the subarrays on either side of the pivot
            quickSort(arr, startIndex, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, endIndex);

        }
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        // Choose the rightmost element as the pivot
        int pivot = arr[endIndex];

        // Initialise the index of the element representing the boundary of the lower
        // sub-array
        int boundaryIndex = startIndex - 1;

        for (int currentIndex = startIndex; currentIndex <= endIndex - 1; currentIndex++) {
            if (arr[currentIndex] <= pivot) {
                // Increment the boundary of the lower sub-array
                boundaryIndex = boundaryIndex + 1;

                // Move the current element into the lower sub-array
                swap(arr, boundaryIndex, currentIndex);
            }
        }

        // Move the pivot value between the lower and upper sub-arrays
        swap(arr, boundaryIndex + 1, endIndex);

        // Return the index of the pivot element
        return boundaryIndex + 1;
    }

    // Move the pivot value between the lower and upper sub-arrays
    private static void swap(int[] arr, int leftIndex, int rightIndex) {

        int temp = arr[leftIndex];

        arr[leftIndex] = arr[rightIndex];
        arr[rightIndex] = temp;
    }

    public static int binarySearch(int[] intArray, int x) {
        int low = 0;
        int high = intArray.length - 1;
        while (low <= high) {
            // mid = (low + high)/2
            int mid = (high + low) / 2;
            // if (x == arr[mid])
            if (intArray[mid] == x) {
                // return mid
                return mid;
            }
            // else if (x > arr[mid]) // x is on the right side
            else if (x > intArray[mid]) {
                // low = mid + 1
                low = mid + 1;
            }
            // else
            // x is on the left side
            else {
                // high = mid - 1
                high = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return arr[i];
            }
        }
        return -1; 
    }

}