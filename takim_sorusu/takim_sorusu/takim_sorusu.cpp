	//4 tane takım isimi girilecek.haftalara göre fikstür yapılacak(3 hafta)fikstür adlı dosyaya kaydet.maç sonuçlarını biz gireceğiz.takım puanlarını hesapla.
	//puan sıralamasını txt dosyasına yazacağız.bu dosyada atılan goller yenilen goller puan bulunmalı.bunu yeni projede yaparız.(attıgı yediği galibiyet mağlubiyet puan)
	

#include <iostream>
#include <string>
#include <fstream>
using namespace std;

string evsahibi;
string deplasman;
int evsg;
int depg;

struct takim
{
	int ag=0,yg=0,p=0;
	string ad;
};





int main()
{
	int x;
	cout << "takimlar ..:" << endl;
	cout << "galatasaray" << " fenerbahce" << " besiktas" << " trabzonspor" << endl;
	string g = "gs";
	string t = "ts";
	string b = "bjk";
	string f = "fb";
	
	ofstream mac("fikstur.txt", ios::app);
	if (mac.is_open())
	{


	takim gal, bes, fen, tra;
	//gal.ad = "galatasaray";
	for (int i = 0;i < 3;i++)
	{
		for (int j = 0;j < 2;j++)
		{

			cout << i+1 << ". hafta maclari : \n" << endl;

			cout << " ev sahibi takimi giriniz ..: " << endl;
			cin >> evsahibi;

			cout << " deplasman takimi giriniz ..: " << endl;
			cin >> deplasman;

			cout << "ev sahibi takimin golu ..: " << endl;
			cin >> evsg;

			cout << "deplasman takimin golu ..: " << endl;
			cin >> depg;

			takim evs;
			takim dep;

			
			
			/*
			evs.ag = evsg;
			evs.yg = depg;
			evs.ad = evsahibi;
			*/

			/*
			dep.ag = depg;
			dep.yg = evsg;
			dep.ad = deplasman;
			*/

			
			if (evsg > depg)
			{
				evs.p += 3;

			}
			else if (evsg == depg)
			{
				evs.p += 1;
				dep.p += 1;
			}
			else
			{
				dep.p += 3;
			}

			/*---------------------------------------------------------------------*/
			if (evsahibi == g)
			{
				gal.p += evs.p;
				gal.ag += evsg;
				gal.yg += depg;
			}
			if (evsahibi == t)
			{
				tra.p += evs.p;
				tra.ag += evsg;
				tra.yg += depg;
			}
			if (evsahibi == b)
			{
				bes.p += evs.p;
				bes.ag += evsg;
				bes.yg += depg;
			}
			if (evsahibi == f)
			{
				fen.p += evs.p;
				fen.ag += evsg;
				fen.yg += depg;

			}
			//-----------------------------------------------------------------------//
			if (deplasman == g)
			{
				gal.p += dep.p;
				gal.ag += depg;
				gal.yg += evsg;
			}
			if (deplasman == t)
			{
				tra.p += dep.p;
				tra.ag += depg;
				tra.yg += evsg;
			}
			if (deplasman == b)
			{
				bes.p += dep.p;
				bes.ag += depg;
				bes.yg += evsg;
			}
			if (deplasman == f)
			{
				fen.p += dep.p;
				fen.ag += depg;
				fen.yg += evsg;
			}

			cout << evsahibi << "-" << deplasman << " sonucu ..: " << evsg << "-" << depg << endl;
			cout << evsahibi << " takiminin  puani ..: " << evs.p << deplasman << " takiminin  puani ..: " << dep.p << endl << endl;
			depg = 0;
			evsg = 0;
			evs.p = 0;
			dep.p = 0;

		}
		cout << "FİKSTUR : \n" << endl;
		cout << "gs puani:  " << gal.p << "\tgs attigi goller:  " << gal.ag << "\tgs yedigi goller:  " << gal.yg <<endl;
		cout << "bjk puani: " << bes.p << "\tbjk attigi goller: " << bes.ag << "\tbjk yedigi goller: " << bes.yg <<endl;
		cout << "ts puani:  " << tra.p << "\tts attigi goller:  " << tra.ag << "\tts yedigi goller:  " << tra.yg <<endl;
		cout << "fb puani:  " << fen.p << "\tfb attigi goller:  " << fen.ag << "\tfb yedigi goller:  " << fen.yg <<endl;

	}

	
	mac.close();
	}
	
	


	system("pause");
	return 0;
}


