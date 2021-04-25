#include "fonctions.h"

//partie 1 ex1
list <int> set_list(list<int> liste){

	//liste.sort();
	//liste.unique();

	list<int>::iterator iter = liste.begin();
	set<int> elements;

	while (iter != liste.end()){

		if (elements.find(*iter) != elements.end()){ //meme si find() n'est pas mentionné, je trouve son utilisation
			iter = liste.erase(iter);				 //très pratique ici.
		}

		else{
			elements.insert(*iter);
			++iter;
		}
	}

	return liste;
}

//partie 2 ex1
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

//partie 3 ex1
list<int> empiler(list<int> liste, int s){

    liste.push_front(s);
    return liste;
}

list<int> depiler(list<int> liste){

	liste.pop_front();
    return liste;
}

void top_elem(list<int> liste){

	cout << *liste.begin() << endl;
}
