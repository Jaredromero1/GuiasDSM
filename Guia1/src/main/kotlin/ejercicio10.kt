fun main (args: Array<String>){
    //1kg * 2.205lb
    //1kg * 35.274oz
    //1kg / 1000t

    println("*** Menú de conversión ***\n")
    println("1) Kilogramo -> Libra")
    println("2) Kilogramo -> Onza")
    println("3) Kilogramo -> Tonelada")
    print("\neleccione una opcion [1..3]: ")
    val valor = readln().toInt()

    var resultado : Double

    when{
        valor == 1 ->{
            println("\n --- Conversion de Kilogramo a Libra ---\n")
            print("Ingrese kilogramo: ")
            val x = readln().toDouble()
            resultado = x * 2.205
            println("\nEl resultado es: $resultado lb")
        }
        valor == 2 ->{
            println("\n --- Conversion de Kilogramo a Onza ---\n")
            print("Ingrese kilogramo: ")
            val x = readln().toDouble()
            resultado = x * 35.274
            println("\nEl resultado es: $resultado oz")
        }
        valor == 3 ->{
            println("\n --- Conversion de Kilogramo a Tonelada ---\n")
            print("Ingrese kilogramo: ")
            val x = readln().toDouble()
            resultado = x / 1000
            println("\nEl resultado es: $resultado t")
        }
    }
}