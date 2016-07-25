package test;

import test.Outer.Inner;
import test.Outer.Innera;

interface Hay{
    void say();
}


class Outer{
    private int a = 10;
    public int b = 2;
    public static int c =9;
    
    Hay anay = new Hay() {
        
        @Override
        public void say() {
            // TODO Auto-generated method stub
       
            System.out.println("say test");
            
        }
    };
    
    
    static class Inner{
        private static final int b = 20;
        
//        public int getA(){
//            
//            return ;
//        }
        public static int getB(){
            return b;
        }
    }
    
    public class Innera{
        public int b = 20;
        
//        public int getA(){
//            
//            return ;
//        }
      
    }
    
    
    private class PrivateInner{
        private int c = 30;
        public int getC(){
            return c;
        }
    }
    
    public int getA(){
        
        return a;
    }
    
    public int getB(){
        
        Inner in = new Inner();
        
        return in.getB();
    }
    
    public int getC(){
        PrivateInner pi = new PrivateInner();
        
        return pi.getC();
    }
    
    
}


public class nestedEx extends Outer{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Inner inn = new Inner();
        System.out.println("inn getB = "+new Inner().getB());
        System.out.println("inn getB = "+ Inner.getB());
        System.out.println("new Outer().c = "+ new Outer().c);
        Outer.Innera ina = new Outer().new Innera();
        System.out.println("new Outer().c = "+ ina.b);
        new Outer().anay.say();
//        PrivateInner pnn = new Outer().new PrivateInner();

    }

}
