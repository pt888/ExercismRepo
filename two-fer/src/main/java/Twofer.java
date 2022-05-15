public class Twofer {
    public String twofer(String name) {
        if(name==null) return("One for you, one for me.");
        
            String ans="One for ";
            ans+=name;
            ans+=", one for me.";
            return ans;
    }
}
