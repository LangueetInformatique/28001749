#include "Ensemble.h"

template <typename T> creaTab<T>::creaTab(unsigned int c, int p) {
	assert((c>=0) && (p>0));
	capacite = c;
	pasExtension = p;
	tab = new T[capacite];
}

template <typename T>creaTab<T>::~creaTab() {
	delete [] tab;
	tab = NULL;
}

template <typename T> void creaTab<T>::add(unsigned int i, T it) {
	if (i < capacite){
			tab[i] = it;
	}
}

template <typename T> void creaTab<T>::suppr(T it) {
	for(T i=0;i<capacite;i++){
			if(tab[i] == it){
				delete tab[i];
			}
		}
}

template <typename T> bool creaTab<T>::isIn(T it) {
	bool in = false;
		for(T i=0;i<capacite;i++){
			if(tab[i] == it){
				in = true;
			}
		}

		return in;
}
