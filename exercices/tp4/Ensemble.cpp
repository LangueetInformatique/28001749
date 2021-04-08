#include "Ensemble.h"

template <typename T> ensemble<T>::ensemble(unsigned int taille){
	capacite = taille;
	vector<T> vect(capacite); // correct ?
}

template <typename T>ensemble<T>::~ensemble() {
	vect.clear();
}

template <typename T> T ensemble<T>::recuperer(unsigned int i) const {
	return vect[i];
}

template <typename T> void ensemble<T>::ajouter(T it) {
	vect.push_back(it);
}

template <typename T> void ensemble<T>::supprimer(T it) {
	for (unsigned int i=0; i<vect.size(); i++) {
			if(vect[i] == it){ // comment comparer
				vect.erase(vect.begin()+i);
			}
	}
}

template <typename T> void ensemble<T>::appartenance(T it) {
	for (unsigned int i=0; i<vect.size(); i++) {
				if(vect[i] == it){ // comment comparer
					cout << "dans le vecteur" << endl;
				}

				else{
					cout << "pas dans le vecteur" << endl;
				}
		}
}


