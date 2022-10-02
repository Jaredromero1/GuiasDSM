fun main (args: Array<String>){
    //Hacer un programa que posea dentro de él 2 menús

    print(" ----- Menú -----\n\n")
    println("a) conversion de colones a dólares")
    println("b) conversion de millas a kms")
    println("c) conversion de grados Celsius a grados Fahrenheit")
    println("d) segundo menu")
    println("e) fin de menu\n")

    print("Seleccione una opcion (a..e): ")
    val valor = readln().toString()

    when{
        valor == "a" -> {
            print("\n--- Conversion de colones a dolares ---")
        }
        valor == "b" -> {
            print("\n--- Conversion de millas a kms ---")
        }
        valor == "c" -> {
            print("\n--- Convertir grados Celsius a Fahrenheit ---")
        }
        valor == "d" -> {
            print(" -----   SUBMENÚ -----\n\n")
            println("1) si es positivo o negativo")
            println("2) área de un triangulo")
            println("3) fin submenu\n")

            print("Seleccione una opcion (1..3): ")
            val subvalor = readln().toInt()

            when{
                subvalor == 1 ->{
                    print("\n --- Verificar si el numero es positivo o negativo ---")
                }
                subvalor == 2 ->{
                    print("\n--- Encontrar el área de un triangulo ---")
                }
                subvalor == 3 ->{
                    print("\n*** FIN DEL SUBMENÚ ***")
                }
            }
        }
        valor == "e" -> {
            print("\n *** FIN DE MENÚ ***")
        }
    }

}