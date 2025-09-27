package Day2;

public class Valid_Perfect_square {
    public static void main(String[] args){
        int n = 4;
        System.out.println(isPerfectSquare(n));
    }


    public static boolean isPerfectSquare(int num) {
        int low = 0;
        int high = num;
        while(low<=high){
            int mid = low+(high-low)/2;
            if((long)mid*mid==num) return true;
            else if((long)mid*mid <num) {
                low = mid+1;
            }
            else {
                high = mid-1;
            }
        }
        return false;
    }
    
}
