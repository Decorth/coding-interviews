public class ADTUser {
    public static void main(String[] args) {
        String [] strings = {"tree", "sofa", "cute", "mattress", "pen"};
        useStringBuilder(strings);
        useHashTable();
        useArrayList();
    }

    private static void useStringBuilder(String [] strings){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < strings.length; i++){
            sb.append(strings[i]);
        }
        System.out.println(sb.toString());
    }

    private static void useHashTable(){
        HashTable<String, Integer> hs = new HashTable<>();
        hs.put("one", 1);
        hs.put("two", 2);
        hs.put("three", 3);
        hs.put("four", 4);
        System.out.println(Integer.toString(hs.get("four")));
        System.out.println(Integer.toString(hs.get("three")));
        System.out.println(Integer.toString(hs.get("two")));
        System.out.println(Integer.toString(hs.get("one")));
    }

    private static void useArrayList(){
        ArrayList<String> aList = new ArrayList<>();
    }
}
