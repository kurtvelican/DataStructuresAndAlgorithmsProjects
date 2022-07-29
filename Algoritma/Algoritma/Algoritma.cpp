// Algoritma.cpp : Bu dosya 'main' işlevi içeriyor. Program yürütme orada başlayıp biter.
//

#include <iostream>
using namespace std;

int bul(int al, int us, int x, int y)
{
	int adet = 0;
	for (int i = al;i <= us;i++)
	{
		if ((i % x == 0) && (i % y == 0))
		{
			adet++;
			cout << i << endl;
		}
	}
	return adet;
}
int main()
{
	int alt = 1, int ust = 100, int a = 3, int b = 5;
	int sonuc = bul(alt, ust, a, b);
	cout << sonuc << endl;

	/*int x = 100;
	int tahmin, adet = 0;
	do
	{
		cout << "bir tahminde bulununuz..: ";
		cin >> tahmin;
		adet++;
		if (tahmin < x)
		{
			cout << "daha buyuk tahminde bulun." << endl;
		}
		else if (tahmin > x)
		{
			cout << "daha kucuk tahminde bulun." << endl;
		}
	} while (tahmin != x);
	cout << "tebrikler." << endl;
	cout << adet << "  . tahminde bildiniz." << endl;*/







	system("pause");
	return 0;
}

