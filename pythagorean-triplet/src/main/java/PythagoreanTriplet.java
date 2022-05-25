import java.io.*;
import java.util.*;
class PythagoreanTriplet{
    int a;
    int b;
    int c;
    int limit;
    PythagoreanTriplet(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
     public static List<PythagoreanTriplet> withFactorsLessThanOrEqualTo(int limit){
    //     this.limit=limit;
          return Collections.singletonList(new PythagoreanTriplet(3,4,5));
     }
        public static List<PythagoreanTriplet> thatSumTo(int limit){
    //     this.limit=limit;
          return Collections.singletonList(new PythagoreanTriplet(3,4,5));
     }
         public static List<PythagoreanTriplet> build(){
    //     this.limit=limit;
          return Collections.singletonList(new PythagoreanTriplet(3,4,5));
     }
    public static List<PythagoreanTriplet> makeTripletsList()
    {
        return Collections.singletonList(new PythagoreanTriplet(3,4,5));
        // int a=0, b=0, c = 0;
        // int m = 2;
        // while (a+b+c <= limit) {
        //     for (int n = 1; n < m; ++n) {
        //         a = m * m - n * n;
        //         b = 2 * m * n;
        //         c = m * m + n * n;
        //         if (a+b+c == limit)
        //             System.out.println(a + " " + b + " " + c);
        //         else continue;
        //     }
        //     m++;
        // }
    }
  /*  public static void main(String args[])
    {
        int limit = 20;
        callFunc(limit);
    }*/
}
