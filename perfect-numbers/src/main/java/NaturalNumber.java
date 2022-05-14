import java.util.Scanner;
import java.lang.Exception;
public class NaturalNumber {
    int num;
    NaturalNumber(int n){
        if(n<=0) throw new  IllegalArgumentException("You must supply a natural number (positive integer)");
        this.num=n;
    }
    public Classification getClassification() {
    Classification a = Classification.PERFECT;
        
       int sum=0;
        
        for(int i=1;i<num;i++){
            if(num%i==0) sum+=i;
        }
        if(sum==num) a=Classification.PERFECT;
        else if(sum>num) a=Classification.ABUNDANT;
        else a=Classification.DEFICIENT;
        return a;
    }
}

