import java.util.*

/**
 *  Nos cambia la temperatura en Celsius a Fahrenheit
 */
fun ejercicio4() {
    print("Tempatura en Celsius: ")

    var celsius = 0.0
    var fahren = 0.0
    try {
        celsius = readln().toFloat().toDouble()
        fahren = (celsius * 9 / 5) + 32

    } catch (e: NumberFormatException) {
        println("**Error** Temperatura no valida... se sustituye por 0")
    } catch (e: IllegalArgumentException) {
        println("**error** $e")
    } catch (e: Exception) {
        println("**error** $e")
    }

    println("Su temperatura es de $fahren grados Fahrenheit")
}

/**
 *  Te pide el importe final de un artículo y calcula el IVA que se ha pagado
 *  y el importe sin IVA (suponiendo que se ha aplicado un tipo de IVA del
 *  10%).
 */
fun ejercicio6() {
    print("Importe final: ")

    var coniva = 0.0
    var iva = 0.0
    var siniva = 0.0
    try {
        coniva = readln().toFloat().toDouble()
        iva = (coniva * (10.0 / 100.0))
        siniva = coniva - iva

    } catch (e: NumberFormatException) {
        println("**Error** Temperatura no valida... se sustituye por 0")
    } catch (e: IllegalArgumentException) {
        println("**error** $e")
    } catch (e: Exception) {
        println("**error** $e")
    }

    println("As pagado $iva de IVA")
    println("Tu importe sin IVA es de ${siniva}.")

}

/**
 *  Escribir un programa que pida al usuario su peso (en kg) y estatura
 *  (en metros), calcule el índice de masa corporal y lo almacene en una
 *  variable, y muestre por pantalla la frase Tu índice de masa corporal
 *  es donde es el índice de masa corporal calculado redondeado con dos
 *  decimales.
 */
fun ejercicio12() {
    print("Introduce tu peso en kg: ")
    val peso = readln().toDouble()

    print("Introduce tu estatura en metros: ")
    val estatura = readln().toDouble()

    var masa = 0.0
    try {
        masa = peso / (estatura*estatura)


    } catch (e: NumberFormatException) {
        println("**Error** Valores no validos... se sustituye por 0")
    } catch (e: IllegalArgumentException) {
        println("**error** $e")
    } catch (e: Exception) {
        println("**error** $e")
    }
    val masaredondeado = String.format("%.2f", masa)
    println("Tu indice de masa corporal es de $masaredondeado")
}


/**
 *  Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece
 *  el 4% de interés al año. Estos ahorros debido a intereses, que no se
 *  cobran hasta finales de año, se te añaden al balance final de tu
 *  cuenta de ahorros. Escribir un programa que comience leyendo la
 *  cantidad de dinero depositada en la cuenta de ahorros, introducida
 *  por el usuario. Después el programa debe calcular y mostrar por
 *  pantalla la cantidad de ahorros tras el primer, segundo y tercer años.
 *  Redondear cada cantidad a dos decimales.
 */
fun ejercicio15() {
    print("Introduce el dinero que quieras depositar: ")
    var dinero = 0.0
    var año1 = 0.0
    var año2 = 0.0
    var año3 = 0.0

    try {
        dinero = readln().toDouble()
        año1 = dinero *(1+0.04)
        año2 = año1 *(1+0.04)
        año3 = año2 *(1+0.04)

    } catch (e: NumberFormatException) {
        println("**Error** dinero introducido no valido... se sustituye por 0")
    } catch (e: IllegalArgumentException) {
        println("**error** $e")
    } catch (e: Exception) {
        print("**error** $e")
    }
    val año1red = String.format("%.2f", año1)
    val año2red = String.format("%.2f", año2)
    val año3red = String.format("%.2f", año3)
    println("Tu capital es de:\n1ºAño: $año1red \n2ºAño: $año2red \n" +
            "3ºAño: $año3red")

}

/**
 *  Escribir un programa que pregunte el nombre completo del usuario en la
 *  consola y después muestre por pantalla el nombre completo del usuario
 *  tres veces, una con todas las letras minúsculas, otra con todas las
 *  letras mayúsculas y otra solo con la primera letra del nombre y de los
 *  apellidos en mayúscula. El usuario puede introducir su nombre
 *  combinando mayúsculas y minúsculas como quiera.
 */
fun ejercicio18() {
    print("Introduce tu nombre completo: ")
    var nombre : String= ""

    try {
        nombre = readln()


    } catch (e: NumberFormatException) {
        println("**Error** dinero introducido no valido... ")
        nombre = ""
    } catch (e: IllegalArgumentException) {
        println("**error** $e")
    } catch (e: Exception) {
        print("**error** $e")
    }
    var nombresSeparados = nombre.split(" ").map { nombre ->
        nombre.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }
    val capitalizado = nombresSeparados.joinToString(" ")

    println("Nombre en minúsculas: ${nombre.lowercase()}\nNombre en mayúsculas: ${nombre.uppercase()}\nNombre con la primera letra en mayúscula: $capitalizado ")
}

/**
 *Los teléfonos de una empresa tienen el siguiente formato prefijo-número-extension donde el prefijo es el código
 * del país +34, y la extensión tiene dos dígitos (por ejemplo +34-913724710-56). Escribir un programa que pregunte
 * por un número de teléfono con este formato y muestre por pantalla el número de teléfono sin el prefijo y la extensión.
 */
