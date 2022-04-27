package Arrays;

public class CountingSubarraysEasy {
    public int solve(int[] A, int B) {
        int count = 0;
        for(int i = 0; i < A.length; i++){
            int sum = 0;
            for(int j = i; j < A.length; j++){
                sum += A[j];
                if(sum < B){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        CountingSubarraysEasy cs = new CountingSubarraysEasy();
        int[] A = new int[]{2, 5, 6};
        int B = 10;
        System.out.println(cs.solve(A,B));
    }
}
