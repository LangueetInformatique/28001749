#include "main.h"

int main(){

	//exercice 1:

	map <string, string> etudiants;
	etudiants["Julien"] = "1";
	etudiants["Alexane"] = "2";
	etudiants["Morgann"] = "3";
	etudiants["Mustapha"] = "4";
	etudiants["Chenwangli"] = "5";
	etudiants["Ana"] = "6";

	for(auto & word : etudiants) {
		cout << word.first << "  "; cout << word.second << endl;
		}

	//exercice 2:

	map <string, int> cpt;
	ifstream texte("adelaide.txt");
	string mot;

	while (texte >> mot) {
		++cpt[mot];
	}

	for(auto & word : cpt) {
		cout << word.first << "  "; cout << word.second << endl;
	}

	return 0;
}
