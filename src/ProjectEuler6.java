/*
 * Created by Alex Jerez on 3/21/15.
 */
public class ProjectEuler6 {

    public static void main(String[] args){

        long first = sumInd(100);
        long second = sumSum(100);
        System.out.println("Answer:"  + (second-first));
        //System.out.println("first ten natural numbers:"  + sumSum(100));

    }

    public static long sumInd(long total){
        long answer = 0;
        for (long i=total;i>=0;i--){
            answer += i*i;
        }
        return answer;

    }
    public static long sumSum(long total){
        long answer = 0;
        for (long i=total;i>=0;i--){
            answer += i;
        }
        return answer*answer;
    }
}
