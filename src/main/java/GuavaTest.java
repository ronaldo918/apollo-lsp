import com.google.common.base.Function;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by liushanping on 15/8/8.
 */
public class GuavaTest {
    public static void main(String[] args) {
        //deleteTheSame();

        List<Student> studentList = Lists.newArrayList();
        System.out.println("studentList size=" + studentList.size());

        studentList.add(new Student(11, "刘汕平", 29, 1));
        studentList.add(new Student(21, "宋雨蒙", 27, 0));
        studentList.add(new Student(11, "宋雨蒙", 27, 0));
        Map studentMap1 = null;
        try {
            ImmutableListMultimap<Integer, Student> digitsByLength= Multimaps.index(studentList, studentIntegerFunction2);
            //digitsByLength.containsKey()
            studentMap1 = Maps.uniqueIndex(studentList, studentIntegerFunction());
            System.out.println("studentMap1 size=" + digitsByLength.size());
        } catch (Exception e) {
            e.printStackTrace();
        }
        Map studentMap2 = Maps.newHashMap();
//        Map studentMap3 = Maps.uniqueIndex(studentList, new Function<Student, Integer>() {
//            @Overrides
//            public Integer apply(Student input) {
//                return input.getNumber();
//            }
//        });
        for (Student student : studentList) {
            studentMap2.put(student.getNumber(), student);
        }

        System.out.println("studentMap1 size=" + studentMap1.size());
        System.out.println("studentMap2 size=" + studentMap2.size());
//        System.out.println("studentMap3 size=" + studentMap3.size());
    }


    public static void deleteTheSame(){
        HashMap<Integer,Student> map = Maps.newHashMap();
        try {
            map.put(1,new Student(11, "刘汕平", 29, 1));
            map.put(12, new Student(11, "刘汕平222", 292, 1));
            map.put(1, new Student(11, "刘汕平222", 292, 1));
            System.out.println("studentMap1 size=" + map.size());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static Function<Student, Integer> studentIntegerFunction() {
        return new Function<Student, Integer>() {
            @Override
            public Integer apply(Student input) {
                return input.getNumber();
            }
        };
    }

    public static Function<Student, Integer> studentIntegerFunction2 = new Function<Student, Integer>() {

        public Integer apply(Student student) {

            return student.getNumber();

        }

    };

}
