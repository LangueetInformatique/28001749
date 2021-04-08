#include "main.h"

int main(){

	//EXERCICE 1 ----------

	float a = 4.1;
	float b = 5.1;

	cout << a << "\t" << b << endl;

	swap(a,b);
	cout << a << "\t" << b << endl;

	//---------------------

	date d1(12,11,2019);
	date d2(25,12,2021);

	d1.afficher();
	d2.afficher();

	swap(d1,d2);
	d1.afficher();
	d2.afficher();

	//---------------------

	Etudiant e1(10);
	Etudiant e2(20);

	swap(e1,e2);

	//EXERCICE 2 ----------

	Etudiant e3(10);
	Etudiant e4(20);

	auto test = ensemble<Etudiant>(0);
	test.ajouter(e3);
	test.appartenance(e3);
	test.supprimer(e3);
}
