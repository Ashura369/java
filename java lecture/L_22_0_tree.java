public class L_22_0_tree {
    private class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    class Tree {
        static int idx = -1;

        Node buildTree(int nodes[]) {
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }

            Node tempNode = new Node(nodes[idx]);
            tempNode.left = buildTree(nodes);           
            tempNode.right = buildTree(nodes);          

            return tempNode;
        }

        /*
        
            buildTree() -> idx=0 -> 1
            ├── Left: buildTree() -> idx=1 -> 2
            │   ├── Left: buildTree() -> idx=2 -> 4
            │   │   ├── Left: buildTree() -> idx=3 -> -1 -> null
            │   │   └── Right: buildTree() -> idx=4 -> -1 -> null
            │   └── Right: buildTree() -> idx=5 -> 5
            │       ├── Left: buildTree() -> idx=6 -> -1 -> null
            │       └── Right: buildTree() -> idx=7 -> -1 -> null
            └── Right: buildTree() -> idx=8 -> 3
                ├── Left: buildTree() -> idx=9 -> -1 -> null
                └── Right: buildTree() -> idx=10 -> 6
                    ├── Left: buildTree() -> idx=11 -> -1 -> null
                    └── Right: buildTree() -> idx=12 -> -1 -> null        
        
        */

        void inOrder(Node root) {
            if (root == null) return;

            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        L_22_0_tree outer = new L_22_0_tree();
        Tree tree = outer.new Tree();

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = tree.buildTree(nodes);

        System.out.println("Inorder Traversal : ");
        tree.inOrder(root);


        /*

        below is the output and its tree

            putPut -- 4 2 5 1 3 6 

                 1
                / \
               2   3
              / \   \
             4   5   6
        */

    }
}
