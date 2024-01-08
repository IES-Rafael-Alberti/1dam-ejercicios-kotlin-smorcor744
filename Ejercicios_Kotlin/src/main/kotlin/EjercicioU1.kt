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
fun condicion02(){}
fun condicion03(){}
fun condicion06(){}
fun condicion08(){}
fun condicion10(){}
fun iterativa02(){}
fun iterativa04(){}
fun iterativa06(){}
fun iterativa07(){}
fun iterativa08(){}
fun iterativa13(){}
fun iterativa15(){}
fun iterativa18(){}
fun iterativa19(){}
fun iterativa25(){}
fun excepciones02(){}
fun excepciones03(){}
fun excepciones04(){}

fun listas04(){}
fun listas06(){}
fun listas08(){}
fun listas09(){}
fun listas10(){}
fun listas13(){}
fun diccionario03(){}
fun diccionario05(){}
fun diccionario06(){}
fun diccionario07(){}
fun diccionario08(){}
fun diccionario10(){}
fun diccionario11(){}
fun conjuntos01(){}
fun conjuntos02(){}
fun conjuntos03(){}
fun conjuntos04(){}
fun conjuntos05(){}
fun conjuntos06(){}