fun ejercicio20() {
    print("Por favor, introduce un número de teléfono con formato +XX-XXXXXXXXX-XX: ")

    val num = readLine()
    val lista = num!!.split("-")

    try {
        val prefijo = lista[0]

        if (prefijo.length == 3) {
            val partes = prefijo.split("")
            if (partes[1] != "+"){
                println("Escriba bien el prefijo (+XX)")
                return
            } else if (!partes[2].matches(Regex("\\d")) || !partes[3].matches(Regex("\\d"))){
                println("Los dos últimos caracteres deben ser números")
                return
            }
        }

        val numero = lista[1]

        if (numero.length != 9){
            println("El número debe de tener de 9 digitos")
            return
        } else {
            println(numero)
        }

        val extension = lista[2]

        if (extension.length != 2){
            println("La extension debe de tener de 2 digitos")
            return
        }

    } catch (e: Exception) {
        println("**Error** $e")
    }
}


/**
 *Escribir un programa que pida al usuario que introduzca una frase en la consola y muestre por pantalla la frase invertida.
 */
fun ejercicio21() {
    print("Introduce una frase: ")
    val frase = readln()
    val invertida = frase.reversed()

    print(invertida)

}

/**
 *Escribir un programa que pida al usuario que introduzca una frase en la consola y una vocal, y después muestre por
 * pantalla la misma frase pero con la vocal introducida en mayúscula.
 */
fun ejercicio22() {
    print("Introduce una frase: ")
    val frase = readln()
    print("Introduce una vocal:")
    val vocal = readln()
    var vocales = "aeiouAEIOU"
    try {
        if (vocal.length == 1 && vocal[0] in vocales && vocal[0].isLowerCase()){
            val modificada = frase.replace(vocal, vocal.uppercase(Locale.getDefault()))
            println(modificada)
        } else println("Introduce una vocal.")


    } catch (e: Exception) {
        println("**Error** $e")
    }

}

/**
 *Escribir un programa que pregunte por consola el precio de un producto en euros con dos
 * decimales y muestre por pantalla el número de euros y el número de céntimos del precio introducido.
 */
fun ejercicio24() {
    println("Por favor, introduce el precio del producto en euros (con dos decimales): ")



    try {
        val precio= readln()
        precio.split(".")
        val euros = precio[0]
        val centimos = precio[1]

        print("El precio es de $euros euros y $centimos céntimos.")

    } catch (e: Exception) {
        println("**Error** $e")
    }

}

/**
 *Escribir un programa que pregunte al usuario la fecha de su nacimiento en formato dd/mm/aaaa y
 * muestra por pantalla, el día, el mes y el año. Adaptar el programa anterior para que también
 * funcione cuando el día o el mes se introduzcan con un solo carácter.
 */
fun ejercicio25() {
    print("Escribe tu fecha de nacmiento (dd/mm/aaaa): ")
    val fecha = readln()
     try {
             if (fecha.length < 10) {
                 fecha.split("/")
                 val dia = fecha[0].toInt()
                 if (dia >= 31) print("Solo hay 31 en el mes.")
                 val mes = fecha[1].toInt()
                 if (mes >= 12) print("Solo hay 12 meses en un año.")
                 val año = fecha[2].toInt()
                 if (año >= 2024) print("Es imposible que hayas nacido en ese año.")
             } else println("Porfavor introduce una fecha coherente.")

     } catch (e: Exception) {
         println("**Error** $e")}

}

/**
 *Escribir un programa que pregunte por consola por los productos de una cesta de la compra,
 * separados por comas, y muestre por pantalla cada uno de los productos en una línea distinta.
 */
fun ejercicio26() {
    print("Escribe los productos de una cesta de la compra separada por comas: ")
    val compras = readln()
    try {
        val listacompra = compras.split(",")
        if (listacompra != null) {
            for (compra in listacompra) print(compra.trim())
        } else print("La cadena esta vacia.")


    } catch (e: Exception) {
        println("**Error** $e")}
}

/**
 *Escribir un programa que pregunte el nombre el un producto, su precio y un número de
 * unidades y muestre por pantalla una cadena con el nombre del producto seguido de su
 * precio unitario con 6 dígitos enteros y 2 decimales, el número de unidades con tres
 * dígitos y el coste total con 8 dígitos enteros y 2 decimales.
 */
fun ejercicio27() {
    print("Nombre del producto:")
    val nom = readln()

    try {
        print("Precio del producto:")
        val precio = readln().toDoubleOrNull()
        print("Números de unidades del producto:")
        val number = readln().toIntOrNull()

        val cadena: String
        val coste = String.format("%08.2f", precio)
        val numero = String.format("%03d", number)
        val total = String.format("%08.2f", precio?.times(number!!))

        println("$nom: Precio unitario $coste, Unidades $numero, Coste total $total")

    } catch (e: Exception) {
        println("**Error** $e")}

}

/**
 * Escribir un programa que almacene la cadena de caracteres contraseña en una variable,
 * pregunte al usuario por la contraseña e imprima por pantalla si la contraseña introducida
 * por el usuario coincide con la guardada en la variable sin tener en cuenta mayúsculas y minúsculas.
 */
fun condicion02(){
    val pass = "usuario"
    print("Introduce la contraseña: ")
    val contra = readln()
    if (pass.uppercase() == contra.uppercase()){
        println("La contraseña es correcta.")
    } else println("La contraseña no coincide.")
}

/**
 * Escribir un programa que pida al usuario dos números y muestre por pantalla su división.
 * Si el divisor es cero el programa debe mostrar un error.
 */
fun condicion03(){
    println("Introduce dos números separados por una coma: ")
    try {
        val numeros = readln().split(",")
        val num1 = numeros[0].toDouble()
        val num2 = numeros[1].toDouble()
        if (num2 != 0.0){
            val resul = num1/num2
            println(resul)
        } else print("**error**")
    } catch (e: Exception) {
        println("**Error** $e")
    }
}

