fun main (args: Array<String>){
    //Desarrollar un programa en kotlin que acepte las fechas escritas de modo usual y las visualice como números.

    print("Ingresar dia: ")
    val day = readln().toInt()

    print("Ingresar mes: ")
    val month = readln().toString()

    print("Ingresar año: ")
    val year = readln().toInt()

    if (day < 1 || day > 31 ){
        print("Dia fuera de rango")
    }

    when {
        month == "enero" -> {
            print("Su fecha es: $day/01/$year")
        }
        month == "febrero" -> {
            print("Su fecha es: $day/02/$year")
        }
        month == "marzo" -> {
            print("Su fecha es: $day/03/$year")
        }
        month == "abril" -> {
            print("Su fecha es: $day/04/$year")
        }
        month == "mayo" -> {
            print("Su fecha es: $day/05/$year")
        }
        month == "junio" -> {
            print("Su fecha es: $day/06/$year")
        }
        month == "julio" -> {
            print("Su fecha es: $day/07/$year")
        }
        month == "agosto" -> {
            print("Su fecha es: $day/08/$year")
        }
        month == "septiembre" -> {
            print("Su fecha es: $day/09/$year")
        }
        month == "octubre" -> {
            print("Su fecha es: $day/10/$year")
        }
        month == "noviembre" -> {
            print("Su fecha es: $day/11/$year")
        }
        month == "diciembre" -> {
            print("Su fecha es: $day/12/$year")
        }
        else -> {
            println("Mes no existente")
        }
    }



}