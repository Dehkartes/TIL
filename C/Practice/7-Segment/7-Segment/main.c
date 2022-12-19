#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <conio.h>

void segdefault(char(*arr)[3]);
void seg0(char(*arr)[3]);
void seg1(char(*arr)[3]);
void seg2(char(*arr)[3]);
void seg3(char(*arr)[3]);
void seg4(char(*arr)[3]);
void seg5(char(*arr)[3]);
void seg6(char(*arr)[3]);
void seg7(char(*arr)[3]);
void seg8(char(*arr)[3]);
void seg9(char(*arr)[3]);

int main()
{
	char ary[5][3];
	int n;
	segdefault(ary);

	system("title 7-Segment");
	system("mode con cols=15 lines=6");

	for (int i = 0; i < 5; i++)
	{
		for (int j = 0; j < 3; j++)
		{
			printf("%c", ary[i][j]);
		}
		printf("\n");
	}

	while (1)
	{
		n = _getch() - '0';

		switch (n)
		{
		case 0:
			seg0(ary);
			break;
		case 1:
			seg1(ary);
			break;
		case 2:
			seg2(ary);
			break;
		case 3:
			seg3(ary);
			break;
		case 4:
			seg4(ary);
			break;
		case 5:
			seg5(ary);
			break;
		case 6:
			seg6(ary);
			break;
		case 7:
			seg7(ary);
			break;
		case 8:
			seg8(ary);
			break;
		case 9:
			seg9(ary);
			break;
		default:
			segdefault(ary);
			break;
		}

		system("cls");
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 3; j++)
			{
				printf("%c", ary[i][j]);
			}
			printf("\n");
		}

	}


	return 0;
}

void segdefault(char(*arr)[3])
{
	char iarr[5][3] = {
		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '},
		{' ', ' ', ' '}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg0(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', '#', '#'},
		{'#', ' ', '#'},
		{'#', ' ', '#'},
		{'#', ' ', '#'},
		{'#', '#', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg1(char(*arr)[3])
{
	char iarr[5][3] = {
		{' ', ' ', '#'},
		{' ', ' ', '#'},
		{' ', ' ', '#'},
		{' ', ' ', '#'},
		{' ', ' ', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg2(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', '#', '#'},
		{' ', ' ', '#'},
		{'#', '#', '#'},
		{'#', ' ', ' '},
		{'#', '#', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg3(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', '#', '#'},
		{' ', ' ', '#'},
		{'#', '#', '#'},
		{' ', ' ', '#'},
		{'#', '#', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg4(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', ' ', '#'},
		{'#', ' ', '#'},
		{'#', '#', '#'},
		{' ', ' ', '#'},
		{' ', ' ', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg5(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', '#', '#'},
		{'#', ' ', ' '},
		{'#', '#', '#'},
		{' ', ' ', '#'},
		{'#', '#', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg6(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', '#', '#'},
		{'#', ' ', ' '},
		{'#', '#', '#'},
		{'#', ' ', '#'},
		{'#', '#', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg7(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', '#', '#'},
		{'#', ' ', '#'},
		{'#', ' ', '#'},
		{' ', ' ', '#'},
		{' ', ' ', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg8(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', '#', '#'},
		{'#', ' ', '#'},
		{'#', '#', '#'},
		{'#', ' ', '#'},
		{'#', '#', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}

void seg9(char(*arr)[3])
{
	char iarr[5][3] = {
		{'#', '#', '#'},
		{'#', ' ', '#'},
		{'#', '#', '#'},
		{' ', ' ', '#'},
		{'#', '#', '#'}
	};

	memcpy_s(arr, sizeof(iarr), iarr, sizeof(iarr));
}