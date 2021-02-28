#include "CompterMots.h"

vector<char> global_tab_char;
int taille_glob = 0;

void comptmots(string fichier, int methode){

	//va lire un fichier.txt et en faire un tableau
	//de caractères, avant d'effectuer un decoupage en tokens,
	//en fonction d'une méthode 1 ou 2.

	ifstream fin;
	fin.open(fichier); //ouverture du fichier

	if(fin.fail()){
		cerr << "erreur, on peut pas lire le fichier " << fichier << endl;
	}

	else{

		char byte = 0;	//permet d'initier les char

		vector<char> tab_char; //tableau de caractères, 1 caractère pour chaque indice du tableau
		int taille = 0;

		while(fin.get(byte)){
			taille ++;
			tab_char.push_back(byte); //on pourrait regrouper les char en mots et les mettre dans un tableau
		}

	int nb_mots = renvoienbcar(tab_char,taille,methode);
	cout << "il y a " << nb_mots << " mots dans cette phrase selon la méthode " << methode << "." <<endl;
	}
}


int renvoienbcar(vector<char> tab_char, int taille, int methode){

	//prend en entrée un tableau de char ainsi que sa taille, et renvoie
	//le nombre de tokens mots dans le tableau, selon une methode 1 ou 2.

	int compteur = 1; //le premier mot, qui est compté de base. on aura toujours 1 mot de plus que d'espaces.

	switch(methode){

		case 1:

			for(int i=0; i<taille; i++){

				if(tab_char[i] == ' ' || tab_char[i] == '\n' || tab_char[i] == '\t' || tab_char[i] == '\0'){

					compteur ++;

					while(tab_char[i+1] == ' ' || tab_char[i+1] == '\n' || tab_char[i+1] == '\t' || tab_char[i+1] == '\0'
							|| tab_char[i+1] == '.' || tab_char[i+1] == '!' || tab_char[i+1] == '?' || tab_char[i+1] == ';'
							|| tab_char[i+1] == ':' || tab_char[i+1] == ','){
						//on élimine ainsi les doubles espaces / autres séparateurs qui se suivent dans le texte, ainsi que la
						//ponctuation, rendant le compte plus proche du vrai total de mots.
						i++;
					}
				}
			}

			break;

		case 2:

			regex r("[^0-9A-Za-z]");

			for(int i=0; i<taille; i++){

				if(regex_match(string(1,tab_char[i]), r)){  //2 problèmes: les ponctuations suivies d'espaces qui comptent double, et l'encodage,
															 //qui crée des signes en trop, tels que 'Ã' ou encore '©'. De plus, la séparation
					compteur ++;							 //se fait aussi sur les tirets et les apostrophes, ce qui explique un plus grand nombre
															 //de séparations.

					while(regex_match(string(1,tab_char[i+1]), r)){ //résolution du premier problème: on 'saute' les ponctuations / espaces répétés.
						i++;
					}
				}
			}

			break;
	}

	return compteur;
}

void renvoienbe(string phrase, char c){

	//prend en entrée un string et renvoie le nombre
	//de fois que l'on y voit le caractère c.

	int compteur = 0;

	for(string::size_type i = 0; i<phrase.size(); i++){ //string::size_type i = 0 au lieu de int i = 0 pour éviter un warning:
														 //on comparait un size_type avec un int !
		if(phrase[i] == c){

			compteur ++;
		}
	}

	cout << "il y a " << compteur << " '" << c << "' dans cette phrase. " << endl;
}

void associercarcompteur(string car){

	//prend en entrée un string, et en lit chaque caractères, afin
	//de les placer dans un tableau, si le caractère lut n'est pas déjà
	//dedans. le tableau est une variable globale.

	for(string::size_type i=0; i<car.size(); i++){
		bool dejavu = false;

		for(int j=0;j<taille_glob;j++){ //on parcourt le string

			if(car[i] == global_tab_char[j]){ //on parcourt le tableau pour chaque char du string
				dejavu = true; //si on tombe sur le char dans le tableau, on le note comme déjà vu.
			}
		}

		if(dejavu != true){ //si le char n'est pas déjà dans le tableau...

			taille_glob++;
			global_tab_char.push_back(car[i]); //... on incrémente le tableau avec le char.
		}
	}
}
