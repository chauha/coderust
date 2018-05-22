package com.coderust.tree;

class BSTNode {
    int data;
    int rCount;
    BSTNode left;
    BSTNode right;

    BSTNode(int data) {
        this.data = data;
    }
}


public class FIndNosGreaterInRight {

    public BSTNode formTree(int[] inputArr) {
        BSTNode root = new BSTNode(inputArr[inputArr.length - 1]);
        int [] result = new int [inputArr.length];
        result[inputArr.length-1]=0;
        for (int index = inputArr.length - 2; index >= 0; index--) {
            int res=insertNode(root, inputArr[index]);
            result[index]=res;
        }
        for(int index=0;index<result.length;index++){
            System.out.println(result[index]);
        }
        return root;
    }

    public int insertNode(BSTNode root, int data) {
        BSTNode temp = root;
        int res=0;
        while (temp != null) {
            if (temp.data < data) {
                if (temp.right == null) {
                    temp.right = new BSTNode(data);
                    temp.rCount++;
                    break;
                } else {
                    temp.rCount++;
                    temp = temp.right;
                }
            } else {
                if (temp.left == null) {
                    temp.left = new BSTNode(data);
                    res++;
                    break;
                } else {
                    temp = temp.left;
                    if (temp.right != null){
                        res = res+temp.rCount;
                    }
                    res++;
                }
            }

        }
        return res;
    }



    public static void main(String[] args) {
        int[] input = new int[]{10, 4, 5, 13, 11, 15};
        FIndNosGreaterInRight fIndNosGreaterInRight = new FIndNosGreaterInRight();
        BSTNode root = fIndNosGreaterInRight.formTree(input);

    }


}