/**
 * Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el nombre.
 * El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres con un
 * nombre posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al
 * usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.
 */
fun condicion06(){
    println("Por favor, introduce tu nombre:")
    val nombre = readln()

    println("Por favor, introduce tu sexo (M para masculino, F para femenino):")
    val sexo = readln()

    val grupo = if ((sexo == "F" && nombre[0] < 'M') || (sexo == "M" && nombre[0] > 'N')) "A" else "B"

    println("Te corresponde el grupo $grupo.")
}

/**
 * En una determinada empresa, sus empleados son evaluados al final de cada año. Los puntos
 * que pueden obtener en la evaluación comienzan en 0.0 y pueden ir aumentando, traduciéndose
 * en mejores beneficios. Los puntos que pueden conseguir los empleados pueden ser 0.0, 0.4, 0.6 o más,
 * pero no valores intermedios entre las cifras mencionadas. A continuación se muestra una tabla con los
 * niveles correspondientes a cada puntuación. La cantidad de dinero conseguida en cada nivel es de 2.400€
 * multiplicada por la puntuación del nivel.
 *
 * Nivel	Puntuación
 * Inaceptable	0.0
 * Aceptable	0.4
 * Meritorio	0.6 o más
 * Escribir un programa que lea la puntuación del usuario e indique su nivel de rendimiento, así como la
 * cantidad de dinero que recibirá el usuario.
 */
fun condicion08(){

    print("Introduce tu puntuación: ")
    val puntos = readln().toDouble()
    if (puntos == 0.0) {
        print("Inaceptable: 0€")
    }
    if (puntos == 0.4) {
        print("Aceptable: ${puntos * 2400}€")
    }
    if (puntos == 0.6 || puntos > 0.6) {
        print("Meritorio: ${puntos * 2400}€")
    }
    else print("error")
}

/**
 * La pizzería Bella Napoli ofrece pizzas vegetarianas y no vegetarianas a sus clientes.
 * Los ingredientes para cada tipo de pizza aparecen a continuación.
 *
 * Ingredientes vegetarianos: Pimiento y tofu.
 * Ingredientes no vegetarianos: Peperoni, Jamón y Salmón.
 * Escribir un programa que pregunte al usuario si quiere una pizza vegetariana o no, y
 * en función de su respuesta le muestre un menú con los ingredientes disponibles para
 * que elija. Solo se puede eligir un ingrediente además de la mozzarella y el tomate
 * que están en todas la pizzas. Al final se debe mostrar por pantalla si la pizza elegida
 * es vegetariana o no y todos los ingredientes que lleva.
 */
fun condicion10(){
    println("¿Qué tipo de pizza quieres? (vegetariana o no vegetariana):")
    val tipoPizza = readln().lowercase()

    if (tipoPizza == "vegetariana") {
        println("Elige un ingrediente (Pimiento o Tofu):")
        val ingrediente = readln().lowercase()
        when (ingrediente) {
            "pimiento" -> println("Pizza vegetariana con tomate, mozzarella y pimiento.")
            "tofu" -> println("Pizza vegetariana con tomate, mozzarella y tofu.")
            else -> println("No tenemos ese ingrediente.")
        }
    } else if (tipoPizza == "no vegetariana") {
        println("Elige un ingrediente (Peperoni, Jamón o Salmón):")
        val ingrediente = readln().lowercase()
        when (ingrediente) {
            "peperoni" -> println("Pizza no vegetariana con tomate, mozzarella y peperoni.")
            "jamón" -> println("Pizza no vegetariana con tomate, mozzarella y jamón.")
            "salmón" -> println("Pizza no vegetariana con tomate, mozzarella y salmón.")
            else -> println("No tenemos ese ingrediente.")
        }
    } else {
        println("Tipo de pizza no válido. Debes elegir entre 'vegetariana' y 'no vegetariana'.")
    }
}

/**
 * Escribir un programa que pregunte al usuario su edad y muestre por pantalla todos los
 * años que ha cumplido (desde 1 hasta su edad).
 */
fun iterativa02(){
    println("Escribe tu edad: ")
    val edad = readln()
    try {
        val edadint = edad.toInt()
        if (edadint <= 0) print("Edad no valida")
        else {
            for (i in 1..edadint) println(i)
        }
    } catch (e: Exception) {
        println("**Error** $e")
}
}

/**
 * Escribir un programa que pida al usuario un número entero positivo y muestre por
 * pantalla la cuenta atrás desde ese número hasta cero separados por comas.
 */
fun iterativa04(){
    println("Escribe un número positivo")
    val num = readln()
    try {
        val numint = num.toInt()
        if (numint <= 0) print("Número no valido") else {
            for (i in numint downTo 0) print("$i, ")

        }
    } catch (e: Exception) {
        println("**Error** $e")}
}

/**
 * Escribir un programa que pida al usuario un número entero y muestre por pantalla
 * un triángulo rectángulo como el de más abajo, de altura el número introducido.
 *
 * *
 * **
 * ***
 * ****
 * *****
 */
fun iterativa06(){
    print("Escribe un número entero: ")
    val num = readln()
    try {
        val numInt = num.toInt()
        if (numInt <= 0) {
            println("Número no válido")
        } else {
            for (i in 1..numInt) {
                repeat(i) {
                    print("*")
                }
                println()
            }
        }
    } catch (e: Exception) {
        println("**Error** $e")
    }
}


