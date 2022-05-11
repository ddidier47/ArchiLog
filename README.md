# Devoir de maison en architecture logicielle 

L'objectif est de construire un ensemble de classes permettant de modéliser les cours des actions
boursières, divers indicateurs statistiques mais aussi les différents secteurs et indices boursiers.

## Fait

### Partie I(Stock options)
Toutes les questions de cette première partie ont été implementées et marchent correctement 

### Partie II(Stock indices)
Ici seules les questions 8, 9 et 10 ont été implementées, pour le reste des questions nous
n'avons pas réussit à implémenter le pattern demandé(visiteur) mais nous avons tout de
même mis en place le prototype des différentes méthodes ainsi l'architecture qui va avec. 

### Diagrammes
Nous avons trois diagrammes repressantants trois niveaux d'architecture:
1- Premier diagramme(DiagramPart1) -> Celui-ci présente l'architecture de base c'est-à-dire de la 
question 1 à la question 4 avec notamment l'utilisation du pattern "iterator".
2- Deuxième diagramme(DiagramPart2) -> Celui-ci reprend le premier en ajoutant la question 5 et 6
avec la mise en place du pattern "decorator".
3- Troisième diagramme(DiagramPart3) -> ce dernier modélise l'architecture finale avec l'ajout 
du pattern "composite" et "visitor". 


## Démarrage

### Il faut se mettre sur le repertoire "ArchiLog" avec

```bash
cd ArchiLog
```
    
### Ensuite lancer cette commande pour compiler et exécuter le programme

```maven
mvn clean package compile exec:java -Dexec.mainClass=dm.al.m1.s2.App
```

## Auteurs

### Dimitri DIDIER
### Aguibou BARRY
