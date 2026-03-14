package thread;
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    static int count =1;
    final static int limit = 20;
    public static void main(String[] args) {
        Main main = new Main();
        Thread t1 = new Thread(()->{

            try{
                main.printEven();
            }catch(Exception e){

            }

        },"even");
        Thread t2 = new Thread(()->{

            try{
                main.printOdd();
            }catch(Exception e){

            }

        },"odd");

        t1.start();
        t2.start();


    }





    public synchronized  void printEven() throws Exception{
        while(count<limit){
            while(count%2==0){
                wait();
            }


            System.out.println(Thread.currentThread().getName()+" --- "+count);
            count++;
            notify();

        }
    }



    public synchronized  void printOdd() throws Exception{
        while(count<limit){
            while(count%2!=0){
                wait();
            }


            System.out.println(Thread.currentThread().getName()+"----"+count);
            count++;
            notify();

        }

    }
}