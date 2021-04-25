#include "main.h"
#include "arbre.h"

int main(){

	//exercice 1

	list<int> liste = {12,5,10,9,12,5,10,9};
	print(liste);

	liste = set_list(liste);
	print(liste);

	liste = reverse_list(liste);
	print(liste);

	liste = empiler(liste,5);
	print(liste);

	liste = depiler(liste);
	print(liste);

	top_elem(liste);

	//exercice 2

	//on instancie la liste des etudiants
	list<string> etudiants = {"Julien","Morgann","Alexane","Chenwangli","Ana","Mustapha"};

	//cette boucle fait office de fonction Lire (on ajoute les elems de notre liste dans l'arbre)
	for(list<string>::iterator it=etudiants.begin(); it!=etudiants.end(); ++it){
		    ajouter(*it);
	}

	//les affichages, en selectionner un seul à la fois (sinon, ça affiche que le premier,
	//je ne sais pas pourquoi...)
	afficherProf(G);
	//afficher(G);

	return 0;
}
