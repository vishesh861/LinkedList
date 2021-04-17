
//prime numbers till 100

public class Demo2 {

    public void prime() {
        int a = 0;
        String p = "";
        for (int i=1; i<= 100; i++) {

            int count =0;

            for (a = i; a>=1;a--) {
                if (i%a==0) {
                    count = count+1;
                }
            }

            if (count == 2) {
                p = p + i + " ";

            }
        }
        System.out.println(p);
    }


}
