class UpperCasedList: ArrayList<String>() {

    override fun add(element: String): Boolean {
        return super.add(element.toUpperCase())
    }

    override fun add(index: Int, element: String) {
        super.add(index, element.toUpperCase())
    }

    override fun addAll(elements: Collection<String>): Boolean {
        return super.addAll(elements.map { it.toUpperCase() })
    }

    override fun addAll(index: Int, elements: Collection<String>): Boolean {
        return super.addAll(index, elements.map { it.toUpperCase() })
    }

    override fun set(index: Int, element: String): String {
        return super.set(index, element.toUpperCase())
    }
}