import java.io.*;


class BST <String>{

    private BinaryTreenode root; 


    public BST() { 
        root = null; 
        } 

    public void insert(Comparable k){
        if (root == null) {
            root = new BinaryTreenode(k, null, null);
        }
        else 
            insert(root, k);
    }


    public void delete(Comparable k) {
        root = delete(root, k);
    }


    public boolean find(Comparable k) {
        return find(root, k);
    }

    public void print() {
        print(root);
    }    




    private boolean find(BinaryTreenode T, Comparable k) {
        if (T == null) 
            return false;
        if (T.getKey().equals(k)) 
            return true;
        if (k.compareTo(T.getKey()) < 0) {
            return find(T.getLeft(), k);
        }
        else {
            return find(T.getRight(), k);
        }
}



    private void insert(BinaryTreenode T, Comparable k){
        if (T.getKey().equals(k)){
            delete(k);
        }

        if (k.compareTo(T.getKey()) < 0) {
            if (T.getLeft() == null) 
                T.setLeft( new BinaryTreenode(k, null, null) );
            else 
                insert(T.getLeft(), k);
        }
        else {

            if (T.getRight() == null) 
                T.setRight( new BinaryTreenode(k, null, null) );
            else 
                insert(T.getRight(), k);
        }
}

    private void print(BinaryTreenode T) {
        if(T!= null){
            print(T.getLeft());
            System.out.println(T.getKey());
            print(T.getRight());
        }
    }


    private BinaryTreenode smallestNode(BinaryTreenode T)
    {
        if (T.getLeft() == null) 
            return T;
        else 
            return smallestNode(T.getLeft());
    }



    private BinaryTreenode delete(BinaryTreenode T, Comparable k) {
        if (T == null) 
            return null;
        if (k.equals(T.getKey())) {

           if (T.getLeft() == null && T.getRight() == null) 
                return null;
           if (T.getLeft() == null) 
                return T.getRight();
           if (T.getRight() == null) 
                return T.getLeft();
           
           BinaryTreenode tmp = smallestNode(T.getRight());
           T.setKey( tmp.getKey() );
           T.setRight( delete(T.getRight(), tmp.getKey()) );
           return T;
           
        }
        else if (k.compareTo(T.getKey()) < 0) {
            T.setLeft( delete(T.getLeft(), k) );
        return T;
        }
        else {
            T.setRight( delete(T.getRight(), k) );
        return T;
        }
    }


}





