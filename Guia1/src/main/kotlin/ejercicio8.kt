fun main (args: Array<String>){

    print("------ Ingresar su fecha de cumpleaños  ------\n")
    print("Ingrese dia: ")
    val dia = readln().toInt()
    print("Ingrese mes: ")
    val mes = readln().toInt()
    print("Ingrese año: ")
    val anio = readln().toInt()

    print("\n------ Ingresar fecha actual ------\n")
    print("Ingrese dia: ")
    val dia_act = readln().toInt()
    print("Ingrese mes: ")
    val mes_act = readln().toInt()
    print("Ingrese año: ")
    val anio_act = readln().toInt()

    var edad = anio_act - anio
    val edadM = mes_act - mes
    val edadD = dia_act - dia

    if(mes > mes_act){
         edad = (edad - 1)
    }
    else if(mes == mes_act) {
        if (dia > dia_act) {
             edad = (edad - 1)
        }
    }

    print("\nTu edad actual es: $edad años, $edadM meses y $edadD dias")

}

