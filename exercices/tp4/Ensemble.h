#include <iostream>
#include <cassert>
using namespace std;

template <typename T> class creaTab {
protected :
	unsigned int capacite;
	unsigned int pasExtension;
	T* tab;
public :
	creaTab(unsigned int c, int p);
	~creaTab();
	void add(unsigned int i, T it);
	void suppr(T it);
	bool isIn(T it);
};
