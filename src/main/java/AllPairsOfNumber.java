public class AllPairsOfNumber {

    public void pairs(int num) {

        Integer a = num;
        String s = a.toString();

        for (int i=0; i<s.length(); i++) {

            for (int j=0; j<s.length(); j++) {

                if (i == j) {
                    continue;
                } else {
                    System.out.print(s.charAt(i) + "" +
                            s.charAt(j) + " ");
                }

            }
        }
    }
}
