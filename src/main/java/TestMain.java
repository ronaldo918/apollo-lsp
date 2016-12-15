import com.google.common.collect.Maps;
import org.apache.commons.lang3.time.StopWatch;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * Created by liushanping on 15/6/2.
 */
public class TestMain {
    public static void main(String[] args) {
        System.out.println("start!!!");


        doubleTest();

        HashMap<Integer, Long> hm = Maps.newHashMap();
        hm.put(1, 2l);
        StopWatch sw = new StopWatch();
        sw.start();

        int loopTimes = 10000;
        for (int i = 1; i < loopTimes; i++) {

        }
        sw.stop();
        System.out.println("spend time:" + sw.getTime());
    }


    private static void doubleTest() {
        Double d1 = 1.0000002d;
        Double d2 = 0.0000002d;

        System.out.println(d1 - d2);

        BigDecimal b1 = new BigDecimal(d1.toString());
        BigDecimal b2 = new BigDecimal(d2.toString());

        System.out.println(b1.add(b2));

        double d3 = 0.58d;
        int i1 = (int) (d3 * 100);

        System.out.println(d3);

        System.out.println(i1);
    }
}

