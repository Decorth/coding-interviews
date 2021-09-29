import java.util.HashSet;
// Implement an algorithm to determine if a string has all unique characters.

public class isUnique {
    public isUnique(){
    }

    public boolean isUniqueAlgo(String s){
        HashSet<Character> uniques = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(uniques.contains(s.charAt(i))){
                return false;
            }
            else{
                uniques.add(s.charAt(i));
            }
        }
        return true;
    }

    public boolean isUniqueAlgoNoADT(String s){
        int [] uniques = new int [128];
        int asciivalue;
        for(int i = 0; i < s.length(); i++){
            asciivalue = s.charAt(i);
            if(uniques[asciivalue] > 0){
                return false;
            }
            else{
                uniques[asciivalue]++;
            }
        }
        return true;
    }
}