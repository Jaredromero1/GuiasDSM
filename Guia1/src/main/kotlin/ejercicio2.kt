fun main(args: Array<String>) {
    //Cree un programa que pida 3 números al usuario y
    //determine cuál de ellos es el menor

    print("Ingresar primer valor: ")
    val n1 = readln().toInt()

    print("Ingresar segundo valor: ")
    val n2 = readln().toInt()

    print("Ingresar tercer valor: ")
    val n3 = readln().toInt()


    if (n1 < n2 && n1 < n3) {
        print("El menor es: $n1")
    }
    if (n2 < n1 && n2 < n3) {
        print("El menor es: $n2")
    }
    if (n3 < n1 && n3 < n2) {
        print("El menor es: $n3")
    }

}