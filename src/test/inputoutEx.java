package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class inputoutEx {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

//        Songlist s1 =  new Songlist(2, "mcthemax", "하하하");
//        Songlist s2 =  new Songlist(1, "abc", "가지마");
//        Songlist s3 =  new Songlist(3, "ddd", "ddd");
//        try {
//            FileWriter fw = new FileWriter("songlist.txt");
//            BufferedWriter bos =  new BufferedWriter(fw);
//            bos.write(s1.toString());
//            bos.append(s2.toString());
//            bos.append(s3.toString());
//            bos.close();
//            
//            
//            FileReader fr = new FileReader("songlist.txt");
//            BufferedReader br = new BufferedReader(fr);
//            String temp;
//            while((temp = br.readLine())!=null){
//             
//                System.out.println(temp);
//            }
//            br.close();
//        } catch (FileNotFoundException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        
     
        
        TreeMap<String, Songlist> ts = new TreeMap<>(new OrderFuc());
//        TreeMap<String key,Songlist s> ts = new TreeMap<String key,Songlist s>(new OrderFuc());
        ts.put("1", new Songlist(2, "mcthemax", "하하하"));
        ts.put("2",new Songlist(1, "abc", "가지마"));
        ts.put("3",new Songlist(3, "ddd", "ddd"));
        System.out.println(ts);
    }

}

class Songlist {

    int order;
    String autor;
    String title;

    public Songlist(int order, String au, String ti) {
        // TODO Auto-generated constructor stub
        this.order = order;
        this.autor = au;
        this.title = ti;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "order: "+order+"  autor:  "+autor+"  title: "+title;
    }


}

class OrderFuc implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        Songlist s1 = (Songlist)o1;
        Songlist s2 = (Songlist)o2;
        int n = s2.order - s1.order;
        if (n > 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        }
        return -1;
    }

}