#include <iostream>
#include <fstream>
#include <string>
#include <vector>
#include <regex>

using namespace std;

extern vector<char> global_tab_char;
extern int taille_glob;

void comptmots(string fichier, int methode);
int renvoienbcar(vector<char> tab_char, int taille, int methode);
void renvoienbe(string phrase, char c);
void associercarcompteur(string car);

/*
 *
 * Je tiens à m'excuser pour l'absence d'un makefile.
 * Je n'ai pas retenu comment il fallait le créer.
 * Je veillerai à sa présence pour les prochains TDs.
 *
 */
