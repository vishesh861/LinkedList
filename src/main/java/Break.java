import java.util.ArrayList;

public class Break {

    public void breaak_string(String str) {

        ArrayList<String> list = new ArrayList<>();
        String str1 = "";
        String str2 = "";
        

        for (int i=0; i<str.length(); i++) {

            if (str.charAt(i) == ' ') {
                list.add(str1);
                str1 = "";
            } else if (str.charAt(i) == '\"') {
                str2 += str.charAt(i);
                i++;
                while (str.charAt(i) != '\"') {
                    str2 += str.charAt(i);
                    i++;
                }
                str2 += str.charAt(i);
                list.add(str2);
                i++;
                str2 = "";
            } else {
                str1 += str.charAt(i);
            }

        }
        int n = list.size();
        String[] arr = new String[n];
        int j=0;

        for (String a : list) {
            arr[j] = a;
            j++;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
