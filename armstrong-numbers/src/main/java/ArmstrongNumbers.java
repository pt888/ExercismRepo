import java.util.*;  
import java.lang.*;
class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int num=numberToCheck;
        List<Integer> li=new ArrayList<Integer>();  
        while(numberToCheck>0){
            int temp=numberToCheck%10;
            li.add(temp);
            numberToCheck/=10;
        }
        int n=li.size();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=Math.pow(li.get(i),n);
        }
        if(sum==num) return true;
        else return false;
    }

}
