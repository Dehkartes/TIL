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