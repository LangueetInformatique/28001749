#include "main.h"

int main(){

	comptmots("ad�laide.txt",1);
	comptmots("ad�laide.txt",2);

	string phrase = "ebebeahabe bee ebah";
	renvoienbe(phrase,'e');

	string car = "caract�res: a , b , c";
	associercarcompteur(car);

	string car2 = "caract�res: x , y , z";
	associercarcompteur(car2);

	for(int k=0; k<taille_glob; k++){
		cout << k << " : " << global_tab_char[k] << endl;
	}
}
