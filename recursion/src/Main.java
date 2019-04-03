import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> nums = new ArrayList<>();

        String line = reader.readLine();
        while (!("").equals(line)) {
            int num = Integer.parseInt(line);
            nums.add(num);
            line = reader.readLine();
        }
        Integer sum = findSum(nums, 0);
        System.out.println(sum);

    }

    static Integer findSum(List<Integer> collection, int index) {
        if (index == collection.size()) {
            return 0;
        }
        return collection.get(index) + findSum(collection, index + 1);
    }
}
