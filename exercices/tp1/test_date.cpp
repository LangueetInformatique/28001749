#include "test_date.h"

int main_date(void){

	date aujd = date(10,2,2021);
	date hier = date(9,2,2021);

	aujd.afficher();
	aujd.compareTo(hier);
	aujd.incrementer();
}
