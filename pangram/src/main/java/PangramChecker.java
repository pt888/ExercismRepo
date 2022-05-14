public class PangramChecker {

    public boolean isPangram(String input) {
        String input1=input.toLowerCase();
        char arr[]=input1.toCharArray();
        boolean[] frequency = new boolean[26];
        int position = 0;
        for (int i = 0; i < input1.length(); i++) {
            if ('a' <= input1.charAt(i) && input1.charAt(i) <= 'z')
                position = input1.charAt(i) - 'a';
            else
                continue;
            frequency[position] = true;
        }
        for (int i = 0; i <= 25; i++)
        if (frequency[i] == false)
            return (false);
       return (true);
    }

}
