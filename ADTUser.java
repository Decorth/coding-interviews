public class ADTUser {
    public static void main(String[] args) {
        String [] strings = {"tree", "sofa", "cute", "mattress", "pen"};
        useStringBuilder(strings);
    }

    private static void useStringBuilder(String [] strings){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i < strings.length; i++){
            sb.append(strings[i]);
        }
        System.out.println(sb.toString());
    }
}
