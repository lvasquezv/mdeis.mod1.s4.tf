# BITACORA

- Analizamos la solucion
  - Vemos la necesidad de aplicar el patron "Command" para la ejecucion de los comandos
  - Vemos la necesidad de aplicar el patron "Estrategia" para poder separar los algoritmos de calculo de los puntos
   
- Generamos el repositorio
- Hemos aplicado el concepto de Value Object, aprendido en el modulo de arquitectura, para poder crear tipos de objetos encapsulados con validaciones. Esto nos sirve para el comando de cantidad de bolos caidos, ya que nos puede llegar F, que en cantidad seria igual a Cero.
- Vemos la necesidad de aplicar Factory Method, creando una interfaz ScoreboardGame, a las cuales va existir una clase concreta ScoreboardGame10, que va contener 10 lanzamientos por jugador. 
