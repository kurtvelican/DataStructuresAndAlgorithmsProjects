// veri_yapilari.cpp : Bu dosya 'main' işlevi içeriyor. Program yürütme orada başlayıp biter.
//
using namespace std;
#include <iostream>

int main()
{
	/*int a = 10;
	int* p;
	p = &a;
	cout << a;*/
	int dizi[6] = { 1,2,3,4,5,6 };
	int* p;
	p = dizi;
	for (int i = 0;i < 6;i++)
	{
		cout << *(p+i);
	}
	

	





	system("pause");
	return 0;
}

