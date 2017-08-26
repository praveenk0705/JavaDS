
#include <iostream>
using namespace std;
#include <cstdlib>

class Node
{
	int data;
	Node * next;
public:

	Node( int data)
	{
		this->data = data;
		next = NULL;
	}

	Node * GetNext()
	{
		return next;
	}

	void SetNext( Node * newNode )
	{
		next = newNode;
	}

	int GetData()
	{
		return data;
	}

	void SetData( int data )
	{
		this->data = data;
	}
};


class SLinkedList
{
	Node * head;

public:
	// constructor
	SLinkedList();
	//member functions

	void displayrev( Node * head ) {
	if( head == NULL )
		return;

	displayrev( head->GetNext());
	cout<<head->GetData();
}

	void Insert( int data, int position );
	void Insert( int data );

	void DeleteByPos( int pos );
	void DeleteByVal( int data);

	void Display();
	~SLinkedList();
};

SLinkedList::SLinkedList()
{
	head = NULL;
}

void SLinkedList::Insert( int data )
{
	Node * newNode = new Node( data );

	if( head == NULL )
	{
		head = newNode;
	}
	else
	{
		Node * temp;

		temp = head;

		while( temp->GetNext() )
			temp = temp->GetNext();

		temp->SetNext( newNode );
	}
}

void SLinkedList::Insert( int data, int pos)
{
	Node * newNode = new Node( data );

	if( pos == 1 )
	{
		newNode->SetNext( head );
		head = newNode;
	}
	else
	{
		Node * temp;

		temp = head;

		for( int i = 1; i < pos - 1; i++ )
		{
			temp = temp->GetNext();
		}

		newNode->SetNext( temp->GetNext());
		temp->SetNext( newNode );
	}
}

void SLinkedList::Display()
{
	Node * temp;

	temp = head;

	cout<<"\n";
	while( temp )
	{
		cout<<temp->GetData();
		temp = temp->GetNext();
		if( temp )
			cout<<"->";
	}
}

void SLinkedList::DeleteByPos( int pos )
{
	Node * temp;

	if( pos == 1 )
	{
		temp = head;

		head = head->GetNext();
		delete temp;
	}
	else
	{
		temp = head;

		for( int i = 1; i < pos - 1; i++ )
		{
			temp = temp->GetNext();
		}

		Node * deletable;

		deletable = temp->GetNext();
		temp->SetNext( temp->GetNext()->GetNext() );

		delete deletable;
	}
}

void SLinkedList::DeleteByVal(int data )
{

	Node * temp;

	if( head->GetData() == data )
	{
		temp = head;

		head = head->GetNext();
		delete temp;
	}
	else
	{
		temp = head;

		while( temp->GetNext()->GetData() != data )
		{
			temp = temp->GetNext();
		}

		Node * deletable;

		deletable = temp->GetNext();
		temp->SetNext( temp->GetNext()->GetNext() );

		delete deletable;
	}
}

SLinkedList::~SLinkedList()
{
	Node * temp;
	while( head )
	{
		temp = head;
		head = head->GetNext();
		delete temp;
	}
}


















