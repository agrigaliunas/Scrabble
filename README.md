# Scrabble
Scrabble game, coded for Object Oriented Programming subject.
El objetivo de este ejercicio es modelar algunos de los elementos presentes durante una partida de Scrabble. Para esto se pide:

1- Implementar una clase que represente una ficha de Scrabble, de la que se conoce su letra y los puntos que aporta usarla. Las fichas deberán ser creadas a partir de dichos datos.

2- Crear una clase que represente a cada jugador. Cada jugador tendrá un identificador numérico, un nombre y un conjunto de 7 fichas que le serán asignadas posterior a su creación.

3- Crear una clase que represente el juego, que sostendrá un conjunto de jugadores y un conjunto de 100 fichas. El tamaño del conjunto de jugadores dependerá del número de jugadores ingresados al configurar su cantidad.

4- Definir en la clase Juego los métodos:
- configurarJugadores: que configure la cantidad de jugadores (2 a 4) y el nombre de cada uno de ellos. Todos los datos deberán ser solicitados al usuario e ingresados por teclado.
- generarFichas: que genere las 100 fichas para la partida
- asignarFichas: que asigne a cada jugador ya creado, siete fichas

5- Definir en la clase Jugador:
- un constructor que reciba de parámetro el nombre del jugador. Internamente, deberá asignarle además un identificador númerico, único para cada jugador creado.
- un método que retorne el valor total de las fichas que tiene asignadas.
- un método que muestre por consola cada una de las fichas que tiene asignadas.

Para comprobar el correcto funcionamiento de todo lo anterior, se deberá escribir un programa que genere una partida con múltiples jugadores, y repartir a cada uno de ellos las fichas correspondientes. A continuación, se deberá mostrar por consola, por cada jugador, las fichas asignadas y la sumatoria de los valores de sus fichas.
