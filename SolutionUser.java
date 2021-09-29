public class SolutionUser {
    public static void main(String [] args){
        
        isUnique un = new isUnique();
        System.out.println(un.isUniqueAlgo("helloworld"));
        System.out.println(un.isUniqueAlgo("abcdefg"));
        System.out.println(un.isUniqueAlgo("abba"));
        System.out.println(un.isUniqueAlgo("heflh"));
        System.out.println(un.isUniqueAlgoNoADT("helloworld"));
        System.out.println(un.isUniqueAlgoNoADT("abcdefg"));
        System.out.println(un.isUniqueAlgoNoADT("abba"));
        System.out.println(un.isUniqueAlgoNoADT("heflh"));

        System.out.println("_________________________________________________");
        System.out.println("Permutations \n");

        Permutation perm = new Permutation();
        System.out.println(perm.isPerm("dog", "god"));
        System.out.println(perm.isPerm("seagull", "gullface"));
        System.out.println(perm.isPerm("racecar", "raceacar"));
        System.out.println(perm.isPerm("crane", "prane"));
    }
}