fun main (args: Array<String>){
    //Crear un programa que muestre un menú donde las opciones sean “Equilátero”, “Isósceles” y
    //“Escaleno”, pida una opción y calcule el perímetro del triángulo seleccionado.

    println(" --> Calcular perimetro del triangulo <--")
    println("\n1- Equilátero")
    println("2- Isósceles")
    println("3- Escaleno")
    print("Ingrese digito: ")
    val seleccion = readln().toInt()

    when {
        seleccion == 1 -> {
            print("\n *** Calcular perimetro del Equilátero ***\n")
            print("Ingresar el lado: ")
            val lado1 = readln().toDouble()
            val perEqui = 3 * lado1
            print("\nEl perimetro del Equilátero es: $perEqui")
        }

        seleccion == 2 -> {
            print("\n *** Calcular perimetro del Isósceles ***\n")
            print("Ingresar el lado: ")
            val lado1 = readln().toDouble()
            print("Ingresar base: ")
            val base = readln().toDouble()
            val perIso = (2*lado1) + base
            print("\nEl perimetro del Isósceles es: $perIso")
        }

        seleccion == 3 -> {
            print("\n *** Calcular perimetro del Rectángulo ***\n")
            print("Ingresar el lado 1: ")
            val lado1 = readln().toDouble()
            print("Ingresar el lado 2: ")
            val lado2 = readln().toDouble()
            print("Ingresar el lado 3: ")
            val lado3 = readln().toDouble()
            val perRec = lado1 + lado2 + lado3
            print("\nEl perimetro del Rectángulo es: $perRec")
        }
        else -> {
            println("Numero fuera de rango")
        }
    }

}