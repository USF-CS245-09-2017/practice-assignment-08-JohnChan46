class BinaryTreenode {


   private Comparable key;
   private BinaryTreenode left, right;

   public BinaryTreenode(Comparable k, BinaryTreenode l, BinaryTreenode r) {
       key = k;
       left = l;
       right = r;
   }


   public Comparable getKey() {
      return key;
  }
   public BinaryTreenode getLeft() {
      return left;
    }
   public BinaryTreenode getRight() {
      return right;
    }


   public void setKey(Comparable k) {
      key = k;
    }
   public void setLeft(BinaryTreenode l) {
      left = l;
    }
   public void setRight(BinaryTreenode r) {
      right = r;
    }
}