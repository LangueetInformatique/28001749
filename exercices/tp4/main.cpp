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


}
