import java.util.*



fun main(args: Array<String>) {
   var input = Scanner(System.`in`)

    var n1: Float =0F
    var n2: Float = 0F
    println("coloque a nota 1")
    n1 = Integer.valueOf(readLine()).toFloat()
    println("coloque nota 2 ")
    n2 = Integer.valueOf(readLine()).toFloat()

    var result : Float = (n1 + n2)/2

    println(" média é :" + result)
        println("..........................................")

    println("Escreva a palavra que deseja saber se é Pali")
    var palavra = input.next()

    var tam : Int = palavra.length-1

    var aux: Int = 0
    var msg: String = "é palindromo"


    while(aux < tam)
    {
        if(palavra[aux] != palavra[tam-aux])
        {
            msg = "errou"
            break
        }
        aux++
    }
    println(msg)





}