package org.dsa.recursion;

public class AllIndicesInArray {
    public static void main(String[] args) {
        int ar[]={10,20,30,10,40,10,50};
       int count[]= countOfIndices(ar,10,0,0);
        for (int elemt:count) System.out.print(elemt+" ");
    }

    private static int[] countOfIndices(int[] ar, int i, int index,int count) {

        if(index==ar.length){
            return new int[0];
        }
        if(ar[index]==i){
            count++;
        }
        countOfIndices(ar,i,++index,count);
        int indx=0;
        System.out.println("print stmt "+i+" "+count);
        int result[]=new int[count];
        result[indx]=index;
        indx++;
        return result;
    }
}
