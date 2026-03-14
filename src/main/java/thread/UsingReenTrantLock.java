package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UsingReenTrantLock {
    static int count= 0;
    final static int limit =20;
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();
    public static void main(String[] args)  {
        Main main = new Main();
        Thread t1 = new Thread(()->{

            try{
                main.printEven();

            }catch(Exception e){

            }

        },"odd");
        Thread t2 = new Thread(()->{

            try{

                main.printOdd();

            }catch(Exception e){

            }

        },"even");

        t1.start();
        t2.start();


    }


    public void printOdd(){
        lock.lock();
        try{

            while(count<limit){

                while(count%2==0){
                    condition.await();
                }
                System.out.println(count+" -- "+Thread.currentThread().getName());
                count++;
                condition.signal();
            }

        }catch(Exception e){

        }finally{
            lock.unlock();
        }
    }


    public void printEven(){
        lock.lock();
        try{
            while(count<limit){
                while(count%2!=0){
                    condition.await();

                }

                System.out.println(count+" -- "+Thread.currentThread().getName());
                count++;
                condition.signal();

            }

        }catch(Exception e){

        }finally{
            lock.unlock();
        }
    }
}