/**
 * Escribir un programa que muestre por pantalla la tabla de multiplicar del 1 al 10.
 */
fun iterativa07(){
    for (i in 1..10) {
        println("Tabla de multiplicar del $i:")
        for (j in 1..10) {
            val resultado = i * j
            println("$i x $j = $resultado")
        }
    }
}

/**
 * Escribir un programa que pida al usuario un número entero y muestre por pantalla
 * un triángulo rectángulo como el de más abajo.
 *
 * 1
 * 3 1
 * 5 3 1
 * 7 5 3 1
 * 9 7 5 3 1
 */
fun iterativa08() {
    println("Escribe un número entero")
    val num = readLine()?.toIntOrNull()
    if (num != null) {
        for (i in 1..num step 2) {
            for (j in i downTo 1 step 2) {
                print("$j ")
            }
            println()
        }
    } else {
        println("**Error** Invalid input. Please enter an integer.")
    }
}


/**
 * Escribir un programa que muestre el eco de todo lo que el usuario introduzca
 * hasta que el usuario escriba “salir” que terminará.
 */
fun iterativa13(){
    while (true){
        println("Escribe algo (o 'salir' para terminar): ")
        val eco = readln()
        if (eco.lowercase() != "salir") println(eco) else return
    }
}

/**
 * Leer números enteros de teclado, hasta que el usuario ingrese el 0. Finalmente,
 * mostrar la sumatoria de todos los números positivos ingresados.
 */
fun iterativa15(){
    var sumatoria = 0
    while (true){
        println("Ingresa un número entero (o 0 para terminar): ")

        try {
            val num = readln()!!.toInt()
            if (num != 0) sumatoria += num else {
                println("La sumatoria de los números positivos ingresados es: $sumatoria")
                return
            }

        } catch (e: NumberFormatException) {
            println("Caracter no valido... $e")
        }
    }

}

/**
 * Solicitar al usuario que ingrese números enteros positivos y, por cada uno,
 * imprimir la suma de los dígitos que lo componen. La condición de corte es que
 * se ingrese el número -1. Al finalizar, mostrar cuántos de los números ingresados
 * por el usuario fueron números pares.
 */
fun iterativa18(){
    var pares = 0
    while (true){
        print("Ingresa un número entero positivo (o -1 para terminar): ")
        val num = readln()!!.toInt()

        if (num == -1) return
        if (num < 0 ) {
            print("El número ingresado no es positivo.")
            continue
        }
        if (num % 2 == 0) pares++
        val suma = num.toString().map {it.toString().toInt()}.sum()
        println("Has ingresado $pares números pares.")
    }
}

/**
 * Mostrar un menú con tres opciones: 1- comenzar programa, 2- imprimir listado,
 * 3-finalizar programa. A continuación, el usuario debe poder seleccionar una opción
 * (1, 2 ó 3). Si elige una opción incorrecta, informarle del error. El menú se debe
 * volver a mostrar luego de ejecutada cada opción, permitiendo volver a elegir. Si
 * elige las opciones 1 ó 2 se imprimirá un texto. Si elige la opción 3, se interrumpirá
 * la impresión del menú y el programa finalizará.
 */
fun iterativa19(){
    var opcion: Int
    do {
        println("Menú:")
        println("1- Comenzar programa")
        println("2- Imprimir listado")
        println("3- Finalizar programa")
        print("Elige una opción (1, 2, 3): ")
        opcion = readln()!!.toInt()

        when (opcion) {
            1 -> println("Has elegido comenzar el programa.")
            2 -> println("Has elegido imprimir el listado.")
            3 -> println("Has elegido finalizar el programa.")
            else -> println("Opción incorrecta. Por favor, elige 1, 2 o 3.")
        }
    } while (opcion != 3)
}

/**
 * Solicitar al usuario que ingrese una frase y luego informar cuál fue la palabra más
 * larga (en caso de haber más de una, mostrar la primera) y cuántas palabras había.
 * Precondición: se tomará como separador de palabras al carácter “ “ (espacio), ya
 * sea uno o más.
 */
fun iterativa25(){
    println("Ingrese una frase: ")
    val frase = readLine()!!.split(" ").filter { it.isNotEmpty() }
    val palabraMasLarga = frase.maxByOrNull { it.length }
    println("La palabra más larga es '${palabraMasLarga}', y la frase tiene ${frase.size} palabras.")
}
/**
 * Escribir un programa que pida al usuario un número entero positivo y muestre por
 * pantalla todos los números impares desde 1 hasta ese número separados por comas.
 */
fun excepciones02(){
    print("Escribe un número entero positivo: ")
    try {
        var num = readln().toInt()
        if (num < 0) {
            print("El número debe ser positivo.")
        } else {
            for (i in 1..num) {
                if (i % 2 != 0) {
                    print("$i, ")
                }
            }
        }
    } catch (e: NumberFormatException) {
            print("Por favor, introduce un número válido.") }
}



/**
 * Escribir un programa que pida al usuario un número entero positivo y muestre por
 * pantalla la cuenta atrás desde ese número hasta cero separados por comas. Deberá
 * solicitar el número hasta introducir uno correcto.
 */
fun excepciones03(){
    print("Escribe un número entero positivo: ")
    try {
        var num = readln().toInt()
        if (num < 0) {
            print("El número debe ser positivo.")
        } else {
            for (i in num downTo 0) {
                print("$i, ")

            }
        }
    } catch (e: NumberFormatException) {
        print("Por favor, introduce un número válido.") }
}

