package test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class person implements Serializable{
    public int id;
    public String name;
    
    
    public person(int id,String name) {
        // TODO Auto-generated constructor stub
        this.id = id;
        this.name = name;
    }
    
    public String getName() {
        if(name.equals("david")){
            try {
                throw new Exception();
            } catch (Exception e) {
                // TODO Auto-generated catch block
               System.out.println("exception : "+e.toString());
            }
        }
        return name;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "id: "+id+"  name : "+name;
    }
    
}

class davidException extends Exception{

    public davidException() {
        // TODO Auto-generated constructor stub
        System.out.println("데이비드 익셉션");
        
    }

    public davidException(String string) {
        // TODO Auto-generated constructor stub
        super(string);
    }
    
    
}



public class serialEx {

    public static void main(String[] args) throws IOException, ClassNotFoundException, davidException{
        
        person p = new person(2,"david");
       
            p.getName();
         
        FileOutputStream fo =  new FileOutputStream("serial.dat");
        ObjectOutputStream oop = new ObjectOutputStream(fo);
        oop.writeObject(new person(1,"david"));
        oop.writeObject(new person(2,"max"));
        oop.close();
        
        FileInputStream fi = new FileInputStream("serial.dat");
        ObjectInputStream oip = new ObjectInputStream(fi);
        System.out.println("1번째 object : "+(person)oip.readObject());
        System.out.println("2번째 object : "+(person)oip.readObject());
        oip.close();
    }
}