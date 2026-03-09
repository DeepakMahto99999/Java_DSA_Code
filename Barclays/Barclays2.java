package Barclays;

import java.util.*;
public class Barclays2 {
    public static List<Integer> computeKMPTable(String pattern){
        int m=pattern.length();
        List<Integer> KMPTable=new ArrayList<>(Collections.nCopies(m,0));
        for(int i=1,j=0;i<m;i++){
            while(j>0 && pattern.charAt(i)!=pattern.charAt(j)){
                j=KMPTable.get(j-1);
            }
            if(pattern.charAt(i)==pattern.charAt(j)){
                j++;
            }
            KMPTable.set(i,j);
        }
        return KMPTable;
    }
    public static String findMatchingString(String pattern,String constraints){
        int n=pattern.length();
        int m=constraints.length();
        StringBuilder result=new StringBuilder();
        for(int i=0;i<(n+m-1);i++) result.append("?");
        for(int i=0;i<m;i++){
            if(constraints.charAt(i)=='T'){
                for(int j=0;j<n;j++){
                    char currentchar=result.charAt(i+j);
                    if(currentchar!='?' && currentchar!=pattern.charAt(j)){
                        return "-1";
                    }
                    result.setCharAt(i+j,pattern.charAt(j));
                }
            }
        }
        List<Integer> kmpTable=computeKMPTable(pattern);
        int state=0;
        for(int i=0;i<result.length();i++){
            char c=result.charAt(i);
            if(c=='?'){
                for(char trychar='A';trychar<='B';trychar++){
                    int newstate=state;
                    while(newstate>0 && trychar!=pattern.charAt(newstate)){
                        newstate=kmpTable.get(newstate-1);
                    }
                    if(trychar==pattern.charAt(newstate)){
                        newstate++;
                    }
                    if(i<n-1 || constraints.charAt(i-n+1)!='F' || newstate!=n){
                        result.setCharAt(i,trychar);
                        state=newstate;
                        break;
                    }
                }
            }else{
                while(state>0 && c!=pattern.charAt(state)){
                    state=kmpTable.get(state-1);
                }
                if(c==pattern.charAt(state)) {
                    state++;
                }
            }
            if(state==n){
                if(i>=n-1 && constraints.charAt(i-n+1)=='F'){
                    return "-1";
                }
                state=kmpTable.get(state-1);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        String t=sc.next();
        System.out.println(findMatchingString(s,t));
    }
}