/**
 * Escribir un programa que pida al usuario un número entero, si la entrada no es
 * correcta, mostrará el mensaje "La entrada no es correcta" y lanzará la excepción
 * capturada.
 */
fun excepciones04(){
    println("Escribe un número entero positivo: ")
    try {
        val num = readln().toInt()
        println("Entrada correcta.")
    }catch (e: NumberFormatException) {
        print("La entrada no es correcta") }
}

/**
 * Escribir un programa que pregunte al usuario los números ganadores de la lotería
 * primitiva, los almacene en una lista y los muestre por pantalla ordenados de menor
 * a mayor.
 */
fun listas04(){
    val numerosGanadores = mutableListOf<Int>()
    while (numerosGanadores.size < 6) {
        print("Introduce los números: ")
        try {
            val num = readln().toInt()
            if (num !in 1..49 || num in numerosGanadores) {
                println("**Error**")
            } else {
                numerosGanadores.add(num)
            }
        } catch (e: NumberFormatException) {
            println("**Error**")
        }
    }
    numerosGanadores.sort()
    println("Los números ganadores ordenados de menor a mayor son: ${numerosGanadores.joinToString()}")
}

/**
 * Escribir un programa que almacene las asignaturas de un curso (por ejemplo
 * Matemáticas, Física, Química, Historia y Lengua) en una lista, pregunte al usuario
 * la nota que ha sacado en cada asignatura y elimine de la lista las asignaturas aprobadas.
 * Al final el programa debe mostrar por pantalla las asignaturas que el usuario tiene que repetir.
 */
fun listas06(){
    val asignaturas = mutableListOf("Matemáticas", "Física", "Química", "Historia", "Lengua")
    val suspensas = mutableListOf<String>()
    for (asignatura in asignaturas) {
        print("Introduce la nota de $asignatura: ")
        try {
            val nota = readln().toDouble()
            if (nota < 5) {
                suspensas.add(asignatura)
            }
        } catch (e: NumberFormatException) {
            println("**Error**")
        }
    }
    if (suspensas.isEmpty() ) print("Felicidades, no as suspendido ninguna") else print("Las asignaturas que as suspendido son: $suspensas")

}

/**
 * Escribir un programa que pida al usuario una palabra y muestre por pantalla si es un palíndromo.
 */
fun listas08(){
    print("Introduce una palabra: ")
    val palabra = readln()
    val esPalindromo = palabra == palabra.reversed()
    if (esPalindromo) {
        println("La palabra '$palabra' es un palíndromo.")
    } else {
        println("La palabra '$palabra' no es un palíndromo.")
    }
}

/**
 * Escribir un programa que pida al usuario una palabra y muestre por pantalla el número de veces
 * que contiene cada vocal.
 */
fun listas09(){
    print("Introduce una palabra: ")
    try {
        val palabra = readln().lowercase()
        val vocales = listOf('a', 'e', 'i', 'o', 'u')

        for (vocal in vocales) {
            val count = palabra.count { it == vocal }
            println("La vocal '$vocal' aparece $count veces.")
        }
    } catch (e: Exception) {
        println("**Error**")
    }
}

/**
 * Escribir un programa que almacene en una lista los siguientes precios: 50, 75, 46, 22, 80, 65, 8
 * y muestre por pantalla el menor y el mayor de los precios.
 */
fun listas10() {
    val lista = mutableListOf(50, 75, 46, 22, 80, 65, 8)
    lista.sort()
    println("El número menor es ${lista.first()} y el mayor es ${lista.last()}")
}


/**
 * Escribir un programa que pregunte por una muestra de números, separados por comas, los guarde en
 * una lista y muestre por pantalla su media y desviación típica.
 */
fun listas13() {
    print("Dame números(separadas por comas): ")
    val numeros = readln().split(",").map { it.trim().toDouble() }
    val media = numeros.sum() / numeros.size
    var sumatorio = 0.0
    for (numero in numeros) {
        sumatorio += (numero - media) * (numero - media)
    }
    val desviacionTipica = (sumatorio / numeros.size).let { var temp = it; var i = 0.0; while (i * i < temp) { i += 0.01 }; i }
    println("La media es: $media")
    println("La desviación típica es: $desviacionTipica")
}


/**
 * Escribir un programa que guarde en un diccionario los precios de las frutas de la tabla, pregunte
 * al usuario por una fruta, un número de kilos y muestre por pantalla el precio de ese número de kilos
 * de fruta. Si la fruta no está en el diccionario debe mostrar un mensaje informando de ello.
 *
 * Fruta	Precio
 * Plátano	1.35
 * Manzana	0.80
 * Pera	0.85
 * Naranja	0.70
 */
fun diccionario03(){
    val precios = mapOf("Plátano" to 1.35, "Manzana" to 0.80, "Pera" to 0.85, "Naranja" to 0.70)
    print("Introduce una fruta: ")
    try {
        val fruta = readln()
        if (fruta in precios) {
            print("Introduce el número de kilos: ")
            val kilos = readln().toDouble()
            val precio = precios[fruta]!! * kilos
            println("El precio de $kilos kilos de $fruta es $precio.")
        } else {
            println("Lo siento, la fruta $fruta no está en el diccionario.")
        }
    } catch (e: Exception) {
        println("**Error**")
    }
}

/**
 * Escribir un programa que almacene el diccionario con los créditos de las asignaturas de un curso
 * {'Matemáticas': 6, 'Física': 4, 'Química': 5} y después muestre por pantalla los créditos de cada
 * asignatura en el formato <asignatura> tiene <créditos> créditos, donde <asignatura> es cada una de
 * las asignaturas del curso, y <créditos> son sus créditos. Al final debe mostrar también el número
 * total de créditos del curso.
 */
