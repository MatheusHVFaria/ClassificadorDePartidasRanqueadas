var wins: Int = 0
var defeats:Int = 0
var result: Int = 0;
var level: String = "";

fun main(args: Array<String>){
    receiveValues()
    calcResult(wins, defeats)
    selectLevel()
    println("O Herói tem de saldo de vitórias " + result + " está no nivel de " + level);

}

fun receiveValues(){
    println("Quantas Vitórias o Herói Possui ? ")
    wins = readln().toInt()

    println("Quantas Derrotas o Herói Possui ? ")
    defeats = readln().toInt()
}

fun calcResult(W:Int, D:Int): Int{
    return W -D
}

fun selectLevel()
{
    level = when{
        result <= 10 -> "Ferro"
        result >= 11 && result <= 20 -> "Bronze"
        result >= 21 && result <= 50 -> "Prata"
        result >= 51 && result <= 80 -> "Ouro"
        result >= 81 && result <= 90 -> "Diamante"
        result >= 91 && result <= 100 -> "Lendário"
        else -> "Imortal"
    }
}