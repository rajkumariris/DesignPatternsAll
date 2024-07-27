package Designs.Singleton.SingletonDesign;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {
//        TVset tVset1 = TVset.gettVset();
//        TVset tVset2 = TVset.gettVset();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

         executorService.execute(()->TVset.gettVset());
         executorService.execute(()->TVset.gettVset());


//        System.out.println(tVset1);
//        System.out.println(tVset2);
    }

}
