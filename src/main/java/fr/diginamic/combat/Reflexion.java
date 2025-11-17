package fr.diginamic.combat;

public class Reflexion {
    /* Menu
    1. Créer le personnage :
    Personnage avec 3 attributs : force (entre 12 et 18) aléatoirement
                                  santé (entre 20 et 50) aléatoirement
                                  score (0)

    Personnage début avec 3 potions : soin, mineure et majeure
    - Potion de soin (+5 à 10 pts)
    - Attaque mineure (+3 atq) prochain combat
    - Attaque majeure (+5 atq) 2 combats

    2. Combattre créature :
    Le personnage engage le combat
    Si santé > 0 le combat commence
    Si santé < 0 "Votre personnage est décédé, il a obtenu un score de X points. Veuillez créer un nouveau personnage"

    Le personnage combat une créature du BESTIAIRE (selon vos préférences)
    - Un loup : force (entre 3 et 8), santé (entre 5 et 10)
    - Un gobelin : force (entre 5 et 10) santé (entre 10 et 15)
    - Un troll : force (entre 10 et 15) santé (entre 20 et 30)

    Le combat commence par l'affichage de la créature rencontrée

    Le combat (tours) :
    - Chaque tour, on calcule l'attaque des 2. L'attaque = force + nombre aléatoire entre 1 et 10.
    - Celui avec le + d'attaque GAGNE le tour
    - Celui qui gagne inflige une quantité de dégats à la différence entre les 2 valeurs d'attaque calculées avant
   - Cette quantité de dégats se soustrait au nombre de points de santé de celui qui a perdu le tour


   - IF santé est null ou négatif le combat termine, partie finie, score du personnage affiché
   - If personnage gagne combat score +1 if loup, +2 if gobelin, +5 troll
   - Message avec le nouveau score

   Rejoue tant que le personnage est en vie.

   A la fin du combat gagné, 50% de chance d'avoir récompense :
   - potion de soin (+5 à 10 pts santé)
   - Potion attaque mineure (+3 pts attaque) valable uniquement durant le prochain combat
   - Potion attaque majeure (+5 pts attaque) valable 2 combats
   - Score +5

   4. Prendre une potion
        Consommer 1 potion possédez

   5. Afficher score

   6. Quitter
     */


}
