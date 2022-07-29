// pointer.cpp : Bu dosya 'main' işlevi içeriyor. Program yürütme orada başlayıp biter.
//

#include <iostream>
#include <ctime>
using namespace std;

void degerile(int sayi)
{
	sayi = 61;
	cout << "deger fonksiyondaki deger = " << sayi << endl;
}

void referansile(int *sayi)
{
	*sayi = 61;
	cout << "referans fonksiyondaki deger = " << *sayi << endl;

}

int main()
{
	/*int elemansayisi = 0;
	int* eleman;

	cout << "eleman sayisi: ";
	cin >> elemansayisi;
	eleman = (int*)malloc(elemansayisi * sizeof(int));

	for (int i = 0; i < elemansayisi; i++)
	{
		cout << i + 1 << ". eleman: ";
		cin >> *(eleman + i);
	}
	for (int i = 0; i < elemansayisi; i++)
	{
		cout << eleman[i] << endl;
	}
	free(eleman);*/


	/*int sayi = 1461;
	degerile(sayi);



	cout << "fonksiyon sonrasi degeri = " << sayi << endl;
	cout << endl;
	referansile(&sayi);
	cout << "fonksiyon sonrasi degeri = " << sayi << endl;


	/*cout << "sayinin bellek adresi = " << &sayi << endl;  //referanslama 
	cout << endl;

	int *ptr;
	ptr = &sayi;
	cout << "pointerin gosterdigi adres = " << ptr << endl;
	cout << "pointerin gosterdigi adresin icerigi = " << *ptr << endl;   //dereferanslama
	*/
	char karakter = 'Y';
	char *ch = &karakter;

	for (int i = 0;i <= 10;i++)
	{
		cout << *(ch + i) << endl;
	}

	/*int a[5];
	int *ptr_a;
	ptr_a = a;     //& kullanmaya gerek yok çünkü dizinin ilk elemanının adresini atıyor.    // ==> ptr_a = &a[0];

	for (int i = 0;i < 5;i++)
	{
		cout << "dizinin " << i+1 << ". elemani ..:";
		cin >> *(ptr_a + i); // cin >> *ptr_a;
		                     // ptr_a++; 
	}


	for (int i = 0;i < 5;i++)
	{
		cout << a[i] << endl;
	}*/


	system("pause");
	return 0;
}


