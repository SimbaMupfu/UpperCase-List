fun main(args: Array<String>) {
    val names = UpperCasedList()
    names.add("Simba")
    names.add("Clever")
    println("Names in upper case: $names")
    names[0] = "Sims"
    names[1] = "Hustles"
    println("Updated names in upper case: $names")
}
