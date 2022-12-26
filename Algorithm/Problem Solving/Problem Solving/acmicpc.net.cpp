#include "Header.h"

void an1()
{
	vector<string> v;
	vector<string>::iterator ite;

	v.push_back("joonas");
	v.push_back("baekjon");

	string input;
	cin >> input;

	for (ite = v.begin(); ite != v.end(); ite++)
	{
		if (input == *ite)
		{
			cout << input + "??!";
		}
	}
	
	pause();
}

void an2()
{
	int value;

	cin >> value;
	value -= 543;
	cout << value;

	pause();
}

void an3()
{
	int king;
	int queen;
	int ruke;
	int vishop;
	int knight;
	int pone;

	cin >> king;
	cin >> queen;
	cin >> ruke;
	cin >> vishop;
	cin >> knight;
	cin >> pone;

	king = 1 - king;
	queen = 1 - queen;
	ruke = 2 - ruke;
	vishop = 2 - vishop;
	knight = 2 - knight;
	pone = 8 - pone;

	printf("%d %d %d %d %d %d", king, queen, ruke, vishop, knight, pone);

	pause();
}

void an4()
{
	cout << "         ,r'\"7\nr`-_   ,'  ,/\n \\. \". L_r'\n   `~\\/\n      |\n      |";

	pause();
}

void an5()
{
	int x;
	int y;

	cin >> x;
	cin >> y;

	if (0 < x && 0 < y)
	{
		cout << 1;
	}
	else if (x < 0 && 0 < y)
	{
		cout << 2;
	}
	else if (x < 0 && 0 > y)
	{
		cout << 3;
	}
	else if (x > 0 && 0 > y)
	{
		cout << 4;
	}

	pause();
}