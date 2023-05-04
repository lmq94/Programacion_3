package practico_2;

public class Tree<T> {
    private TreeNode<T> root;

    public Tree() {
        this.root = null;
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    private void add(Comparable<T> c, TreeNode<T> aux) {
        if (c.compareTo(aux.getValue()) > 0) {
            if (aux.getLeft() == null) {
                TreeNode<T> temp = new TreeNode<T>((T) c);
                aux.setLeft(temp);
            } else {
                add(c, aux.getLeft());
            }
        } else
            if (c.compareTo(aux.getValue()) < 0) {
                if (aux.getRight() == null) {
                    TreeNode<T> temp = new TreeNode<T>((T)c);
                    aux.setRight(temp);
                }
                else {
                    add(c, aux.getRight());
                }
            }
    }


    public void add(T value){
        if (this.root == null)
            this.root = new TreeNode(value);
        else
        {
            TreeNode<T> aux = this.root;
            add( (Comparable) value, aux);
        }
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    private void printPreOrder(TreeNode temp){
        if(temp != null){
            System.out.println(temp.getValue());
            printPosOrder(temp.getLeft());
            printPosOrder(temp.getRight());
        }
    }

    private void printPosOrder(TreeNode temp){
        if(temp != null){
            printPosOrder(temp.getLeft());
            printPosOrder(temp.getRight());
            System.out.println(temp.getValue());
        }
    }

    private void printInOrder(TreeNode temp){
        if(temp != null){
            printPosOrder(temp.getLeft());
            System.out.println(temp.getValue());
            printPosOrder(temp.getRight());
        }
    }

    public void printPosOrder(){
        printPosOrder(this.root);
    }

    public void printPreOrder(){
        printPreOrder(this.root);
    }

    public void printInOrder(){
        printInOrder(this.root);
    }




}
