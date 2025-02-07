package DynamicProgramming.MoreDPProblems;

public class Main {

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "a?c*";

        WildcardMatching w = new WildcardMatching();
        System.out.println(w.isMatch(s1, s2));
    }

}
