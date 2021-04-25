#include "fonctions.h"

list <int> set_list(list<int> l){

	//liste.sort();
	//liste.unique();

	list <int> liste = l;
	list<int>::iterator iter = liste.begin();
	set<int> elements;

	while (iter != liste.end()){

		if (elements.find(*iter) != elements.end()){
			iter = liste.erase(iter);
		}

		else{
			elements.insert(*iter);
			++iter;
		}
	}

	return liste;
}

list <int> reverse_list(list<int> l){

	list <int> liste;

	for(list<int>::iterator it=l.begin(); it!=l.end(); ++it){
	    liste.push_front(*it);
	}

	return liste;
}

void print(list<int> const &list){

	for (auto const &i: list) {
    	cout << i << " , ";
    }
    cout << "" << endl;
}
