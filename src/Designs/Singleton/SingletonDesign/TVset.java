package Designs.Singleton.SingletonDesign;

public class TVset {
        private static TVset tVset;
    private TVset(){
        System.out.println("TV instance created");
    }

    //synchronized
    public static TVset gettVset(){
        if(tVset ==null){//t3 t4 ... coming checking instance created yes created so return existing instance
            synchronized(TVset.class){//t1, t2 waiting in the queue
                if(tVset==null){// t1 created instance now t2 check instance created or not yes so skip creatng
                    tVset = new TVset();
                }
            }
        }
        return tVset;
    }

}
