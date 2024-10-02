# Ejercicio 1
1. 72
2. False Conditional y True conditional fueron los que más mutantes generaron. Esto es ṕorque hay más condicionales que otro tipo de elementos en el código analizado.
3. Null Return y Empty Return fueron los que menos mutantes generaron. Esto ocurre porque en el código analizado hay pocas funciones que devuelven enteros, string u objetos no primitivos.

# Ejercicio 2
1. En el StackTests1, se eliminaron 18 mutantes y qiedaron 54. En el StackTests2 se eliminaron 34 mutantes y quedaron 38 vivos. En el StackTests3 se eliminaron 34 mutantes y quedaron 38 vivos.
    
2. En el StackTest1 el mutation score es de 25%. En el StackTest2 el mutation score es de 47%. En el StackTest3 el mutation score es de 47%.

# Ejercicio 3
1. 84%
2. vivos 11 muertos 61
3. Los mutantes vivos que quedaron son:
    - El 1110 que altera la función pop de manera que no entra nunca al código que tira la excepción cuando se llama sobre un stack vacío. Este mutante no se puede eliminar ya que después de el chequeo de la excepción se llama a la función top, que si tira la excepción correcta. Es decir, a pesar de que, en principio, no hay problema con ejecutar pop en un stack vacío, la excepción se genera de todas formas por el llamado a la función top y el comportamiento es equivalente.
    - El 2628 que altera la función equals de manera que nunca entra a la cláusula que define que si llamas a la función dos veces con el mismo stack devuelva true. Pero como cuando es el mismo stack el resto de las condiciones necesarias para determinar que son iguales se cumplen, no afecta el comportamiento final de la función.
    - El resto de los mutantes vivos afectan la función de hash.
4. 58%

# Ejercicio 4
1. Se generaron 610 tests
2. no falló ninguno
3. 83%

# Ejercicio 5
1. Cuando se popeaba un elemento la posición en el que este estaba no pasaba a ser null.
2. 86%

# Ejercicio 6
100%