fun diccionario05(){
    val creditos = mapOf("Matemáticas" to 6, "Física" to 4, "Química" to 5)
    var totalCreditos = 0
    for ((asignatura, creditosAsignatura) in creditos) {
        println("$asignatura tiene $creditosAsignatura créditos")
        totalCreditos += creditosAsignatura
    }
    println("El número total de créditos del curso es $totalCreditos.")
}

/**
 * Escribir un programa que cree un diccionario vacío y lo vaya llenado con información sobre una persona
 * (por ejemplo nombre, edad, sexo, teléfono, correo electrónico, etc.) que se le pida al usuario.
 * Cada vez que se añada un nuevo dato debe imprimirse el contenido del diccionario.
 */
fun diccionario06(){
    val info = mutableMapOf<String, String>()

    while (true) {
        print("Introduce el tipo de información (o 'fin' para terminar): ")
        val clave = readln()
        if (clave.lowercase() == "fin") {
            return print(info)
        }
        print("Introduce la información correspondiente: ")
        val valor = readln()
        info[clave] = valor
        println("Información actualizada: $info")
    }
}

/**
 * Escribir un programa que cree un diccionario simulando una cesta de la compra. El programa debe preguntar
 * el artículo y su precio y añadir el par al diccionario, hasta que el usuario decida terminar. Después se
 * debe mostrar por pantalla la lista de la compra y el coste total, con el siguiente formato
 *
 * Lista de la compra
 * Artículo 1	Precio
 * Artículo 2	Precio
 * Artículo 3	Precio
 * …	…
 * Total	Coste
 */
fun diccionario07(){
    val cesta = mutableMapOf<String, Double>()
    var total = 0.0
    while (true) {
        print("Introduce un artículo (o 'fin' para terminar): ")
        val articulo = readln()
        if (articulo.lowercase() == "fin") {
            break
        }
        print("Introduce el precio de $articulo: ")
        val precio = readln().toDouble()
        cesta[articulo] = precio
        total += precio
    }
    println("Lista de la compra")
    for ((articulo, precio) in cesta) {
        println("$articulo\t$precio")
    }
    println("Total\t$total")
}

/**
 * Escribir un programa que cree un diccionario de traducción español-inglés. El usuario introducirá las
 * palabras en español e inglés separadas por dos puntos, y cada par <palabra>:<traducción> separados por
 * comas. El programa debe crear un diccionario con las palabras y sus traducciones. Después pedirá una frase
 * en español y utilizará el diccionario para traducirla palabra a palabra. Si una palabra no está en el
 * diccionario debe dejarla sin traducir.
 */
fun diccionario08() {
    print("Introduce las palabras en español e inglés separadas por dos puntos, y cada par separado por comas: ")
    val entradas = readln().split(",")
    val diccionario = mutableMapOf<String, String>()
    for (entrada in entradas) {
        val (espanol, ingles) = entrada.split(":").map { it.trim() }
        diccionario[espanol] = ingles
    }
    print("Introduce una frase en español: ")
    val frase = readln()
    val traduccion = frase.split(" ").joinToString(" ") { palabra ->
        diccionario[palabra] ?: palabra
    }
    println("La traducción de la frase es: $traduccion")
}


/**
 * Escribir un programa que permita gestionar la base de datos de clientes de una empresa. Los clientes se
 * guardarán en un diccionario en el que la clave de cada cliente será su NIF, y el valor será otro diccionario
 * con los datos del cliente (nombre, dirección, teléfono, correo, preferente), donde preferente tendrá el
 * valor True si se trata de un cliente preferente. El programa debe preguntar al usuario por una opción del
 * siguiente menú: (1) Añadir cliente, (2) Eliminar cliente, (3) Mostrar cliente, (4) Listar todos los clientes,
 * (5) Listar clientes preferentes, (6) Terminar. En función de la opción elegida el programa tendrá que hacer
 * lo siguiente:
 *
 * Preguntar los datos del cliente, crear un diccionario con los datos y añadirlo a la base de datos.
 * Preguntar por el NIF del cliente y eliminar sus datos de la base de datos.
 * Preguntar por el NIF del cliente y mostrar sus datos.
 * Mostrar lista de todos los clientes de la base datos con su NIF y nombre.
 * Mostrar la lista de clientes preferentes de la base de datos con su NIF y nombre.
 * Terminar el programa.
 */
fun diccionario10() {
    val clientes = mutableMapOf<String, MutableMap<String, Any>>()
    while (true) {
        println("""
            Elige una opción:
            (1) Añadir cliente
            (2) Eliminar cliente
            (3) Mostrar cliente
            (4) Listar todos los clientes
            (5) Listar clientes preferentes
            (6) Terminar
        """.trimIndent())
        when (readln().toInt()) {
            1 -> {
                try {
                    print("Introduce el NIF del cliente: ")
                    val nif = readln()
                    val datos = mutableMapOf<String, Any>()
                    print("Introduce el nombre del cliente: ")
                    datos["nombre"] = readln()
                    print("Introduce la dirección del cliente: ")
                    datos["dirección"] = readln()
                    print("Introduce el teléfono del cliente: ")
                    datos["teléfono"] = readln()
                    print("Introduce el correo electrónico del cliente: ")
                    datos["correo"] = readln()
                    print("¿Es un cliente preferente? (s/n): ")
                    datos["preferente"] = readln().lowercase() == "s"
                    clientes[nif] = datos
                } catch (e: Exception){
                    println("**Error**")
                }

            }
            2 -> {

                print("Introduce el NIF del cliente a eliminar: ")
                try {
                    val nif = readln()
                    clientes.remove(nif)
                } catch (e: Exception){
                    println("**Error**")
                }
            }
            3 -> {
                print("Introduce el NIF del cliente a mostrar: ")
                try {
                    val nif = readln()
                    println(clientes[nif])
                } catch (e: Exception){
                    println("**Error**")
                }
            }
            4 -> {
                for ((nif, datos) in clientes) {
                    println("$nif: ${datos["nombre"]}")
                }
            }
            5 -> {
                for ((nif, datos) in clientes) {
                    if (datos["preferente"] as Boolean) {
                        println("$nif: ${datos["nombre"]}")
                    }
                }
            }
            6 -> return
        }
    }
}


