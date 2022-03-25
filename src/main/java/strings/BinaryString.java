package strings;

public class BinaryString {

    public int binarySubstring(int a, String str)
    {
        int res = 0;

        int count = -1;

        for(int i= 0; i<a; i++){

            if(str.charAt(i)=='1'){
                count++;
                res+=count;
            }
        }

        return res;
    }
}
