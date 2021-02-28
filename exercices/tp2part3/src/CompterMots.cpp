#include "CompterMots.h"

vector<char> global_tab_char;
int taille_glob = 0;

void comptmots(string fichier, int methode){

	//va lire un fichier.txt et en faire un tableau
	//de caract�res, avant d'effectuer un decoupage en tokens,
	//en fonction d'une m�thode 1 ou 2.

	ifstream fin;
	fin.open(fichier); //ouverture du fichier

	if(fin.fail()){
		cerr << "erreur, on peut pas lire le fichier " << fichier << endl;
	}

	else{

		char byte = 0;	//permet d'initier les char

		vector<char> tab_char; //tableau de caract�res, 1 caract�re pour chaque indice du tableau
		int taille = 0;

		while(fin.get(byte)){
			taille ++;
			tab_char.push_back(byte); //on pourrait regrouper les char en mots et les mettre dans un tableau
		}

	int nb_mots = renvoienbcar(tab_char,taille,methode);
	cout << "il y a " << nb_mots << " mots dans cette phrase selon la m�thode " << methode << "." <<endl;
	}
}


int renvoienbcar(vector<char> tab_char, int taille, int methode){

	//prend en entr�e un tableau de char ainsi que sa taille, et renvoie
	//le nombre de tokens mots dans le tableau, selon une methode 1 ou 2.

	int compteur = 1; //le premier mot, qui est compt� de base. on aura toujours 1 mot de plus que d'espaces.

	switch(methode){

		case 1:

			for(int i=0; i<taille; i++){

				if(tab_char[i] == ' ' || tab_char[i] == '\n' || tab_char[i] == '\t' || tab_char[i] == '\0'){

					compteur ++;

					while(tab_char[i+1] == ' ' || tab_char[i+1] == '\n' || tab_char[i+1] == '\t' || tab_char[i+1] == '\0'
							|| tab_char[i+1] == '.' || tab_char[i+1] == '!' || tab_char[i+1] == '?' || tab_char[i+1] == ';'
							|| tab_char[i+1] == ':' || tab_char[i+1] == ','){
						//on �limine ainsi les doubles espaces / autres s�parateurs qui se suivent dans le texte, ainsi que la
						//ponctuation, rendant le compte plus proche du vrai total de mots.
						i++;
					}
				}
			}

			break;

		case 2:

			regex r("[^0-9A-Za-z]");

			for(int i=0; i<taille; i++){

				if(regex_match(string(1,tab_char[i]), r)){  //2 probl�mes: les ponctuations suivies d'espaces qui comptent double, et l'encodage,
															 //qui cr�e des signes en trop, tels que '�' ou encore '�'. De plus, la s�paration
					compteur ++;							 //se fait aussi sur les tirets et les apostrophes, ce qui explique un plus grand nombre
															 //de s�parations.

					while(regex_match(string(1,tab_char[i+1]), r)){ //r�solution du premier probl�me: on 'saute' les ponctuations / espaces r�p�t�s.
						i++;
					}
				}
			}

			break;
	}

	return compteur;
}

void renvoienbe(string phrase, char c){

	//prend en entr�e un string et renvoie le nombre
	//de fois que l'on y voit le caract�re c.

	int compteur = 0;

	for(string::size_type i = 0; i<phrase.size(); i++){ //string::size_type i = 0 au lieu de int i = 0 pour �viter un warning:
														 //on comparait un size_type avec un int !
		if(phrase[i] == c){

			compteur ++;
		}
	}

	cout << "il y a " << compteur << " '" << c << "' dans cette phrase. " << endl;
}

void associercarcompteur(string car){

	//prend en entr�e un string, et en lit chaque caract�res, afin
	//de les placer dans un tableau, si le caract�re lut n'est pas d�j�
	//dedans. le tableau est une variable globale.

	for(string::size_type i=0; i<car.size(); i++){
		bool dejavu = false;

		for(int j=0;j<taille_glob;j++){ //on parcourt le string

			if(car[i] == global_tab_char[j]){ //on parcourt le tableau pour chaque char du string
				dejavu = true; //si on tombe sur le char dans le tableau, on le note comme d�j� vu.
			}
		}

		if(dejavu != true){ //si le char n'est pas d�j� dans le tableau...

			taille_glob++;
			global_tab_char.push_back(car[i]); //... on incr�mente le tableau avec le char.
		}
	}
}
