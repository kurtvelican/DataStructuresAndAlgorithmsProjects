// dosyalama_sorusu.cpp : Bu dosya 'main' işlevi içeriyor. Program yürütme orada başlayıp biter.
//

#include <iostream>
#include <fstream>
#include <string>
using namespace std;
int main()
{
/*	string ad;
	ofstream dosya1("isim.txt", ios::app);
	for (int i = 0;i < 10;i++)
	{
		if (dosya1.is_open())
		{
			cout << "adinizi giriniz :" << endl;
			cin >> ad;
			dosya1 << ad << "\n";
		}

	}
	dosya1.close();
	cout << "dosya yazildi" << endl;


	string dizi[10];
	ifstream dosya2("isim.txt");
	for (int i = 0; i < 10; i++)
	{
		if (dosya2.is_open())
		{
			do
			{
				getline(dosya2, ad);
				cout << ad << endl;
				dizi[i] = ad;
			} while (!dosya2.eof());
			dosya2.close();
			cout << "dosyada adlar okundu" << endl;
		}
		cout << dizi[i] << endl;
	}




	
	ofstream dosya3("isim.txt", ios::app);
	for (int i = 0;i < 10;i++)
	{ 
		int asc[10];
		asc[i] = 'ad';
		if (dosya3.is_open())
		{

			for (int i = 0; i < 9; i++)
			{
				if (asc[i] < asc[i + 1])
				{
					int tmp = asc[i];
					asc[i] = asc[i + 1];
					asc[i + 1] = tmp;
				}
				cout << asc[i] << endl;
		
			}

		}

	}
	dosya3.close();
	cout << "dosya yazildi" << endl;

	

	ifstream dosya4("isim.txt");
	for (int i = 0; i < 10; i++)
	{
		if (dosya4.is_open())
		{
			do
			{
				getline(dosya4, ad);
				cout << ad << endl;
				dizi[i] = ad;
			} while (!dosya4.eof());
			dosya4.close();
			cout << "dosyada adlar okundu" << endl;
		}
		cout << dizi[i] << endl;
	}
	*/

		string ad;
		string siralama[10];
		ofstream dosya1("soru.txt", ios::app);
		if (dosya1.is_open())
		{
			for (int i = 0; i < 10; i++)
			{
				cout << "adi giriniz ..: ";
				cin >> ad;
				dosya1 << ad << "\n";
				siralama[i] = ad;
			}

			dosya1.close();
		}
		else	cout << "Dosya acilamadi";

		ifstream dosya2("isim.txt");
		if (dosya2.is_open())
		{
			for (int i = 0; i < 10; i++)
			{
				for (int y = 0; y < 9; y++)
				{
					if (siralama[y] > siralama[y + 1])
					{
						string temp = siralama[y];
						siralama[y] = siralama[y + 1];
						siralama[y + 1] = temp;

					}
				}
			}
			for (int i = 0; i < 10; i++) cout << siralama[i] << endl;
			dosya2.close();
			cout << "Dosyadaki adlar okundu" << endl;
		}
		else cout << "Dosya acilamadi";


	system("pause");
	return 0;
}


