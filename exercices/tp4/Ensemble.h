#include <iostream>
#include <vector>
using namespace std;

template <typename T> class ensemble {
protected :
	unsigned int capacite;
	vector<T> vect;  // correct ?
public :
	ensemble(unsigned int taille);
	~ensemble();
	T recuperer(unsigned int i)const;
	void ajouter(T it);
	void supprimer(T i);
	void appartenance(T i);
};
