fun main() {

    var op: Int

    do {

        limpiaConsola()
        mostrarMenuPpal()
        op = pedirOpcion(0, 3)

        if (op != 0) {
            mostrarMenu(op)
        }

    } while (op != 0)

}


fun mostrarMenuPpal() {
    println("1. Ejercicios U1")
    println("2. Ejercicios U2")
    println("3. Ejercicios U3")
}

fun mostrarMenu(tipo: Int) {
    var op = -1

    do {
        limpiaConsola()
        when (tipo) {
            1 -> {
                println("1. Ejercicio 04")
                println("2. Ejercicio 06")
                println("3. Ejercicio 12")
                println("4. Ejercicio 15")
                println("5. Ejercicio 18")
                println("6. Ejercicio 20")
                println("7. Ejercicio 21")
                println("8. Ejercicio 22")
                println("9. Ejercicio 24")
                println("10. Ejercicio 25")
                println("11. Ejercicio 26")
                println("12. Ejercicio 27")

                op = pedirOpcion(0, 12)
                when (op) {
                    1 -> ejercicio4()
                    2 -> ejercicio6()
                    3 -> ejercicio12()
                    4 -> ejercicio15()
                    5 -> ejercicio18()
                    6 -> ejercicio20()
                    7 -> ejercicio21()
                    8 -> ejercicio22()
                    9 -> ejercicio24()
                    10 -> ejercicio25()
                    11 -> ejercicio26()
                    12 -> ejercicio27()



                }
            }

            2 -> {
                println("1. EjCondicion 02")
                println("2. EjCondicion 03")
                println("3. EjCondicion 06")
                println("4. EjCondicion 08")
                println("5. EjCondicion 10")
                println("6. EjIterativa 02")
                println("7. EjIterativa 04")
                println("8. EjIterativa 06")
                println("9. EjIterativa 07")
                println("10. EjIterativa 08")
                println("11. EjIterativa 13")
                println("12. EjIterativa 15")
                println("13. EjIterativa 18")
                println("14. EjIterativa 19")
                println("15. EjIterativa 25")
                println("16. Ejexcepciones 02")
                println("17. Ejexcepciones 03")
                println("18. Ejexcepciones 04")

                op = pedirOpcion(0, 18)
                when (op) {
                    1 -> condicion02()
                    2 -> condicion03()
                    3 -> condicion06()
                    4 -> condicion08()
                    5 -> condicion10()
                    6 -> iterativa02()
                    7 -> iterativa04()
                    8 -> iterativa06()
                    9 -> iterativa07()
                    10 -> iterativa08()
                    11-> iterativa13()
                    12 -> iterativa15()
                    13 -> iterativa18()
                    14 -> iterativa19()
                    15 -> iterativa25()
                    16 -> excepciones02()
                    17 -> excepciones03()
                    18 -> excepciones04()


                }
            }

            3 -> {
                println("1. Listas 04")
                println("2. Listas 06")
                println("3. Listas 08")
                println("4. Listas 09")
                println("5. Listas 10")
                println("6. Listas 13")
                println("7. Diccionario 03")
                println("8. Diccionario 05")
                println("9. Diccionario 06")
                println("10. Diccionario 07")
                println("11. Diccionario 08")
                println("12. Diccionario 10")
                println("13. Diccionario 11")
                println("14. Conjuntos 01")
                println("15. Conjuntos 02")
                println("16. Conjuntos 03")
                println("17. Conjuntos 04")
                println("18. Conjuntos 05")
                println("19. Conjuntos 06")

                op = pedirOpcion(0, 19)
                when (op) {
                    1 -> listas04()
                    2 -> listas06()
                    3 -> listas08()
                    4 -> listas09()
                    5 -> listas10()
                    6 -> listas13()
                    7 -> diccionario03()
                    8 -> diccionario05()
                    9 -> diccionario06()
                    10 -> diccionario07()
                    11 -> diccionario08()
                    12 -> diccionario10()
                    13 -> diccionario11()
                    14 -> conjuntos01()
                    15 -> conjuntos02()
                    16 -> conjuntos03()
                    17 -> conjuntos04()
                    18 -> conjuntos05()
                    19 -> conjuntos06()


                }
            }
        }
    } while (op != 0)

}

/**
 * Pedir una opción del menú
 * @param min Int - opción mínima
 * @param max Int - opción máxima
 */
fun pedirOpcion(min: Int, max: Int): Int {

    var opcion: Int
    var error = false

    do {
        print("Seleccione opción (0 = SALIR) >> ")
        opcion = try {
            readln().toInt()
        } catch (ex: NumberFormatException) {
            error = true
            -1
        }

        if (error || opcion !in min..max) {
            mensajeError(1)
            error = false
        }
    } while (opcion !in min..max)

    return opcion
}

fun mensajeError(id: Int) {
    when (id) {
        1 -> println("**Opción no válida**")
        else -> {
            println("**Error desconocido**")
        }
    }
}

fun limpiaConsola() {
    for (i in 1..10) {
        println()
    }
}

