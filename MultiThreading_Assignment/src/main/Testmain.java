package main;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Testmain {
    // Question1
/*    public static void main(String[] args) {
     new Thread(new Question1()).start();
        new Thread(new Question1_()).start();
    }
}
*/
    //Question2
   /*  public static void main(String[] args)throws InterruptedException {
         Thread thread1 = new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     Thread.sleep(1000L);
                     System.out.println("Running 1st Thread");
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         });
         Thread thread2 = new Thread(new Runnable() {
             @Override
             public void run() {
                 try {
                     Thread.sleep(1000L);
                     System.out.println("Running 2nd Thread");
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         });
         thread1.start();
         thread2.start();
         thread1.join();
         thread2.join();
         System.out.println("Ended....");

    }
}*/

    //Question3 ,4 & 5
  /*  public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        try {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 1");
                }
            });

            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Thread 2");
                }
            });

        } finally {
           executorService.shutdown();
            // Q4
            //  executorService.shutdownNow();
            //  Q5
          //  System.out.println(executorService.isShutdown());
           // System.out.println(executorService.isTerminated());
        }
    }
}*/

    //Question6

  /*  public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> integerFuture = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });

        executorService.shutdown();

        if (integerFuture.isDone()) {
            System.out.println(integerFuture.get());
        }

        if (integerFuture.isCancelled()) {
            System.out.println("Your task has been cancelled");
        }
    }
} */

    // Question7
 /*   public static void main(String[] args)  throws InterruptedException {
        List<Callable<Integer>> runnableList = new ArrayList<>();

        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
        runnableList.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 3;
            }
    });
    ExecutorService executorService = Executors
                    .newSingleThreadExecutor();

            List<Future<Integer>> futureList = executorService.invokeAll(runnableList);
        for (Future<Integer> e : futureList) {
            if (e.isDone()) {
                try {
                    System.out.println(e.get());
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                } catch (ExecutionException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
} */

// Question8

 /*   public static void main(String[] args)  throws ExecutionException, InterruptedException {

        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.schedule(new Runnable() {
                              @Override
                              public void run() {
                                  System.out.println("Task executed after 1 second");
                              }
                          },
                        1,
                        TimeUnit.SECONDS);

        executorService
                .scheduleWithFixedDelay(new Runnable() {
                                            @Override
                                            public void run() {
                                                try {
                                                    Thread.sleep(2000L);
                                                    System.out.println("ScheduleWithFixedDelay Scheduled Task to executed after fixed interval");
                                                } catch (InterruptedException e) {
                                                    e.printStackTrace();
                                                }

                                            }
                                        }
                        ,
                        0,
                        1,
                        TimeUnit.SECONDS);

        executorService
                .scheduleAtFixedRate(new Runnable() {
                                         @Override
                                         public void run() {
                                             try {
                                                 Thread.sleep(2000L);
                                                 System.out.println("ScheduleAtFixedRate Scheduled Task to executed after fixed interval");
                                             } catch (InterruptedException e) {
                                                 e.printStackTrace();
                                             }
                                         }
                                     }
                        ,
                        0,
                        1,
                        TimeUnit.SECONDS);


    }
}
*/

    //Question9

 /*   public static void main(String[] args) {
                ExecutorService executorService= Executors.newFixedThreadPool(3);
     //   ExecutorService executorService= Executors.newCachedThreadPool();

        for (int i = 0; i <= 30; i++) {
            executorService.submit(new Process(i));
        }
        executorService.shutdown();

    }
}
 */

    //Question10_11 & 12

 /* public static void main(String[] args) throws InterruptedException {

        Question10_11 synchronizeDemo = new Question10_11();
        // Question12 synchronizeDemo = new Question12();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeDemo.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronizeDemo.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchronizeDemo.count);
    }
} */
    //Question13 & 14

 /*   public static void main(String[] args) {
        Question13_14 demo = new Question13_14();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker1();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker2();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker3();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker4();
            }
        }).start();
    }
} */


    //Question15

  /*  public static void main(String[] args)
            throws InterruptedException {
        Question15 demo = new Question15();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker1();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.worker2();
            }
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }
}
  */

  //Question16

    public static void main(String[] args) throws InterruptedException {
        //Question16 demo = new Question16();
        Question16_ demo = new Question16_();
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            demo.worker1();
        }
    });
    Thread thread2 = new Thread(new Runnable() {
        @Override
        public void run() {
            demo.worker2();
        }
    });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
}

    }