#include <iostream>

using namespace std;

int main()
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

	return 0;
}