import java.util.Arrays;

class BoatsWeight {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        
        int boats = 0;
        int left = 0;
        int right = people.length-1;
        
        while(left <= right){
//            if(left == right){
//                boats++;
//                break;
//            }
            
            if(people[left] + people[right] <= limit){
                left++;
                right--;
            }else{
                right--;
            }
            boats++;
            
        }
        return boats;
    
    }
    
}
