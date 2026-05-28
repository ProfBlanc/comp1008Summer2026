class Main {
    public static void main(String[] args) {    
    String name = "comp1008";
        char first = name.charAt(0);
        System.out.println(first);
        int numChars = name.length();
        for(int i = 0; i < numChars; i++){
            System.out.println(name.charAt(i));
        }
        /*
index               0       1       2       3       4       5       6       7
char                c       o       m       p       1       0       0       8
        */
    
}

}