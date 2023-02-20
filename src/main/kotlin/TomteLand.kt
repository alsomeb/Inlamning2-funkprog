import model.Tomte

class TomteLand {
    // Dessa blir inkapslade automatiskt, så gör ej Kotlin Private
    val tomten = Tomte("Tomten")
    val glader = Tomte("Glader")
    val butter = Tomte("Butter")
    val troger = Tomte("Tröger")
    val trotter = Tomte("Trötter")
    val blyger = Tomte("Blyger")
    val radjuret = Tomte("Rådjuret")
    val nyckelpigan = Tomte("Nyckelpigan")
    val haren = Tomte("Haren")
    val raven = Tomte("Räven")
    val skumtomten = Tomte("Skumtomten")
    val dammratan = Tomte("Dammråttan")
    val grasuggan = Tomte("Gråsuggan")
    val myran = Tomte("Myran")
    val bladlusen = Tomte("Bladlusen")

    // Detta block Kommer att köras om objectet "newas" upp
    init {
        // Tomten
        tomten.inChargeOf.addAll(listOf(glader, butter))

        // Glader
        glader.inChargeOf.addAll(listOf(troger, trotter, blyger))

        // Butter
        butter.inChargeOf.addAll(listOf(radjuret, nyckelpigan, haren, raven))

        // Trötter
        trotter.inChargeOf.addAll(listOf(skumtomten))

        // Skumtomten
        skumtomten.inChargeOf.addAll(listOf(dammratan))

        // Räven
        raven.inChargeOf.addAll(listOf(grasuggan, myran))

        // Myran
        myran.inChargeOf.addAll(listOf(bladlusen))
    }

    // Tom lista "newas" upp i metodhuvud med = mutableListOf(), behöver egentligen inte lägga in den när vi kallar metoden
    // Den återanvänds när vi kallar metoden rekursivt för att bygga på listan med resultat
    fun getUnderlings(tomte: Tomte, list: MutableList<String> = mutableListOf()): MutableList<String> {
        // Listan som anges i param lever vidare och fylls på vid nästkommande anrop

        // Stopvilkor == Kommer snurra sålänge det finns en tomte att hämta (egentligen som 2 loopar där yttre är forloopen som går ut automatiskt, samt inre loop är rekursion)
        // Först kolla Ravens lista: Gråsuggan namn läggs in i total listan
        // Gråsuggans lista: Inget, går vidare Till Myran och lägger in Myrans namn
        // Slutligen kommer till Myrans lista och lägger till Bladlusens namn i listan
        for(elf in tomte.inChargeOf) {
            list.add(elf.name)
            getUnderlings(elf, list)
        }

        return list
    }
}

/*
fun main() {
    val tomteLandet = TomteLand()
    println(tomteLandet.getUnderlings(tomteLandet.raven))
}
 */




