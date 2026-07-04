package july;

import java.util.ArrayList;

public class dfs {
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(0);
        graph.get(1).add(3);
        graph.get(2).add(0);
        graph.get(2).add(3);
        graph.get(3).add(1);
        graph.get(3).add(2);
        boolean visited[]=new boolean[n];
        dfs(0,graph,visited,list);System.out.println(list);
    }

    static void dfs(int node,ArrayList<ArrayList<Integer>> graph,boolean[] visited,ArrayList<Integer> list){
        visited[node]=true;
        list.add(node);
        for(int neighbor:graph.get(node)){
            if(!visited[neighbor]){
                dfs(neighbor,graph,visited,list);
            }else{
                System.out.println("Alreay visited"+neighbor);
            }
        }
    }
}
