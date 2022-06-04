import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Sum {
    public int[] two_sum (int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> ob = new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            if(ob.containsKey(target-numbers[i]))
            {
                result[0] = ob.get(target-numbers[i]);
                result[1] = i;
            }
            ob.put(numbers[i],i)
        }
            return result;
    }
}
