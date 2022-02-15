import javafx.scene.paint.Stop
import java.util.*

fun main(args: Array<String>) {
    println("1 - media: ")
    println("2 - palíndroma: ")
    println("3 - Sair: ")

    var op = readLine()!!.toInt()
    if (op == 1){
        var n1: Float = 0F
        var n2: Float = 0F
        println("coloque a nota 1")
        n1 = Integer.valueOf(readLine()).toFloat()
        println("coloque nota 2 ")
        n2 = Integer.valueOf(readLine()).toFloat()

        var result: Float = (n1 + n2) / 2

        println(" média é :" + result)
    }

    else if (op == 2)
    {
        var input = Scanner(System.`in`)
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

    if(op==3){

    }



}