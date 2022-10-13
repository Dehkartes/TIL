/*
* 입력: 달팽이의 크기(n*n)
* 출력: 달팽이
*/

#include <iostream>
using namespace std;

int main()
{
	string arr[99][99];
	int n, k;
	int r = 0, c = 0;
	int cr = 0, cc = -1;
	cin >> n;


	int i;

	for (i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			arr[i][j] = "  ";
		}
	}

	for (i = 0; i < n; i++)
	{
		cc++;
		arr[cr][cc] = "# ";
	}
	k = 1;
	while (true)
	{
		for (i = 0; i < n - k; i++)
		{
			cr++;
			arr[cr][cc] = "# ";
		}
		for (i = 0; i < n - k; i++)
		{
			cc--;
			arr[cr][cc] = "# ";
		}
		if (n - k <= 3)
			break;
		k += 2;

		for (i = 0; i < n - k; i++)
		{
			cr--;
			arr[cr][cc] = "# ";
		}

		for (i = 0; i < n - k; i++)
		{
			cc++;
			arr[cr][cc] = "# ";
		}
		if (n - k <= 3)
			break;
		k += 2;

	}

	for (i = 0; i < n; i++)
	{
		for (int j = 0; j < n; j++)
		{
			cout << arr[i][j];

		}
		cout << endl;
	}
}