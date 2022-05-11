package ds.trees;

public class SameTree {
    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        TreeNode node11 = new TreeNode(2);
        TreeNode node12 = new TreeNode(3);
        root1.left = node11;
        root1.right = node12;

        TreeNode root2 = new TreeNode(1);
        TreeNode node21 = new TreeNode(2);
        TreeNode node22 = new TreeNode(3);
        root2.left = node21;
        root2.right = node22;

        System.out.println("Is Same Tree: " + isSameTree(root1,root2));
    }

    public static int isSameTree(TreeNode A, TreeNode B) {

        if(A==null && B==null)
            return 1;
        else if(A==null || B==null){
            return 0;
        }else if(A.val==B.val){
            int left = isSameTree(A.left,B.left);
            int right = isSameTree(A.right,B.right);
            if(left==1 && right==1)
                return 1;
            else
                return 0;
        }else
            return 0;
    }
}
