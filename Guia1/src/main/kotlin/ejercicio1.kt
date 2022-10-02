fun main(args: Array<String>) {
   //Cree un programa que pida 3 números al usuario y
    //determine cuál de ellos es el mayor

    print("Ingresar primer valor: ")
    val n1 = readln().toInt()

    print("Ingresar segundo valor: ")
    val n2 = readln().toInt()

    print("Ingresar tercer valor: ")
    val n3 = readln().toInt()

    if(n1>n2){
        if(n1>n3){
            print("El mayor es: $n1")
        }else{
            print("El mayor es: $n3")
        }
    }else if(n2 > n3){
        print("El mayor es: $n2")
    }else{
        print("El mayor es: $n3")
    }
}