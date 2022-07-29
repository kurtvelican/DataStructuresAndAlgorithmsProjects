// diziler_2.cpp : Bu dosya 'main' işlevi içeriyor. Program yürütme orada başlayıp biter.
//

#include <iostream>
using namespace std;

int main()
{                                                                                                              //     [0]  [1]

	int dizi[4][2] = { {10,35},{45,40},{70,90},{85,10} };   //ilki satır 2.si sütun                            // [0]  10   35
	//dizi[1][0] = 45;                                                                                         // [1]  45   40
																											   // [2]  70   90
/*	float ort[4];																	                           // [3]  85   10

	for (int i = 0;i < 4;i++)           //dizi 4 satırdan oluştuğu için
	{
		ort[i] = (dizi[i][0] + dizi[i][1]) / 2.0;
		cout << ort[i] << endl;
	}

}*/


	float ort[4];
	for (int i = 0;i < 4;i++)
		ort[i] = 0;
	for (int i = 0;i < 4;i++)
	{
		for (int k = 0;k < 2;k++)
		{
			ort[i] += dizi[i][k];
			ort[i] /= 2;
			cout << ort[i] << endl;
		}
	}

	system("pause");
	return 0;
}