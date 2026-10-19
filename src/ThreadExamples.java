public class ThreadExamples {
    static class EvenThread extends Thread { public void run(){ for(int i=2;i<=20;i+=2){System.out.println(i); pause(500);} } private void pause(long n){try{Thread.sleep(n);}catch(InterruptedException e){interrupt();}} }
    static class ReverseText implements Runnable { public void run(){ String s="MULTITHREADING"; for(int i=s.length()-1;i>=0;i--) System.out.println(s.charAt(i)); } }
    public static void main(String[] args) throws Exception { Thread a=new EvenThread(); Thread b=new Thread(new ReverseText()); a.start(); b.start(); a.join(); b.join(); System.out.println("Threads completed"); }
}
