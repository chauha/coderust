package com.coderust.tree;

import java.util.ArrayList;
import java.util.HashMap;

public class LevelOrderTraversal {
    static HashMap<Integer, ArrayList<Integer>> levels = new HashMap<>();
    static int max_height = 0;
    static HashMap<Integer, Integer> max_breadth = new HashMap<>();
    static int minLevel=Integer.MAX_VALUE;
    static int maxLevel=Integer.MIN_VALUE;

    public void levelTraverse(Node root, int level) {
        if (root == null) {
            return;
        }
        ArrayList<Integer> temp = levels.get(level);
        if (temp == null) {
            temp = new ArrayList<Integer>();
        }
        temp.add(root.data);
        levels.put(level, temp);
        levelTraverse(root.left, level + 1);
        levelTraverse(root.right, level + 1);
    }

    public static void printLevels() {
        for (Integer level : levels.keySet()) {
            System.out.print("Level-" + level);
            System.out.println();
            for (Integer num : levels.get(level)) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static int find_Height(Node root, int level) {
        if (root == null) {
            return 0;
        }
        if (max_height < level) {
            max_height = level;
        }
        if (max_breadth.get(level) == null) {
            max_breadth.put(level, 1);
        } else {
            max_breadth.put(level, max_breadth.get(level) + 1);
        }
        find_Height(root.left, level + 1);
        find_Height(root.right, level + 1);
        return max_height;
    }

    static void is_perfectly_balanced(Node root, int level){
        if (root == null){
            return ;
        }
        if (root.left == null && root.right == null){
            if ( level < minLevel){
                minLevel=level;
            }
            else if  (level > maxLevel){
                maxLevel=level;
            }
         }

         is_perfectly_balanced(root.left,level+1);
        is_perfectly_balanced(root.right,level+1);


    }


    static boolean isBalanced(Node root){
        is_perfectly_balanced(root,0);
        return ( (maxLevel - minLevel) <= 1 ) ;
    }

    static int find_Max_Width(Node root) {
        find_Height(root, 0);
        int width = 0;
        for (Integer i : max_breadth.keySet()) {
            if (max_breadth.get(i) > width) {
                width = max_breadth.get(i);
            }
        }
        return width;
    }


    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(12);
        root.right = new Node(20);
        root.left.right = new Node(14);
        root.left.right.left = new Node(1);
//        root.left.left = new Node(11);
//        root.right.left = new Node(16);
//        root.right.right = new Node(24);
//        root.right.right.left = new Node(15);
        LevelOrderTraversal lvlTraverse = new LevelOrderTraversal();
        lvlTraverse.levelTraverse(root, 0);
        //   printLevels();
        //  System.out.println(find_Height(root, 0));
       // System.out.println(find_Max_Width(root));
        System.out.println(isBalanced(root));
    }


}
