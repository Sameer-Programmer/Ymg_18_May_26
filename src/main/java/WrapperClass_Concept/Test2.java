package WrapperClass_Concept;

public class Test2 {
    static void main(String[] args) {
        Integer in1 = 10;
//System.out.println(in1);
       // System.out.println(in1.doubleValue());
        String s1 = "100.50";
//System.out.println(s1);

      //  int x  = Integer.parseInt(s1);
        //   System.out.println(x);  // invalid compile time
        double d = Double.parseDouble(s1);
        System.out.println(d);
        String s2 = "xtrue";
        boolean b1 = Boolean.parseBoolean(s2);
        System.out.println(b1);



    }
}
