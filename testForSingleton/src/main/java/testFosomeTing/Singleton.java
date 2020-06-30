package testFosomeTing;

public class Singleton {
    /**
     * 懒汉式变种，属于懒汉式中最好的写法，保证了：延迟加载和线程安全
     */
    private static Singleton instance=null;

    private Singleton() {};

    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}
