package core.java.topic.executor_service;

import static java.util.concurrent.Executors.*;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @author shiyuanchen
 * @created 2020/05/01
 * @project course-april-2020
 */
public class Concurrency {

    class A {

        public String getMethod() {
            return "A.getMethod";
        }
    }

    class B {

        public String getMethod() {
            return "B.getMethod";
        }
    }

    public void runSameTime() {
        ExecutorService service = newFixedThreadPool(2);

        try {
            Future<String> aFuture = service
                .submit(() -> new Concurrency.A().getMethod());
            Future<String> bFuture = service
                .submit(() -> new Concurrency.B().getMethod());

            boolean allDone = false;
            while (!allDone) {
                if (aFuture.isDone() && bFuture.isDone()) {
                    System.out.println(bFuture.get() + " " + aFuture.get());
                    allDone = true;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }
    }

    public static void main(String[] args) {
        Concurrency concurrency = new Concurrency();
        concurrency.runSameTime();
    }
}
