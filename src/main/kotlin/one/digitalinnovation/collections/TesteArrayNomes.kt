package one.digitalinnovation.collections

fun main() {
    val nomes = Array(3) {" "}
    nomes[0] = "Hugo"
    nomes[1] = "Miguel"
    nomes[2] = "Agnes"

    for (nome in nomes){
        println(nome)
    }
    println("---------")
    nomes.sort()
    nomes.forEach { println(it)  }

    println("---------")
    val nomes2 = arrayOf("Miguel", "Hugo", "Agnes")

    nomes2.sort()
    nomes2.forEach { println(it)  }

}