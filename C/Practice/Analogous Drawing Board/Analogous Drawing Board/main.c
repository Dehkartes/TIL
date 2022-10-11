#include "std.h"

#define row 25
#define column 50
char curser = '@';

char gnd[row][column];

int x = 1, y = 1;
int mod = 0;
int exitmod = 0;

int main()
{
	system("title Analogous Drawing Board");
	system("mode con cols=53 lines=27");

	int n;

	gndraw();

	while (1)
	{
		exitmod = 0;

		system("cls");

		printf("�޴��� �Է��Ͻʽÿ�\n");
		printf("1.�׸��׸��� 2.����\n");
		printf("�޴�: "); scanf_s("%d", &n);
		char dummy = getchar();

		switch (n)
		{
		case(1):
			movement();
			break;

		case(2):
			printf("���ϴ� Ŀ���� �Է��Ͽ� �ֽʽÿ�: "); scanf_s("%c", &curser, (unsigned int)sizeof(curser));
			break;

		default:
			break;
		}
	}

	return 0;
}

void gndraw()
{
	for (int i = 0; i < row; i++)
	{
		for (int j = 0; j < column; j++)
		{
			if (i == 0 || i == row - 1)
			{
				gnd[i][j] = 'x';
			}
			else if (j == 0 || j == column - 1)
			{
				gnd[i][j] = 'x';
			}
			else
			{
				gnd[i][j] = ' ';
			}
		}
	}
}

void movement()
{
	while (1)
	{
		gnd[x][y] = curser;
		system("cls");
		printf("wasd: Ŀ���̵� | q: ��/���찳 ���� p:����ȭ��\n");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				printf("%c", gnd[i][j]);
			}
			printf("\n");
		}
		printf("row: %d | column: %d | ���찳", x, y);
		gnd[x][y] = ' ';
		if (x < 1 || row - 2 < x || y < 1 || column - 2 < y)
		{
			gnd[x][y] = 'x';
			x = 1, y = 1;
		}
		if (mod == 1)
		{
			draw();
		}
		if (exitmod == 1)
		{
			return;
		}
		else
		{
			control();
		}
	}
}

void draw()
{
	while (1)
	{
		gnd[x][y] = curser;
		system("cls");
		printf("wasd: Ŀ���̵� | q: ��/���찳 ���� p:����ȭ��\n");
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < column; j++)
			{
				printf("%c", gnd[i][j]);
			}
			printf("\n");
		}
		printf("row: %d | column: %d | ��", x, y);
		if (x < 1 || row - 2 < x || y < 1 || column - 2 < y)
		{
			gnd[x][y] = 'x';
			x = 1, y = 1;
		}
		if (mod == 0)
		{
			movement();
		}
		if (exitmod == 1)
		{
			return;
		}
		else
		{
			control();
		}
	}
}

void control()
{
	char key;

	key = _getch();

	if (key == 'w')
	{
		x--;
	}
	else if (key == 's')
	{
		x++;
	}
	else if (key == 'a')
	{
		y--;
	}
	else if (key == 'd')
	{
		y++;
	}
	else if (key == 'q')
	{
		mod = mod == 0 ? 1 : 0;
	}
	else if (key == 'p')
	{
		exitmod = 1;
	}
	else
	{
		control();
	}
}