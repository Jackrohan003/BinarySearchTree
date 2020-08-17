//https://practice.geeksforgeeks.org/problems/count-bst-nodes-that-lie-in-a-given-range/
public static int getCountOfNode(Node r,int l, int h)
{
    if(r==null)
        return 0;
        
    if(r.data>=l && r.data<=h )
        return 1+ getCountOfNode(r.left,l,h)+getCountOfNode(r.right,l,h);
    else if(r.data<l)
        return getCountOfNode(r.right,l,h);
    else
        return getCountOfNode(r.left,l,h);
    
}
