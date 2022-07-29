// random.cpp : Bu dosya 'main' işlevi içeriyor. Program yürütme orada başlayıp biter.
//

#include <iostream>
#include <ctime>
using namespace std;

int main()
{


	
	int alt_s = 1;
	int ust_s = 49;
	int adet[6];
	
	
	
	srand(time(0));
	for (int i = 0;i < 6;i++)
	{
		int sayi = alt_s + rand() % ((ust_s - alt_s) + 1);    
		adet[i] = sayi;
		cout << adet[i] << endl;
	}

	for (int i = 0;i < 6;i++)
	{
		for (int k = 0;k < 6;k++)
		{
			

		}
		

	}









	system("pause");
	return 0;
}

