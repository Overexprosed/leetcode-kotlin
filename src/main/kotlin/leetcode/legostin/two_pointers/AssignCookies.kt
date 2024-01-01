package leetcode.legostin.two_pointers

/**
 * Накормить как можно больше детей.
 */
class AssignCookies {

    /**
     * @param children - жадность, минимальный размер печеньки, которую примет ребенок.
     * @param cookies - размер печенек.
     */
    fun findContentChildren(children: IntArray, cookies: IntArray): Int {
        children.sort()
        cookies.sort()

        var child = 0
        var cookie = 0
        while (child < children.size && cookie < cookies.size) {
            if (cookies[cookie] >= children[child]) {
                child++
            }
            cookie++
        }
        return child
    }
}
