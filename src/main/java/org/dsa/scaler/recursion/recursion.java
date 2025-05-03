package org.dsa.scaler.recursion;

class PrintNumber {


    public static void main(String[] args) {
        PrintNumber p=new PrintNumber();
        p.solve(9);
    }
    public void solve(int A) {
boolean flag=true;

        if(A==0){
            return;
        }
        solve(A-1);
        System.out.print(A+" ");
       if(A==9){
            System.out.println();
            //System.out.println("lie");
        }

    }
}
