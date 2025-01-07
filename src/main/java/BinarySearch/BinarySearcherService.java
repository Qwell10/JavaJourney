package BinarySearch;

import java.util.List;

public class BinarySearcherService {

    public int findIndex(List<Integer> numbers, int searchingInt) {
        numbers.sort(null);

        int leftIndex = 0;
        int rightIndex = numbers.size() - 1;

        while (leftIndex <= rightIndex) {
            int middle = (leftIndex + rightIndex) / 2;

            if (searchingInt == numbers.get(middle)) {
                return middle;
            } else if (searchingInt > numbers.get(middle)) {
                leftIndex = middle + 1;
            } else if (searchingInt < numbers.get(middle)) {
                rightIndex = middle - 1;
            }
        }
        return -1;
    }
}
