MySolution1
class Solution {
    public String reverseString(String s) {
     
    char[] words=s.toCharArray();
    int firstchar=0;
    int lastchar=s.length()-1;
    while(firstchar < lastchar){
        char temp;
        temp=words[firstchar];
        words[firstchar]=words[lastchar];
        words[lastchar]=temp;
        firstchar++;
        lastchar--;
    }
        return new String(words);
    
    }

}




MySolution2 

public class Solution {
    public String reverseString(String s) {
        StringBuilder r=new StringBuilder(s);
        r.reverse();
        return r.toString();
    }
}
        
  
       
