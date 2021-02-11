#include "test_date.h"

int main(){

	date aujd(10,2,2021);
	date hier(9,2,2021);

	aujd.afficher();
	aujd.compareTo(hier);
	aujd.incrementer();
	aujd.afficher();

	return 0;
}
