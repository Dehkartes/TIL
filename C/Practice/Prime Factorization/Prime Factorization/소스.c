#include <stdio.h>
#include <stdlib.h>

void calc(int x);

int main()
{
	int n;

	system("mode con cols=58 lines=6");
	system("title Prime Factorization");
	while (1)
	{
		printf("\n==========================================================\n소인수분해 할 수를 입력하십시오\n100,000,001 이상의 수는 계산하는데 시간이 걸릴 수 있습니다\n\n입력: ");
		scanf_s("%d", &n);
		system("cls");
		printf("%d = ", n);
		calc(n);
	}
}

void calc(int x)
{
	int count = 0, mcount = 0, acount = 0;
	int k = 1, r = 0, t = 0;

	if (x == 1)
	{
		printf("1^1");
		return;
	}

	printf("1^1 X ");

	for (int i = 2; i <= x; i++)		//소수인지 판별할 수 i를 정함
	{
		for (int j = 2; j <= i; j++)	//i가 소수인지 판별함
		{
			if (i % j == 0)				//몫이 0이되는 개수를 카운트
			{
				count++;
			}
		}

		if (count == 1)					//카운트가 1인수(소수)를 기록
		{
			k = i;
		}

		while (1)
		{
			if (x % k == 0)
			{
				x = x / k;
				mcount++;
			}
			else
			{
				if (acount != 0)
				{
					printf(" X ");
				}
				else
				{
					acount = 1;
				}

				if (mcount != 0)
				{
					printf("%d^%d", i, mcount);
				}
				else
				{
					acount = 0;
				}
				break;
			}
		}

		mcount = 0;
		count = 0;
	}
}