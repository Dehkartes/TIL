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

void an6()
{
	int h;
	int m;

	cin >> h;
	cin >> m;

	if (m - 45 < 0)
	{
		m = 60 + m - 45;
		h--;
	}
	else
	{
		m -= 45;
	}

	if (h < 0)
	{
		h = 23;
	}

	cout << h << " " << m;

	pause();
}

void an7()
{
	int current_hour;
	int current_minutes;
	int take_time;
	int mtoh;
	int left_min;

	cin >> current_hour;
	cin >> current_minutes;
	cin >> take_time;

	current_minutes += take_time;

	mtoh = current_minutes / 60;
	left_min = current_minutes % 60;

	current_hour += mtoh;
	current_hour = current_hour % 24;

	cout << current_hour << " " << left_min;

	pause();
}