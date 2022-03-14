
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] nums = {{11,2,4},{4,5,6},{10,8,-12}};
        List<List<Integer>> square = new ArrayList<>();

        for (int[] num : nums) {
            ArrayList<Integer> numRow = new ArrayList<>();
            for (int i : num) numRow.add(i);
            square.add(numRow);
        }

        System.out.println(plusMinus(square));
    }

    public static int plusMinus(List<List<Integer>> arr)
    {
        int one=0, two=0;
        for(int i = 0, j = arr.size()-1; i < arr.size(); i++, j--) {
            one += arr.get(i).get(i);
            two += arr.get(j).get(i); }
        return one>two?one-two:two-one;
    }
}
