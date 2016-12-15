/**
 * Created by liushanping on 15/9/14.
 */
public class ThreadTest {

    private int j = 0;

    public static void main(String[] args) {
        try {
            Thread thread = new Thread(new Runnable() {
                public void run() {

                }
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }



}



