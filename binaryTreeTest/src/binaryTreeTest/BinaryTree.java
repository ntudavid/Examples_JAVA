package binaryTreeTest;

public class BinaryTree{
	TreeNode root;
	
	public BinaryTree(){
		this.root = null;
	}
	
	public BinaryTree(double data){
		this.root = new TreeNode(data);
	}

	public void insertNode(double data){
		if(this.root == null){
			this.root = new TreeNode(data);
		}
		else{
			TreeNode currentNode = this.root;
			while(true){
				if(data>currentNode.value){
					if(currentNode.Rchild != null){
						currentNode = currentNode.Rchild;
					}
					else{
						TreeNode newNode = new TreeNode(data);
						currentNode.Rchild = newNode;
						break;
					}
				}
				else if(data<currentNode.value){
					if(currentNode.Lchild != null){
						currentNode = currentNode.Lchild;
					}
					else{
						TreeNode newNode = new TreeNode(data);
						currentNode.Lchild = newNode;
						break;
					}
				}
				else{ // the data has already existed in the tree
					break;
				}
			}
		}
	}// insertNode()
		
	public void deleteNode(double data){
		TreeNode currentNode = this.root;
		TreeNode parentNode = this.root;
		int direction = 0; // 0: no move, 1: Rchild, -1: Lchild
		while(currentNode != null){
			if(data == currentNode.value){
				break;
			}
			else if(data > currentNode.value){
				parentNode = currentNode;
				currentNode = currentNode.Rchild;
				direction = 1;
			}
			else{ //if(data < currentNode.value)
				parentNode = currentNode;
				currentNode = currentNode.Lchild;
				direction = -1;
			}
		}

		// find the node and remove procedure
		if(currentNode != null){
			// check currentNode.Rchild and currentNode.Lchild
			if(currentNode.Rchild == null && currentNode.Lchild == null){
				if (direction==1){
					parentNode.Rchild = null;
				}
				else if(direction==-1){
					parentNode.Lchild = null;
				}
				else{ // direction == 0, parentNode == this.root
					this.root = null;
				}
			}
			else if(currentNode.Rchild == null){
				if(direction==1){
					parentNode.Rchild = currentNode.Lchild;
				}
				else if(direction==-1){
					parentNode.Lchild = currentNode.Lchild;
				}
				else{
					this.root = currentNode.Lchild;
				}
			}
			else if(currentNode.Lchild == null){
				if(direction==1){
					parentNode.Rchild = currentNode.Rchild;
				}
				else if(direction==-1){
					parentNode.Lchild = currentNode.Rchild;
				}
				else{
					this.root = currentNode.Rchild;
				}
			}
			else{ // currentNode.Rchild != null && currentNode.Lchild != null
				//find the next bigger node (R->L->L->....)
				TreeNode cNode = currentNode.Rchild;
				TreeNode pNode = currentNode.Rchild;
				while(cNode.Lchild!=null){
					pNode = cNode;
					cNode = cNode.Lchild;
				}
				//
				if(pNode == cNode){
					cNode.Lchild = currentNode.Lchild;
					cNode.Rchild = null;
				}
				else{
					pNode.Lchild = cNode.Rchild;
					cNode.Lchild = currentNode.Lchild;
					cNode.Rchild = currentNode.Rchild;
				}
			
				// cNode is used to replace currentNode
				//System.out.println(cNode.Lchild.value);
				//System.out.println(cNode.Rchild.value);
				//System.out.println(cNode.value); 
				if(direction==1){
					parentNode.Rchild = cNode;
				}
				else if(direction==-1){
					parentNode.Lchild = cNode;
				}
				else{
					this.root = cNode;
				}
			}
			// free the node 
			currentNode = null;
		}
		else{ // node can not find  
			System.out.println("The node does NOT exist in the tree !");
		}
	}// deleteNode() 
	
	public void inOrder(TreeNode tn){
		if(tn!=null){
			inOrder(tn.Lchild);
			System.out.print(tn.value + " ");
			inOrder(tn.Rchild);
		}
	}
}
