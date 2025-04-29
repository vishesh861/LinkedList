package matrix;

public class RotateImage {

    public void rotate(int[][] mat) {
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<j){
                    int temp=mat[i][j];
                    mat[i][j]=mat[j][i];
                    mat[j][i]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=n/2;j--){
                int temp=mat[i][j];
                mat[i][j]=mat[i][n-j-1];
                mat[i][n-j-1]=temp;
            }
        }
    }

}