/**
 * El directorio de los clientes de una empresa está organizado en una cadena de texto como la de más
 * abajo, donde cada línea contiene la información del nombre, email, teléfono, nif, y el descuento que
 * se le aplica. Las líneas se separan con el carácter de cambio de línea \n y la primera línea contiene
 * los nombres de los campos con la información contenida en el directorio.
 *
 * "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;
 * Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;
 * 5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
 * Escribir un programa que genere un diccionario con la información del directorio, donde cada elemento corresponda
 * a un cliente y tenga por clave su nif y por valor otro diccionario con el resto de la información del cliente.
 * Los diccionarios con la información de cada cliente tendrán como claves los nombres de los campos y como valores
 * la información de cada cliente correspondientes a los campos. Es decir, un diccionario como el siguiente
 *
 * {'01234567L': {'nombre': 'Luis González', 'email': 'luisgonzalez@mail.com', 'teléfono': '656343576',
 * 'descuento': 12.5}, '71476342J': {'nombre': 'Macarena Ramírez', 'email': 'macarena@mail.com', 'teléfono':
 * '692839321', 'descuento': 8.0}, '63823376M': {'nombre': 'Juan José Martínez', 'email': 'juanjo@mail.com',
 * 'teléfono': '664888233', 'descuento': 5.2}, '98376547F': {'nombre': 'Carmen Sánchez', 'email': 'carmen@mail.com',
 * 'teléfono': '667677855', 'descuento': 15.7}}
 */
fun diccionario11() {
    val directorio = "nif;nombre;email;teléfono;descuento\n01234567L;Luis González;luisgonzalez@mail.com;656343576;12.5\n71476342J;Macarena Ramírez;macarena@mail.com;692839321;8\n63823376M;Juan José Martínez;juanjo@mail.com;664888233;5.2\n98376547F;Carmen Sánchez;carmen@mail.com;667677855;15.7"
    val lineas = directorio.split("\n")
    val campos = lineas[0].split(";")
    val clientes = mutableMapOf<String, MutableMap<String, String>>()
    for (linea in lineas.drop(1)) {
        val datos = linea.split(";")
        val cliente = mutableMapOf<String, String>()
        for (i in 1 until campos.size) {
            cliente[campos[i]] = datos[i]
        }
        clientes[datos[0]] = cliente
    }
    println(clientes)
}


/**
 * Suponer una lista con datos de las compras hechas por clientes de una empresa a lo largo de un mes, la cual
 * contiene tuplas con información de cada venta: (cliente, día del mes, monto, domicilio del cliente). Ejemplo:
 *
 * [("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"), ("Jorge Russo", 7, 699, "Mirasol 218"), ("Nuria Costa",
 * 7, 532.90, "Calle Las Flores 355"), ("Julián Rodriguez", 12, 5715.99, "La Mancha 761"), ("Jorge Russo", 15, 958,
 * "Mirasol 218")]
 * Escribir una función que reciba como parámetro una lista con el formato mencionado anteriormente y retorne
 * los domicilios de cada cliente al cual se le debe enviar una factura de compra. Notar que cada cliente puede
 * haber hecho más de una compra en el mes, por lo que la función debe retornar una estructura que contenga
 * cada domicilio una sola vez.
 */
fun conjuntos01() {
    val compras = listOf(listOf("Nuria Costa", 5, 12780.78, "Calle Las Flores 355"), listOf("Jorge Russo", 7, 699, "Mirasol 218"), listOf("Nuria Costa", 7, 532.90, "Calle Las Flores 355"), listOf("Julián Rodriguez", 12, 5715.99, "La Mancha 761"), listOf("Jorge Russo", 15, 958, "Mirasol 218"))
    val domicilios = mutableSetOf<String>()
    for (compra in compras) {
        domicilios.add(compra[3] as String)
    }
    println("Los domicilios a los que se debe enviar una factura son: ${domicilios.joinToString()}")
}



/**
 * Solicitar al usuario que introduzca los nombres de pila de los alumnos de primaria de una escuela,
 * finalizando cuando se introduzca “x”. A continuación, solicitar que introduzca los nombres de los
 * alumnos de secundaria, finalizando al introducir “x”.
 *
 * Mostrar los nombres de todos los alumnos de primaria y los de secundaria, sin repeticiones.
 * Mostrar qué nombres se repiten entre los alumnos de primaria y secundaria.
 * Mostrar qué nombres de primaria no se repiten en los de nivel secundaria.
 * Mostrar si todos los nombres de primaria están incluidos en secundaria.
 */
