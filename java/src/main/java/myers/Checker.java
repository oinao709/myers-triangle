package myers;

import java.util.List;

public class Checker {
    // 引数と戻り値は変更してはいけない
    public static String apply(List<String> ss) {
        int max = 0;
        int min = 0;
        if (ss.size() != 3) {
            return "入力が不正です";
        }

        int[] ints = ss.stream().mapToInt(Integer::parseInt).sorted().toArray();

//        // debug
//        System.out.println(ints[0]);
//        System.out.println(ints[1]);
//        System.out.println(ints[2]);
//
        if (ints[0] == 0) {
            return "入力が不正です";
        }

        if (ints[2] >= ints[0] + ints[1]) {
            return "不成立";
        }

        if (ints[0] == ints[2]) {
            return "正三角形";
        } else {
            if (ints[1] == ints[0] || ints[2] == ints[1]) {
                return "二等辺三角形";
            } else {
                return "不等辺三角形";
            }
        }
    }
}
