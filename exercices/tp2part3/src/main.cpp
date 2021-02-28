#include "main.h"

int main(){

	comptmots("adélaide.txt",1);
	comptmots("adélaide.txt",2);

	string phrase = "ebebeahabe bee ebah";
	renvoienbe(phrase,'e');

	string car = "caractères: a , b , c";
	associercarcompteur(car);

	string car2 = "caractères: x , y , z";
	associercarcompteur(car2);

	for(int k=0; k<taille_glob; k++){
		cout << k << " : " << global_tab_char[k] << endl;
	}
}
