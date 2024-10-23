package org.dsa.recursion;

public class AllIndicesInArray {
    public static void main(String[] args) {
        int ar[]={10,20,30,10,40,10,50};
       int count= countOfIndices(ar,10,0,0);
        System.out.println(count);

    }

    private static int countOfIndices(int[] ar, int i, int index,int count) {

        if(index==ar.length){
            return count;
        }
        if(ar[index]==i){
            count++;
        }
        return countOfIndices(ar,i,++index,count);
    }
}
