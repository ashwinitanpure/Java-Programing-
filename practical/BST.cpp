#include <iostream>

using namespace std;

class BST
{
private:
	struct Node
	{
		int data;
		Node *left;
		Node *right;
	}*root;

public:
	void createTree()
	{
		root = NULL;
	}
	
	void insertRoot(int data)
	{
		Node *temp = new  Node;
		temp->data = data;
		temp->left = NULL;
		temp->right = NULL;
		root = temp;
	}
	
	void insertOp(int data,Node *root)
	{
		if(data < root->data)
		{
			if(root->left == NULL)
			{
				Node *temp = new Node;
				temp->data = data;
				temp->left = temp->right = NULL;
				root->left = temp;
			}
			else
			{
				insertOp(data,root->left);
			}
		}
		else
		{
			if(root->right == NULL)
			{
				Node *temp = new Node;
				temp->data = data;
				temp->left = temp->right = NULL;
				root->right = temp;
			}
			else
			{
				insertOp(data,root->right);
			}
		}
	}
	
	Node* getRoot()
	{
		return root;
	}
	
	void preorder(Node *root)
	{
		cout<<root->data;
		if(root->left != NULL)
		{
			preorder(root->left);
		}
		if(root->right != NULL)
		{
			preorder(root->right);
		}
	}
}

int main()
{
	BST obj;
	obj.createTree();
	obj.insertRoot(7);
	for(int i=6,j=1;i>=1;i--,j++)
	{
		obj.insertOp(i,obj.getRoot());
		obj.insertOp(i+2*j,obj.getRoot());
	}
	obj.preorder();
	return 0;
}