package org.dsa.recursion;

public class DisplayArrayByRecursion {
    public static void main(String[] args) {
        int ar[]={10,20,30,10,40,10,50};
        displayArr(ar,0);
    }
static int index=0;
    private static void displayArr(int[] ar,int index) {
if(index==ar.length){
    return;
}
        System.out.println(ar[index]);

        displayArr(ar,++index);
    }


}
