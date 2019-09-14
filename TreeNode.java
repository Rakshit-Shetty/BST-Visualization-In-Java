public class TreeNode {

    private Person val;
    private TreeNode lKid;
    private TreeNode rKid;

    
    public TreeNode(Person tVal, TreeNode tLkid, TreeNode tRkid) {
        this.val = tVal;
        this.lKid = tLkid;
        this.rKid = tRkid;
    }

    
    public TreeNode getLkid() {
        return lKid;
    }

    
    public void setLkid(TreeNode leftKid) {
        this.lKid = leftKid;
    }

    
    public TreeNode getRkid() {
        return rKid;
    }

   
    public void setRkid(TreeNode rightKid) {
        this.rKid = rightKid;
    }

  
    public Person getVal() {
        return val;
    }

    
    public void setVal(Person value) {
        this.val = value;
    }

}