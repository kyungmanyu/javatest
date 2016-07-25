package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Super {
    int a = 1;
    long d;

    void setlong(long d){
        d = d;
    }
    
     void method() throws Exception {
        System.out.println("Super");
        new NumberFormatException();
    }
}

public class objectTest extends Super {
    public static void main(String[] args) throws Exception {

        objectTest o = new objectTest();
        int i = 4;
        o.setlong(i);
        HashMap props = new HashMap();
        props.put("key45", "aaaaa");
        props.put("key14", "bbbbbbb");
        props.put("key25", "cccccccc");
        Set s = props.keySet();
//        s = new TreeSet<>(s);
        Iterator ir = s.iterator();
        while(ir.hasNext()){
            System.out.println(" props.get(ir.next()) :  " + props.get(ir.next())); 
        }
        
     
        
        
        
        for (int x = 1; x < args.length; x++) {
            System.out.print(" args :  " + args[x]);
        }
        System.out.println();
        int num = 456;
        System.out.println(num - (((num % 100) % 10) - 1));


        char ch = 8;
        int a = 3;
        double c =  ch;
//        String s = ch;
        switch (ch) {

        case 8:

            System.out.print(" ch + a :  " + (ch + a));

        default:

            System.out.print(" default ");

        }

    }

    public void go(String[] y, int x) {

    }

    public void method() {
        System.out.print("Sub");
    }
}

//class Super{
//    public final void method1(){
//        
//    }
//}
//
//class Sub extends Super{
//    
//    public void method1(){
//        
//    }
//}

