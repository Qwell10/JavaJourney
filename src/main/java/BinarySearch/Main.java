package BinarySearch;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        BinarySearcherService service = new BinarySearcherService();

        List<Integer> numbers = Arrays.asList(5,3,1,9,8);

        System.out.println(service.findIndex(numbers, 8));
    }
}
