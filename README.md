# Javones-y-Mazmorras



El proyecto usa 6 o 7 clases si contamos el main siendo estas: 



* Guerrero
* Ladron
* Mago
* Personaje
* Equipamiento
* Mago



-- Main





El Main contiene todo una serie de preguntas para utilizar las diferentes funciones creadas de manera que sea más parecida a una aventura real de dragones y mazmorras.





# === Personaje (Abstract) ===



La clase personaje es una clase abstracta de donde heredaran todas las demás clases de personajes.



Contiene: 



* Variables: String nombre, int nivel, int puntosVida, int vidaMax, boolean protegido, Inventario inventario, int dado.
* Constructores: Personaje(String nombre), Personaje(String nombre, Inventario inventario).
* Getters y Setters para sus respectivas variables.
* mostrarInfo() Devuelve los datos del personaje en un print (nombre, nivel, puntos de vida, estado de protección).
* bajarVida(int cantidad) Compara la vida actual y la reduce mientras el numero introducido no sea 0 o menor, en ese caso no se resta nada. En caso de estar protegido el daño se divide en 2. Si llega a 0 después del ataque se indica en un print.
* curar(int cantidad) Recibe un numero y mientras sea mayor de 0 y el personaje no tenga ya el máximo de vida, se cura hasta el máximo.
* setNivelInicial(int nivel) Sube el nivel del personaje hasta el indicado, subiendo su estadística de vidaMaxima por nivel.
