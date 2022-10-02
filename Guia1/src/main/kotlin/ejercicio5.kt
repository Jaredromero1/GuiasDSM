fun main (args: Array<String>){
    //Crear un programa que tome dos números y diga si ambos son pares o impares.

    print("Ingresar primer valor: ")
    val x = readln().toInt()
    print("Ingresar segundo valor: ")
    val y = readln().toInt()

    if(x % 2 == 0 && y % 2 == 0){
        print("Los numeros $x y $y son pares")
    }
    else if(x % 2 != 0 && y % 2 == 0){
        print("El numero $x es impar y el numero $y es par")
    }
    else if(x % 2 == 0 && y % 2 != 0){
        print("El numero $x es par y el numero $y es impar")
    }
    else{
        print("Los numeros $x y $y son impares")
    }
}