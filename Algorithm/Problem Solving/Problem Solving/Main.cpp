#include "Header.h"

int main()
{
	string problem_code;

	while (true)
	{
		system("cls");

		cout << "���� �ڵ�: ";
		cin >> problem_code;

		if (problem_code == "lgi1")
			lgi1();
		else if (problem_code == "an1")
		{
			an1();
		}
		else if (problem_code == "an2")
		{
			an2();
		}
		else
		{
			cout << "���� �ڵ带 ã�� �� �����ϴ�\n";
			system("pause");
		}
			
	}
	
}

void pause()
{
	cout << "\n";
	system("pause");
}