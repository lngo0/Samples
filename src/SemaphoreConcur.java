import java.util.concurrent.Semaphore;

public class SemaphoreConcur {
    Semaphore r2, r3;

    public SemaphoreConcur() {
        r2 = new Semaphore(0);
        r3 = new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        r2.release();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        r2.acquire();
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        r3.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        r3.acquire();
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
