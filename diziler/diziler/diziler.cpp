// diziler.cpp : Bu dosya 'main' işlevi içeriyor. Program yürütme orada başlayıp biter.
//

#include <iostream>
using namespace std;

int buyuk_bul(int a[],int N)
{
	int boy = sizeof(a) / sizeof(a[0]);
	int b = a[0];
	for (int i = 0;i < N;i++)
	{
		if (a[i] > b)
			b = a[i];
	}

	return b;
}




int main()
{
	/*int a[10];   //a dizisi  = 10 elemanlı bir dizidir.
	a[0] = 6;    //indis 0'dan başlar.
	a[1] = -7;
	a[9] = 15;   //dizinin 10.cu indisidir.  
	int b[] = { 4,-8,3,1,-12 };

	int d[5];
	//klaveyeden diziyi okuyalım.
	for (int i = 0;i < 5;i++)
	{
		cout << "dizinin " << i+1 << ". elemaninini giriniz." << endl;
		cin >> d[i];
	}
	//diziyi yazdıralım.
	
	for (int i = 0;i < 5;i++)
	{
		cout << d[i] << endl;
	}
	//diziyi sıralayalım.(büyükten küçüğe)

	for (int k = 0;k < 4;k++) {
		for (int i = 0;i < 4;i++)    //döngüyü dizi sayisi -1'e kadar döndürmemiz gereklidir.
		{
			if (d[i] < d[i + 1])
			{
				int gec = d[i];
				d[i] = d[i + 1];
				d[i + 1] = gec;
			}
		}
	}
	//diziyi tekrar yazdıralım.
	cout << "buyukten kucuge dogru siralama ..:" << endl;
	for (int i = 0;i < 5;i++)
	{
		cout << d[i] << endl;*/

	/*char s[7];
	s[0] = 'A';
	s[6] = 'z';
	char isim[] = { 'A' , 'l' , 'i' };
	char soyisim[] = "KORKMAZ";
	for (int i = 0;i < 7;i++)
	{
		cout << soyisim[i] << endl;
	}
	//soyisim küçüklüğüne göre sıralayalım.
	
	for (int k = 0;k < 6;k++)
	{

		for (int i = 0;i < 6;i++)
		{
			if (soyisim[i] > soyisim[i + 1])
			{
				int gec = soyisim[i];
				soyisim[i] = soyisim[i + 1];
				soyisim[i + 1] = gec;
			}
		}
	}
	cout << "tekrar yaz..." << endl;
	for (int i = 0;i < 7;i++)
		cout << soyisim[i] << endl;*/




	//sayıların yerlerini değiştirelim.
	/*int x = 15, y = 35;                                         //ikinci yol.    								
	int b, o; 

	cout << "x = " << x << endl;
	cout << "y = " << y << endl;

	cout << "islem sonrasi = " << endl;
	while (y)
		{
			b = y % 10;
			o = (y - b) / 10;
			cout << "x = " << o << b << endl;break;
		}
	while (x)
	{
		b = x % 10;
		o = (x - b) / 10;
		cout << "y = " << o << b << endl;break;
	}*/
	
	/*int a = 15, b = 35;                                        //birinci yol. burda başka değişken yok.sadece a ve b.
	a = a + b;
	b = a - b;
	a = a - b;
	cout << a << "       " << b << endl;*/


	//klavyeden 10 adet sayı girilecek.sayılar tutulacak.diziyi 2'ye böleceğiz.tek sayılar ve çift sayılar ayrı olacak ve sıralı olacak.

	int a[] = { 6,7,61,44,1,57,30,10,5,8 };
	//tekleri ve ciftleri ayıralım...
	int tek[10];
	int cift[10];
	int t = 0, c = 0;
	for (int i = 0;i < 10;i++)
	{
		if (a[i] % 2 == 0)
		{
			cift[c] = a[i];
			c++;
		}
		else
		{
			tek[t] = a[i];
			t++;
		}
	}
	//tekleri yazdıralım...
	cout << "tek sayilar ..:" << endl;
	for (int i = 0;i < t;i++)
	
		cout << tek[i] << endl;
	
	cout << "cift sayilar ..:" << endl;
	for (int i = 0;i < t;i++)

		cout << cift[i] << endl;
	
	//dizinin eleman sayısını bulmak...
	int boy = sizeof(a) / sizeof(a[0]);
	cout << "eleman sayisi = " << boy << endl;
	//int b1 = sizeof(a[0]);
	//cout << "eleman boyu = " << b1 << endl;   /bir tane elemanının boyu 10 tane olunca 40 oluyor
	

	//en büyük sayıyı bulalım...
	int ebs = buyuk_bul(a,boy);
	cout << "ebs = " << buyuk_bul(a,boy) << endl;






	system("pause");
	return 0;
}


