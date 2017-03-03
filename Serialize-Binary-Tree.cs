using System;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public int val;
 *     public TreeNode left;
 *     public TreeNode right;
 *     public TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public string serialize(TreeNode root) {
        //serial sequence is root left right...
        string serial = "";

        //if root is null return empty string
        if (root == null)
            return serial;

        //concatenate root to string
        serial += root.val + "|";

        //recursively concatenate left node and children
        if (root.left != null) {
            serial += serialize(root.left);
        } else {
            serial += "|";
        }

        //recursively concatenate right node and children
        if (root.right != null) {
            serial += serialize(root.right);
        } else {
            serial += "|";
        }
        return serial;
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(string data) {
        //return null if no data
        if (data == "")
            return null;

        //implemented using stack
        Stack<TreeNode> nodes = new Stack<TreeNode>();

        //split data into left root as index 0,
        //  and rest as index 1
        char[] SplittingChar = {'|'};
        string[] Values = data.Split(SplittingChar,2);

        //LeftRight decides child's side
        string LeftRight = "Left";

        //create root for first value
        //node will be working node, root will be returned
        TreeNode root = new TreeNode(Int32.Parse(Values[0]));
        TreeNode node = root;

        //split rest of data
        Values = Values[1].Split(SplittingChar);

        //push root node into stack
        nodes.Push(node);

        foreach (string s in Values) {
            if (s != "") {
                //if s not null then add as left or right child
                //and push onto stack
                if (LeftRight == "Left") {
                    node.left = new TreeNode(Int32.Parse(s));
                    node = node.left;
                } else {
                    node.right = new TreeNode(Int32.Parse(s));
                    node = node.right;
                    LeftRight = "Left";
                }

                nodes.Push(node);
            } else {
                //if s is null then remove one node from stack
                if (nodes.Count() > 0)
                    node = nodes.Pop();
                LeftRight = "Right";
            }
        }

        return root;

    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));
