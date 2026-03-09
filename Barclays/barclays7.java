package Barclays;

import java.util.*;
public class barclays7 {
    static class Pair{
        int first;
        char second;
        Pair(int first,char second){
            this.first=first;
            this.second=second;
        }
    }
    static int[] getNext(String Needle){
        int n=Needle.length();
        int [] next=new int[n];
        for(int i=1,len=0;i<n;){
            if(Needle.charAt(i)==Needle.charAt(len)){
                next[i++]=++len;
            }
            else if(len==0){
                i++;
            }
            else{
                len=next[len-1];
            }
        }
        return next;
    }
    static String dfs(List<List<Pair>> dp,int len,int x){
        if(len==0) return "";
        Pair p=dp.get(len).get(x);
        return dfs(dp,len-1,p.first)+p.second;
    }
    static String solution(String s1,String s2){
        int n=s1.length();
        int m=s2.length();
        int len=n+m-1;
        char [] r=new char[len];
        Arrays.fill(r,'?');
        for(int i=0;i<m;i++){
            if(s2.charAt(i)=='T'){
                for(int j=0;j<n;j++){
                    if(r[i+j]!='?' && r[i+j]!=s1.charAt(j)){
                        return "-1";
                    }
                    r[i+j]=s1.charAt(j);
                }
            }
        }
        int [] next=getNext(s1);
        List<List<Pair>> dp=new ArrayList<>();
        for(int i=0;i<=len;i++){
            List<Pair> row=new ArrayList<>();
            for(int j=0;j<=n;j++){
                row.add(new Pair(-1,'-'));
            }
            dp.add(row);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        for(int i=0;i<len;i++) {
            char from = r[i], to = r[i];
            if (r[i] == '?') {
                from = 'A';
                to = 'B';
            }

            int size = q.size();
            Set<Integer> seen = new HashSet<>();
            for (int j = 0; j < size; j++) {
                int x = q.poll();
                for (char c = from; c <= to;c++){
                    int y=(x==n) ? next[x-1]:x;
                    while(y>0 && c!=s1.charAt(y)){
                        y=next[y-1];
                    }
                    int temp=(c==s1.charAt(y))?(y+1):0;
                    if((i>=n-1 && s2.charAt(i-n+1)=='F' && temp==n) || dp.get(i+1).get(temp).first>=0){
                        continue;
                    }
                    dp.get(i+1).set(temp,new Pair(x,c));
                    if(i+1==len){
                        return dfs(dp,len,temp);
                    }
                    if(!seen.contains(temp)){
                        q.add(temp);
                        seen.add(temp);
                    }
                }
            }
        }
        return "-1";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String pattern=sc.nextLine();
        String constraints=sc.nextLine();
        System.out.println(solution(pattern,constraints));
    }
}
