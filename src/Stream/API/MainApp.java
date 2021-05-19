package Stream.API;

public class MainApp {
    public static void main(String[] args) {
//        Runnable obj = new Runnable() {
//            @Override
//            public void run() {
//
//            }
//        };
//        // public class MainApp$1 implements Runnable {
//        //      @Override
//        //      public void run() {
//        //
//        //      }
//        //   };
//        //Runnable obj = new MainApp$1();
//        System.out.println(obj.getClass().getName());
    Runnable r1 = () -> {
        System.out.println(1);
    };
        Runnable r2 = () -> {
            System.out.println(2);
        };

        new Thread(r1);
        new Thread(r2);

//    new Thread(
//        () -> {
//
//        }
//    ).start();




    }
}
