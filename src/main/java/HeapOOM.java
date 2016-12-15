import java.util.ArrayList;
import java.util.List;

/**
 * Created by liushanping on 15/9/14.
 */
public class HeapOOM {
    static class OOMObject{}

    public static void main(String[] args) {
        try {
            List<OOMObject> list = new ArrayList<OOMObject>();
            while (true){
                list.add(new OOMObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
