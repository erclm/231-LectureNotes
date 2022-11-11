/* 
    Multithreading allows us to take advantage of
    the massive amounts of computing power on our 
    laptops. 

    Your "dual core" or "quad core" processor means you can
    run multiple processes in parallel (why you can have slack
    up and visual studio code, and whatever game you're playing during class)
    
    By default, our programs run on only one thread, synchronously.
    But Java provides support out of the box for multi-threaded processing,
    allowing us to take advantage of computing power and run expensive calculations
    on multiple threads, what we call "in parallel".

    This is extremely common in data science, when you are training
    a model on hundreds of thousands of data points. 
*/
// we sign the contract with Runnable so Java knows we intend to use threads
public class Multithreading implements Runnable {
    int m_threadID;
    private static int count = 0;
    // create what we will use as a lock
    private static Object lock = new Object();
    
    public Multithreading(int id) {
        m_threadID = id;
    }

    private int expensiveCalculation() {
        int sum = 0;
        for (int i=0; i < 10000000; ++i) {
            sum++;
            // we wrap our race condition in a synchronized block
            // synchronized requires an object parameter
            // that will function as our key to access the shared resource
            synchronized(lock) {
                count++;
            }
        }
        return sum;
    }

    // we fulfill our agreement with Runnable
    // by providing a void run() method
    public void run() {
        System.out.println("I am thread " + m_threadID +": " + expensiveCalculation());
    }

    public static void main(String[] args) {
        Multithreading object1 = new Multithreading(1);
        Multithreading object2 = new Multithreading(2);
        // pass our objects of this class in to the constructor
        // for Thread() to create Thread objects we can run
        Thread thread1 = new Thread(object1);
        Thread thread2 = new Thread(object2);

        // run this multiple times and you will see 
        // that sometimes thread1 finishes first and sometimes thread2 finishes first
        // when we multithread our programs, we add a sprinkle of nondeterminitability
        // so debug before you introduce threading
        thread1.start();
        thread2.start();


        // what if we want to wait for both our threads to complete 
        // before we move on with our program?
        try {
            // join the threads back together
            // this throws a checked exception we have to handle
            thread1.join();
            thread2.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // this code runs after both threads are finished
        System.out.println("Threads have done their thing!");
        /* 
            Race Conditions
            ------------------
            We expect this to be sum x 2, because each thread 
            is incrementing the same shared variable by 1 every time 
            they increase their sum. 

            When the loop only runs a few times (100) that is in fact
            the result we see. But when we increase the times the loop runs 
            to 100,000, we see quite a different result. The value of count 
            is different every time we run our program (and it is wrong every time)
            
            This is the tell-tale sign of a race condition. Both threads are playing
            tug-of-war with the same resource, so each thread is overwriting some 
            of the other thread's operations - this is BAD and DIFFICULT TO DEBUG.
            
            We can prevent this a few ways, but the easiest way is to create a "lock"
            on the resource. If a thread has the lock, it can access the shared resource.
            If it doesn't, it has to wait its turn.
        */
        System.out.println("Count: " + count);
    }
}