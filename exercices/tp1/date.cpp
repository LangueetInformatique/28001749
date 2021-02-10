#include "date.h"

date::date() {
}

date::~date() {
}

date::date(int a, int b, int c) {

	this->jour = a;
	this->mois = b;
	this->annee = c;
}

void date::afficher() {

	cout << "la date: " << jour << "/" << mois << "/" << annee << endl;
}


bool date::compareTo(date d) {

	bool r;
	if (annee != d.annee) r = true;
	if (mois != d.mois) r = true;
	if (jour != d.jour) r = true;
	else r = false;
	return r;
}

void date::incrementer() {

	int lmois[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	if (((annee % 4) == 0) && ((annee % 400) != 0)) lmois[1]++; jour++;
	if (jour > lmois[mois-1]) {
		jour = 1; mois ++;
		if (mois == 13) annee++; mois = 1;
	}
}