fun conjuntos02() {
    val alumnosPrimaria = mutableSetOf<String>()
    val alumnosSecundaria = mutableSetOf<String>()

    println("Introduce los nombres de los alumnos de primaria (termina con 'x'):")
    while (true) {
        try {
            val nombre = readln()
            if (nombre.lowercase() == "x") break
            alumnosPrimaria.add(nombre)
        } catch (e: Exception){
            print("**error**")
        }
    }

    println("Introduce los nombres de los alumnos de secundaria (termina con 'x'):")
    while (true) {
        try {
            val nombre = readln()
            if (nombre.lowercase() == "x") break
            alumnosSecundaria.add(nombre)
        } catch (e: Exception){
            print("**error**")
        }
    }

    println("Alumnos de primaria: ${alumnosPrimaria.joinToString()}")
    println("Alumnos de secundaria: ${alumnosSecundaria.joinToString()}")

    val repetidos = alumnosPrimaria.intersect(alumnosSecundaria)
    println("Nombres que se repiten: ${repetidos.joinToString()}")

    val noRepetidos = alumnosPrimaria.subtract(alumnosSecundaria)
    println("Nombres de primaria que no se repiten en secundaria: ${noRepetidos.joinToString()}")

    if (alumnosPrimaria.all { it in alumnosSecundaria }) {
        println("Todos los nombres de primaria están incluidos en secundaria.")
    } else {
        println("No todos los nombres de primaria están incluidos en secundaria.")
    }
}


/**
 * El conjunto potencia de un conjunto S es el conjunto de todos los subconjuntos de S.
 *
 * Por ejemplo, el conjunto potencia de {1,2,3} es:
 *
 * {∅,{1},{2},{3},{1,2},{1,3},{2,3},{1,2,3}}
 * Escriba la función conjunto_potencia(s) que reciba como parámetro un conjunto cualquiera s y retorne
 * su «lista potencia» (la lista de todos sus subconjuntos):
 *
 * >>> conjunto_potencia({6, 1, 4})
 * [set(), set([6]), set([1]), set([4]), set([6, 1]), set([6, 4]), set([1, 4]), set([6, 1, 4])]
 */
fun conjuntos03() {
    val conjunto = setOf(6, 1, 4)
    val conjuntoPotencia = mutableSetOf<Set<Int>>()
    conjuntoPotencia.add(emptySet())
    for (elemento in conjunto) {
        val nuevosSubconjuntos = mutableSetOf<Set<Int>>()
        for (subconjunto in conjuntoPotencia) {
            nuevosSubconjuntos.add(subconjunto + elemento)
        }
        conjuntoPotencia.addAll(nuevosSubconjuntos)
    }
    println(conjuntoPotencia)
}


/**
 * Dadas las siguientes listas:
 *
 * frutas1 = ["manzana", "pera", "naranja", "plátano", "uva"]
 * frutas2 = ["manzana", "pera", "durazno", "sandía", "uva"]
 * Crea conjuntos a partir de estas listas y nómbralos set_frutas1 y set_frutas2.
 * Encuentra las frutas que están en ambas listas y guárdalas en un nuevo conjunto
 * llamado frutas_comunes.
 * Encuentra las frutas que están en frutas1 pero no en frutas2 y guárdalas en un
 * conjunto llamado frutas_solo_en_frutas1.
 * Encuentra las frutas que están en frutas2 pero no en frutas1 y guárdalas en un
 * conjunto llamado frutas_solo_en_frutas2.
 */
fun conjuntos04() {
    val frutas1 = setOf("manzana", "pera", "naranja", "plátano", "uva")
    val frutas2 = setOf("manzana", "pera", "durazno", "sandía", "uva")

    val frutas_comunes = frutas1.intersect(frutas2)
    val frutas_solo_en_frutas1 = frutas1.subtract(frutas2)
    val frutas_solo_en_frutas2 = frutas2.subtract(frutas1)

    println("Frutas comunes: $frutas_comunes")
    println("Frutas solo en frutas1: $frutas_solo_en_frutas1")
    println("Frutas solo en frutas2: $frutas_solo_en_frutas2")
}


/**
 * Dado el conjunto de números enteros:
 *
 * numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 * Crea un conjunto pares que contenga los números pares del conjunto numeros.
 * Crea un conjunto multiplos_de_tres que contenga los números que son múltiplos
 * de tres del conjunto numeros.
 * Encuentra la intersección entre los conjuntos pares y multiplos_de_tres y
 * guárdala en un conjunto llamado pares_y_multiplos_de_tres.
 */
fun conjuntos05() {
    val numeros = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val pares = numeros.filter { it % 2 == 0 }.toSet()
    val multiplosDeTres = numeros.filter { it % 3 == 0 }.toSet()
    val paresYMultiplosDeTres = pares.intersect(multiplosDeTres)
    println("Pares: $pares")
    println("Múltiplos de tres: $multiplosDeTres")
    println("Pares y múltiplos de tres: $paresYMultiplosDeTres")
}


/**
 * Dado el conjunto de letras:
 *
 * vocales = {'a', 'e', 'i', 'o', 'u'}
 * Crea un conjunto consonantes que contenga las letras del alfabeto que
 * no son vocales.
 * Crea un conjunto letras_comunes que contenga las letras que están tanto
 * en el conjunto vocales como en el conjunto consonantes.
 * Estos ejercicios te ayudarán a practicar y comprender mejor cómo trabajar
 * con conjuntos en Python. ¡Espero que te sean útiles! Si tienes alguna pregunta
 * o necesitas más ejercicios, no dudes en decírmelo.
 */
fun conjuntos06() {
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    val alfabeto = ('a'..'z').toSet()
    val consonantes = alfabeto - vocales
    val letras_comunes = vocales.intersect(consonantes)

    println("Vocales: $vocales")
    println("Consonantes: $consonantes")
    println("Letras comunes: $letras_comunes")
}




