public class Spiral_print {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3, 4, 5},
                     {6, 7, 8, 9, 10},
                     {11,12, 13, 14, 15},
                     {16, 17, 18, 19, 20}};
        int N = A.length;    //rows//
//        int M = A[0].length; //cols//
        int i = 0;
        int j = 0;
        while (N >1){

            //        to print 1st row//
            for (int k = 1; k <=N; k++) {
                System.out.println(A[i][j]);
                j+=1;
            }
//            System.out.println();
            //        to print last col  //
            for (int k = 1; k <N; k++) {
                System.out.println(A[i][j]);
                i+=1;
            }
//            System.out.println();
            //        to print last row//
            for (int k = 0; k<N; k++) {
                System.out.println(A[i][j]);
                j--;
            }
//            System.out.println();
            //        to print 1st col//
            for (int k = 1; k <N; k++) {
                System.out.println(A[i][j]);
                i-=1;
            }
//            System.out.println();
            i=i+1;
            j=j+1;
            N-=2;
        }
        if (N==1){
            System.out.println(A[i][j]);
        }
    }
}