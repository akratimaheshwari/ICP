import java.util.Arrays;
public class Boats_to_save_prople {
    
    public int numRescueBoats(int[] people, int limit) {
        int l=0;
        Arrays.sort(people);
        int r=people.length-1;
        int boat = 0;
        
        while(l<=r){
            if(people[l]+people[r]<=limit){
                boat++;
                l++;
                r--;
            }
            else{
                boat++;
                r--;
            }

        }
        return boat;
    }
}

