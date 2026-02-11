# Javones-y-Mazmorras



El proyecto usa 6 o 7 clases si contamos el main siendo estas: 



* Personaje
* Mago
* Guerrero
* Ladron
* Equipamiento
* Inventario



-- Main



# --- Main ---



El Main contiene todo una serie de preguntas para utilizar las diferentes funciones creadas de manera que sea más parecida a una aventura real de dragones y mazmorras.





# === Personaje (Abstract) ===



La clase Personaje es una clase abstracta de donde heredaran todas las demás clases de personajes.



Contiene: 



* Variables: String nombre, int nivel, int puntosVida, int vidaMax, boolean protegido, Inventario inventario, int dado.
* Constructores: Personaje(String nombre), Personaje(String nombre, Inventario inventario).
* Getters y Setters para sus respectivas variables.
* mostrarInfo() Devuelve los datos del personaje en un print (nombre, nivel, puntos de vida, estado de protección).
* bajarVida(int cantidad) Compara la vida actual y la reduce mientras el numero introducido no sea 0 o menor, en ese caso no se resta nada. En caso de estar protegido el daño se divide en 2. Si llega a 0 después del ataque se indica en un print.
* curar(int cantidad) Recibe un numero y mientras sea mayor de 0 y el personaje no tenga ya el máximo de vida, se cura hasta el máximo.
* setNivelInicial(int nivel) Sube el nivel del personaje hasta el indicado, subiendo su estadística de vidaMax por nivel. Aquí es donde se usa la variable dado, sirve para tener un valor máximo como si fuera un dado para la subida de vidaMax.





# === Mago ===



La clase Mago hereda de personaje y añade 2 variables y cambia el valor de una.



Contiene:



* Variables nuevas: int mana, int manaMax.
* Establece la variable dado = 6;
* Constructores: Mago(String nombre), Mago(String nombre, Inventario inventario).
* Getters y Setters para sus nuevas variables.
* Override: Usamos un override de setNivelInicial para añadir en la función el mana para poderla escalar con el nivel.
* LanzarHechizo(int costeMana) Comprueba que tengas suficiente mana para lanzar y lo lanza si tienes suficiente.





# === Guerrero ===



La clase Guerrero hereda de personaje y añade 1 variable y cambia el valor de una.



* Variable nueva: Personaje companeroProtegido.
* Establece la variable vidaMax = 200.
* Constructores: Guerrero(String nombre), Guerrero(String nombre, Inventario inventario).
* proteger(Personaje compañero) comprueba que el compañero sea nulo, si lo es entonces establece la variable de protegido actual a ese compañero. Tambien establece a ese compañero su variable interna de estar protegido.
* dejarDeProteger() Comprueba que el compañero no sea nulo y cambia su variable interna a falso. También cambia el compañero protegido actual a nulo.
* estaProtegiendo() Simplemente devuelve a quien protege.





# === Ladron ===



La clase Ladron hereda de personaje y añade 1 variable y cambia el valor de una.



* Variable nueva: boolean invisible.
* Establece la variable dado = 8;
* Constructores: Ladron(String nombre), Ladron(String nombre, Inventario inventario).
* robar() Simplemente comprueba si eres invisible o no e imprime un texto u otro dependiendo del estado.
* hacerseInvisible() Es un toggle para la invisibilidad, cambia el estado de uno al otro dependiendo del estado.
* estaInvisible() Devuelve el estado actual.
