package ExtraProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

//
public class LogFilesAsPerDependencies {

    public static Map<String, List<String>> map = new HashMap<>();

    public static List<String> result = new ArrayList<>();
    public static Set<String> visited = new HashSet<>();

    public static void main(String[] args) {

        map.put("A", Arrays.asList("B", "C", "E"));
        map.put("C", Arrays.asList("D"));

        dfs("A");

        System.out.println(result);

    }

    private static void dfs(String a) {
        visited.add(a);

        if (map.containsKey(a)) {
            for (String s : map.get(a)) {
                if (!visited.contains((s))) {
                    dfs(s);
                }
            }
        }

        result.add(a);
    }

}
