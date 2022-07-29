// diziler_3.cpp : Bu dosya 'main' işlevi içeriyor. Program yürütme orada başlayıp biter.
//

#include <iostream>
using namespace std;



int main()
{
	int dizi[2][4];
	
	//satır döngüsü
	for (int i = 0;i < 2;i++)
	{
		//sütun döngüsü
		for (int k = 0;k < 4;k++)
		{
			cout << i + 1 << ". satir " << k + 1 << ". sutun degeri..: ";
			cin >> dizi[i][k];
		}
	}
	//okuduğumuz diziyi yazdıralım

	//satır döngüsü
	for (int i = 0;i < 2;i++)
	{
		//sütun döngüsü
		for (int k = 0;k < 4;k++)
		{
			cout << dizi[i][k] << "\t";
		}
		cout << endl;
	}

	//diziyi döndürme

	int dizi2[4][2];

	for (int i = 0;i < 4;i++)
	{
		//sütun döngüsü
		for (int k = 0;k < 2;k++)
		{
			cout << i + 1 << ". satir " << k + 1 << ". sutun degeri..: ";
			cin >> dizi2[i][k];
		}
	}

	for (int i = 0;i < 4;i++)
		for (int k = 0;k < 2;k++)
			dizi2[i][k] = dizi[k][i];
	
	//yeni diziyi yazdırma
	for (int i = 0;i < 4;i++)
	{
		for (int k = 0;k < 2;k++)
		{
			cout << dizi2[i][k] << "\t";
		}
		cout << endl;
	}

	int dizi3[4][4];



	for (int i = 0;i < 4;i++)
	{
		//sütun döngüsü
		for (int k = 0;k < 4;k++)
		{
			dizi3[i][k] = dizi[0][k] * dizi2[i][0]+ dizi[1][k] * dizi2[i][1];
			
			
		}
	}
	

	
	//okuduğumuz diziyi yazdıralım

	//satır döngüsü
	for (int i = 0;i < 4;i++)
	{
		//sütun döngüsü
		for (int k = 0;k < 4;k++)
		{
			cout << dizi3[i][k] << "\t";
		}
		cout << endl;
	}

	system("pause");
	return 0;
}


