package test;


class personb extends Thread{
    int money;
    int check;
    public personb(int money,int check) {
        // TODO Auto-generated constructor stub
        this.money = money;
        this.check = check;
    }
    @Override
    public void run() {
        
        if(check == 1){
            System.out.println(this.money+" 를 입금 하였습니다. ");       
            ThreadEx.b.deposit(this.money);
        }else{
            try {
                System.out.println(this.money+" 를 출금 하였습니다. ");       
                ThreadEx.b.withdraw(this.money);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        // TODO Auto-generated method stub
        super.run();
    }
}

public class ThreadEx {
    public static bank b = new bank();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = -123;
        Integer in = new Integer(123);
        Integer id = new Integer(123);
        String a = "aa";
        String b = new String("aa");
//        if(i==in)
        System.out.println("a = b "+(a==b));
        System.out.println("a = b "+(a.equals(b)));
        System.out.println("i = in "+(i==in));
        System.out.println("i = in "+(in.equals(i)));
        System.out.println("id = in "+(in==id));
        System.out.println("id = in.e "+(in==id.intValue()));
        System.out.println("in + id "+(123+"123"+id));
        
        int io = 010;
        int io1 = 5555;
        int io2 = 6666;
        System.out.println(io+"-"+io1+"-"+io2);
        
//        personb p1 = new personb(1000, 2);
//        personb p2 = new personb(800, 1);
//        personb p3 = new personb(900, 1);
//        System.out.println(p1.money);
//        System.out.println(p2.money);
//        System.out.println(p3.money);
//        p1.setName("david");
//        p2.setName("alter");
//        p3.setName("joy");
//        p1.start();
//        p2.start();
//        p3.start();
    }

}


class bank{
    public int money = 0;
    
    public synchronized void deposit(int money){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+"이"+money+" 를 입금 하였습니다. ");       
        this.money += money;
        System.out.println("잔약은 " + this.money + " 입니다");
        if(this.money > 0){
            this.notifyAll();
        }
    }
    public synchronized int withdraw(int money) throws InterruptedException{
        Thread t = Thread.currentThread();
        if(this.money == 0 || this.money < money){
            System.out.println("인출 금액이 부족 합니다.");
            this.wait();
        }
        System.out.println(t.getName()+"이"+money+" 를 인출 하였습니다. ");
        this.money -= money;
        System.out.println("잔약은 " + this.money + " 입니다");
        return this.money;
    }
}

