package com.coderust.tree;

import java.util.ArrayList;

public class RootToLeafPathsWithSum {

    private static ArrayList<ArrayList<Integer>> results = new ArrayList<ArrayList<Integer>>();
    private static ArrayList<Integer>paths = new ArrayList<>();

    public static void findPathstoLeafWithSum(Node root, int sum, int desiredSum, int level){
        if (root == null){
            return;
        }
        sum += root.data;
        if (root.left == null && root.right == null ){

            if (sum == desiredSum){
                paths.add(level,root.data);
                ArrayList<Integer> extra = new ArrayList<>();
                for (int i =0 ;i <=level; i++){
                    extra.add(i,paths.get(i));
                }
                results.add(extra);
            }
            return ;
        }

        paths.add(level,root.data);
        findPathstoLeafWithSum(root.left,sum,desiredSum,level+1);
        findPathstoLeafWithSum(root.right,sum,desiredSum,level+1);

    }



    public static void main (String [] args ){


        Node root = new Node(15);
        root.left = new Node(12);
        root.right = new Node(20);
        root.left.right = new Node(14);
        root.left.left = new Node(11);
        root.right.left = new Node(16);
        root.right.right = new Node(24);
        root.right.right.left = new Node(17);
        findPathstoLeafWithSum(root,0,38,0);
        System.out.println(results);

    }



}
