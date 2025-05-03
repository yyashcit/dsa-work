package org.dsa.scaler.array.twoDArray;

public class SearchKInSortedMatrix {

    public static void main(String[] args) {
SearchKInSortedMatrix obj=new SearchKInSortedMatrix();
int[][] A={{1,3,5,7},{2,4,6,8}};
        System.out.println(obj.solve(A,2));
    }

    public int solve(int[][] A, int B) {
        int rLen=A.length;
        int cLen=A[0].length;
        int i=0, j=cLen-1;
        int min=Integer.MAX_VALUE;
        while(i<rLen&&j>=0){

            if(A[i][j]==B){
                int r= ((i+1) * 1009 + (j+1));

            }
            else if(A[i][j]>B){
                j--;
            }else if(A[i][j]<B){
                i++;
            }
        }
        System.out.println("result "+min);
        return min;
    }

}
