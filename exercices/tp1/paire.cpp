#include "paire.h"

int main() {

	short n;
	cout << "veuillez entrer un entier" << endl;
	cin >> n;

	if (parite(n) == true)
		cout << "entier pair" << endl;

	else
		cout << "entier impair" << endl;
	return 0;
}
