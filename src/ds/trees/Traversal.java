package ds.trees;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.Stack;

public class Traversal {
    public static void main(String[] args) {
        ArrayList res;

        TreeNode root = new TreeNode(1);
        TreeNode node1 = new TreeNode(6);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        root.left = node1;
        root.right = node2;
        node2.left = node3;

        System.out.print("PreOrder:");
        printPreOrder(root);
        System.out.println();
        System.out.print("InOrder:");
        printInOrder(root);
        System.out.println();
        System.out.print("PostOrder:");
        printPostOrder(root);
        System.out.println();

        //res = inorderTraversal(root);
        //System.out.println("Inorder W/o Recursion:" + res);

        res = inorderTraversalStack(root);
        System.out.println("Inorder With stack:" + res);

        res = preorderTraversalStack(root);
        System.out.println("Pre With stack:" + res);

        res = postorderTraversalStack(root);
        System.out.println("Post With stack:" + res);
        res = postorderTraversalSingleStack(root);
        System.out.println("Post With Single stack:" + res);
    }

    private static void printPreOrder(TreeNode root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }

    private static void printInOrder(TreeNode root) {
        if (root == null)
            return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    private static void printPostOrder(TreeNode root) {
        if (root == null)
            return;
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.val + " ");
    }

    public static ArrayList<Integer> inorderTraversalStack(TreeNode A) {
        TreeNode current, node;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        current = A;

        while (current!=null || !stack.isEmpty()) {
            if(current!=null){
                stack.push(current);
                current = current.left;
            }else{
                current = stack.pop();
                res.add(current.val);
                current = current.right;
            }
        }

        return res;
    }

    public static ArrayList<Integer> preorderTraversalStack(TreeNode A) {
        TreeNode current;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        current = A;
        stack.push(A);

        while (!stack.isEmpty()) {
            current = stack.pop();
            res.add(current.val);

            if(current.right!=null)
                stack.push(current.right);
            if(current.left!=null)
                stack.push(current.left);
        }

        return res;
    }

    public static ArrayList<Integer> postorderTraversalSingleStack(TreeNode A) {
        TreeNode current;
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        current = A;
        stack.push(A);

        while (!stack.isEmpty()) {
            current = stack.pop();
            res.add(current.val);

            if(current.left!=null)
                stack.push(current.left);
            if(current.right!=null)
                stack.push(current.right);
        }

        for(int i=res.size()-1; i>=0; i--){
            result.add(res.get(i));
        }

        return result;
    }

    public static ArrayList<Integer> postorderTraversalStack(TreeNode A) {
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> result = new Stack<>();
        stack.push(A);

        while (!stack.isEmpty()) {
            TreeNode elem = stack.pop();
            result.push(elem);
            if (elem.left != null)
                stack.push(elem.left);
            if (elem.right!=null)
                stack.push(elem.right);
        }

        while(!result.isEmpty()){
            res.add(result.pop().val);
        }

        return res;
    }

    public static ArrayList<Integer> inorderTraversal(TreeNode A) {
        TreeNode current, node;
        ArrayList<Integer> res = new ArrayList<>();
        current = A;
        while (current != null) {
            if (current.left == null) {
                res.add(current.val);
                current = current.right;
            } else {
                node = current.left;
                while (node.right != null && !current.equals(node.right))
                    node = node.right;

                if (node.right == null) {
                    node.right = current;
                    current = current.left;
                } else {
                    current = node.right;
                    node.right = null;
                    res.add(current.val);
                    current = current.right;
                }
            }
        }
        return res;
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }
}
