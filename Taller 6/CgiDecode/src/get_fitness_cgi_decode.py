from ctypes import c_int16
from typing import List

from src.cgi_decode import cgi_decode
from src.cgi_decode_instrumented import cgi_decode_instrumented
from src.evaluate_condition import clear_maps, distances_true, distances_false

def norm(x):
    return x/(x+1)

def get_fitness_cgi_decode(test_suite: List[str]) -> float:
    # Borro la información de branch coverage de ejecuciones anteriores
    # Recuerden que los diccionarios true_distances y false_distances son globales

    clear_maps()
    fitness = 0

    for test in test_suite:
        clear_maps()
        try:
            cgi_decode_instrumented(test)
        except:
            pass

       #obj c1 true
        if (distances_true[1]==0):
            fitness += norm(distances_false[1])
        # obj c1 false
        elif (distances_false[1]==0):
            fitness += norm(distances_true[1])


        if (2 in distances_false):
            # obj c2 true
            if (distances_true[2] == 0):
                fitness += norm(distances_false[2])
            # obj c2 false
            elif (distances_false[2] == 0):
                fitness += norm(distances_true[2])
        else:
            fitness+=1



        if (3 in distances_false):
            # obj c3 true
            if (distances_true[3] == 0):
                fitness += norm(distances_false[3])
            # obj c3 false
            elif (distances_false[3] == 0):
                fitness += norm(distances_true[3])
        else:
            fitness+=1


        if (4 in distances_false):
            # obj c4 true
            if (distances_true[4] == 0):
                fitness += norm(distances_false[4])

            # obj c4 false
            elif (distances_false[4] == 0):
                fitness += norm(distances_true[4])
        else:
            fitness+=1


        if (5 in distances_false):
            # obj c5 true
            if (distances_true[5] == 0):
                fitness += norm(distances_false[5])

            # obj c5 false
            elif (distances_false[5] == 0):
                fitness += norm(distances_true[5])
        else:
            fitness += 1


        # #c1 siempre se evalua
        #
        # # goal: c2
        # if (2 not in distances_true):
        #     fitness += norm(distances_true[1])
        #
        # # goal: c3
        # if(3 not in distances_true):
        #     if (2 in distances_true):
        #         if(3 not in distances_true):
        #             fitness += norm(distances_false[2])
        #     else:
        #         fitness += 1 + norm(distances_true[1])
        #
        # # goal: c4
        # if(4 not in distances_true):
        #     if (3 in distances_true):
        #         #c3 fue por la rama false
        #         fitness += norm(distances_true[3])
        #     elif (2 in distances_true):
        #         #c2 fue por la rama true
        #         fitness += 1 + norm(distances_false[2])
        #     else:
        #         #c1 fue por la rama false
        #         fitness += 2 + norm(distances_true[1])
        #
        # # goal: c5
        # if(5 not in distances_true):
        #     if (4 in distances_true):
        #         #c4 fue por la rama false
        #         fitness += norm(distances_true[4])
        #     elif(3 in distances_true):
        #         #c3 fue por la rama false
        #         fitness += 1 + norm(distances_true[3])
        #     elif(2 in distances_true):
        #         #c2 se fue por la rama true
        #         fitness += 2 + norm(distances_false[2])
        #     else:
        #         #c1 se fue por la rama false
        #         fitness += 3 + norm(distances_true[1])

    return fitness
