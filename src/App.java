public class App {

    public static void main(String[] args) {
        checkInt(15);
    }

    private static void checkInt(int num) {
        if(num > 10){
            throw new MyExp("Число больше 10");
        }

    }


}
