// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        // Create a Java program named TypeCastingPractice that converts a double value to an int and prints both the original and converted values.
        
        double v1 = 12.34;
        int v2 = (int)v1;
        String s1 = "98";
        StringBuilder s2 = new StringBuilder("98.76");
        int v3 = Integer.parseInt(s1);
        float v4 = Float.parseFloat(s2.toString());
        double v5 = Double.parseDouble(s2.toString());

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(v4);

    }
}