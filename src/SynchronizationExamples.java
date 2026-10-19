public class SynchronizationExamples {
    static class TicketCounter { private int tickets=3; synchronized void book(String user){ if(tickets>0){System.out.println(user+" booked ticket "+tickets--);}else System.out.println(user+" could not book");} }
    static class OddEven { private int n=1; synchronized void print(boolean odd){ while(n<=20){ while(n%2==0 != odd){try{wait();}catch(InterruptedException e){return;}} System.out.println(n++); notifyAll(); } } }
    public static void main(String[] args)throws Exception{ TicketCounter c=new TicketCounter(); Thread x=new Thread(()->c.book("A")); Thread y=new Thread(()->c.book("B")); Thread z=new Thread(()->c.book("C")); x.start();y.start();z.start();x.join();y.join();z.join(); OddEven oe=new OddEven(); Thread o=new Thread(()->oe.print(true)); Thread e=new Thread(()->oe.print(false));o.start();e.start();o.join();e.join(); }
}
