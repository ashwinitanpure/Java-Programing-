#include<stdio.h>
#include<alloc.h>
typedef struct gll
{
	int tag;
	union gll1
	{
		char name[20];
		struct gll *dlink;
	}gll1;
	struct gll *next;
}node;
node* createnode(int tag);
node* create(node *head, int n);
void display(node *head);

void main()
{
	node *head;
	int ch, ans;
	head=NULL;
	do
	{
		printf("Enter your choice...\n");
		scanf("%d",&ch);
		switch(ch)
		{
			case 1:
					head=create(head);
					break;
			case 2:
					display(head,1);
					break;
			default:
					printf("invalid choice\n");
		}
		printf("enter 1- yes\2-No\n");
		scanf("%d",&ans);
	}while(ans==1);
}
node* createnode(int tag)
{
	node *temp;
	if(tag==0)
	{
		temp=(node*)malloc(sizeof(node));
		temp->tag=tag;
		printf("Enter the topic\n");
		scanf("%s",temp->name);
		temp->next=NULL;
	}
	else
	{
		temp=(node*)malloc(sizeof(node));
		temp->tag=tag;
		temp->gll1.dlink=NULL;
		temp->next=NULL;
	}
	return temp;
}
node* create(node *head)
{
	int n,tag;
	node *p,*temp;
	printf("enter no. of nodes u want...");
	scanf("%d",&n);
	for(int i=0; i<n; i++)
	{
		printf("Enter the tag...");
		scanf("%d",&tag);
		if(tag==0)
		{
			temp=createnode(tag);
		}
		else
		{
			temp=createnode(tag);
			temp->gll1.dlink=create(NULL);
			printf("end with sublink list...");
		}
	}
	if(head==NULL)
	{
		head=temp;
	}
	else
	{
		p=head;
		while(p != NULL)
		{
			p=p->next;
		}
		p->next=temp;
	}
	return head;
}
void display(node *head, int n)
{
	node *p;
	p=head;
	int i;
	while(p != NULL)
	{
		if(p->tag==0)
		{
			for(int i=0; i<n; i++)
			{
				printf("\t");
			}
			printf("-");
			printf("%s",p->gll1.name);
		}
		else
		{
			display(p->gll1.dlink,n+1);
		}
		p=p->next;
	}
}