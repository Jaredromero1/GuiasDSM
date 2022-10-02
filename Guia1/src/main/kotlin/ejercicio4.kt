fun main (args: Array<String>){
    //Crear un programa que pida tres números e indicar si el tercero es
    //igual a la suma del primero y el segundo.

    print("Ingrese primer valor: ")
    val a = readln().toInt()
    print("Ingrese primer valor: ")
    val b = readln().toInt()
    print("Ingrese primer valor: ")
    val c = readln().toInt()

    val sum = a + b

    if(sum == c){
        print("El valor $c es igual a la suma del valor $a y $b")
    }else{
        print("El valor $c no es igual a la suma del valor $a y $b")
    }
}