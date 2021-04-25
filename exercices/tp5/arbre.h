#ifndef ARBRE_H_
#define ARBRE_H_

#include <iostream>
#include <set>
#include <list>
using namespace std;

/*
 * je ne sais pas pourquoi, mais mettre mes fonctions dans un .cpp renvoyait
 * une erreur que je n'arrivais pas à résoudre. Je met donc exeptionnellement
 * mes fonctions ici.
 */

//création d'une liste chainée, avec struct.
struct Node{
	  string nom;
	  int num;
	  Node* fils_droite;
	  Node* fils_gauche;
};

//le compteur pour obtenir les numéros de machine
//et l'arbre, instancé en variable globale
int compt_num = 0;
Node* G = NULL;

//comme décrite dans le TD
void insere(Node* noeud){

	Node* courant = G;
	Node* precedent = NULL;

	//etape AjouterSommet() en surplus
	if(G == NULL){
	   G = noeud;
	   return;
	}

	while(courant){

		precedent = courant;
		if(noeud->num < courant->num)
			courant = courant->fils_gauche;
		else
			courant = courant->fils_droite;
	}

	if(noeud->num < precedent->num)
		precedent->fils_gauche = noeud;
	else
		precedent->fils_droite = noeud;
}

//fonction inserer du TD, on a juste mit l'étape AjouterSommet()
//directement dans insere.
void ajouter(string nom){

	compt_num++; //on instancie à chaque étudiant un num de machine

	//création d'un nouveau noeud
	Node* ajout = new Node;
	ajout->nom = nom;
	ajout->num = compt_num;
	ajout->fils_droite = NULL;
	ajout->fils_gauche = NULL;

	//on le met dans la liste chainée
	insere(ajout);
}

//cette fonction va tout afficher
void afficher(Node* noeud){
	cout << noeud->nom << endl;
	afficher(noeud->fils_droite);
	afficher(noeud->fils_gauche);
}

void afficherProf(Node* noeud){
	cout << noeud->nom << endl;

	Node* gauche = noeud->fils_gauche;
	Node* droite = noeud->fils_droite;

	while(droite){
		cout << droite->nom << " , ";
		droite = droite->fils_droite;
	}

	while(gauche){
		cout << gauche->nom << " , ";
		gauche = gauche->fils_gauche;
	}

	cout << endl;

	afficherProf(noeud->fils_droite);
	afficherProf(noeud->fils_gauche);
}

#endif /*ARBRE_H_*/
