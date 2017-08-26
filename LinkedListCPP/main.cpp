#include "header.h"

int main()
{
	SLinkedList sll;

	int choice, data, pos;
	while( 1 )
	{
		system("cls");
		sll.Display();

		cout<<"\n#### MENU ####"<<endl;
		cout<<"\t1. Insert at End"<<endl;
		cout<<"\t2. Insert By Pos"<<endl;
		cout<<"\t3. Del by Val"<<endl;
		cout<<"\t4. Del by Pos"<<endl;
		cout<<"\t5. Exit"<<endl;
		cout<<"\t\tChoice: ";
		cin>>choice;

		switch( choice )
		{
		case 1:
			cout<<"Enter the data: ";
			cin>>data;
			sll.Insert( data );
			break;
		case 2:
			cout<<"Enter the data: ";
			cin>>data;
			cout<<"Enter Positon";
			cin>>pos;
			sll.Insert( data, pos );
			break;
		case 3:
			cout<<"Enter the data to be deleted: ";
			cin>>data;
			sll.DeleteByVal( data );
			break;
		case 4:
			cout<<"Enter the positon of the Data to be deleted: ";
			cin>>pos;
			sll.DeleteByPos( pos );
			break;
		case 5:
			exit( 0 );

		}
	}

	return 0;
}
