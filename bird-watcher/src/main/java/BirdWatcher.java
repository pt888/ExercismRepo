
import java.util.*;
import java.lang.*;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        if(birdsPerDay.length==0) return 0;
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        int n=birdsPerDay.length;
       int count=birdsPerDay[n-1]+1;
        birdsPerDay[n-1]=count;
        //System.out.println(count);
    }

    public boolean hasDayWithoutBirds() {
        int n=birdsPerDay.length;
        for(int i=0;i<n;i++){
            if(birdsPerDay[i]==0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum=0;
        for(int i=0;i<Math.min(numberOfDays,7);i++){
            sum+=birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays=0;
        for(int i=0;i<birdsPerDay.length;i++){
            if(birdsPerDay[i]>=5) busyDays++;
        }
        return busyDays;
    }
}
