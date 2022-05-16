import java.util.*;
class TwelveDays {
    public static Map<Integer,String> DayMap=new HashMap<Integer,String>();
    public static Map<Integer,String> verseMap=new HashMap<Integer,String>();
    public static void initializeMaps(){
    DayMap.put(1,"first");
    DayMap.put(2,"second");
    DayMap.put(3,"third");
    DayMap.put(4,"fourth");
    DayMap.put(5,"fifth");
    DayMap.put(6,"sixth");
    DayMap.put(7,"seventh");
    DayMap.put(8,"eighth");
    DayMap.put(9,"ninth");
    DayMap.put(10,"tenth");
    DayMap.put(11,"eleventh");
    DayMap.put(12,"twelfth");
    verseMap.put(1,"a Partridge in a Pear Tree.");
    verseMap.put(2,"two Turtle Doves, ");
    verseMap.put(3,"three French Hens, ");
    verseMap.put(4,"four Calling Birds, ");
    verseMap.put(5,"five Gold Rings, ");
    verseMap.put(6,"six Geese-a-Laying, ");
    verseMap.put(7,"seven Swans-a-Swimming, ");
    verseMap.put(8,"eight Maids-a-Milking, ");
    verseMap.put(9,"nine Ladies Dancing, ");
    verseMap.put(10,"ten Lords-a-Leaping, ");
    verseMap.put(11,"eleven Pipers Piping, ");
    verseMap.put(12,"twelve Drummers Drumming, ");
    }
   


    String verse(int verseNumber) {
        initializeMaps();
       String temp="On the "+DayMap.get(verseNumber)+" day of Christmas my true love gave to me: ";
       for(int i=verseNumber;i>0;i--){
           if(i==1 && verseNumber>1) temp+="and ";
           temp+=verseMap.get(i); 
       }
        temp+="\n";
       return temp;
    }

    String verses(int startVerse, int endVerse) {
        String ans="";
       for(int i=startVerse;i<=endVerse;i++){
           ans+=verse(i);
           if(i!=endVerse) ans+="\n";
       }
        return ans;
    }
    
    String sing() {
        return verses(1,12);
    }
}
