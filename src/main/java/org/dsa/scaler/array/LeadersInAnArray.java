package org.dsa.scaler.array;

import java.util.ArrayList;

public class LeadersInAnArray {

    public static void main(String[] args) {
LeadersInAnArray obj=new LeadersInAnArray();
        ArrayList ip=new ArrayList();
        ip.add(16);
        ip.add(17);
        ip.add(4);
        ip.add(3);
        ip.add(5);
        ip.add(2);
        System.out.println(obj.solve(ip));
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> ans=new ArrayList();
        for(int i=0;i<A.size();i++){
            boolean isEligible=true;
            for(int j=i+1;j<A.size();j++){
                if(A.get(i)<A.get(j))
                {
                    isEligible=false;
                    break;
                }
            }

            if(isEligible){
                ans.add(A.get(i));
            }

        }
        return ans;
    }}
