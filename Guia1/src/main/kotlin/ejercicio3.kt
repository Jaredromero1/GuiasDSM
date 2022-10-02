fun main (args: Array<String>){
    //Cree un programa que pida 2 números al usuario y determine si el primer número es múltiplo del segundo.

    print("Ingresar primer valor: ")
    val a = readln().toInt()

    print("Ingresar segundo valor: ")
    val b = readln().toInt()

    if(a%b == 0){
        print("$a es multiplo de $b")
    }else{
        print("$a no es multiplo de $b")
    }
}