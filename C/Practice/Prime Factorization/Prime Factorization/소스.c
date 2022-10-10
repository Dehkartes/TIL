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
		printf("\n==========================================================\n���μ����� �� ���� �Է��Ͻʽÿ�\n100,000,001 �̻��� ���� ����ϴµ� �ð��� �ɸ� �� �ֽ��ϴ�\n\n�Է�: ");
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

	for (int i = 2; i <= x; i++)		//�Ҽ����� �Ǻ��� �� i�� ����
	{
		for (int j = 2; j <= i; j++)	//i�� �Ҽ����� �Ǻ���
		{
			if (i % j == 0)				//���� 0�̵Ǵ� ������ ī��Ʈ
			{
				count++;
			}
		}

		if (count == 1)					//ī��Ʈ�� 1�μ�(�Ҽ�)�� ���
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