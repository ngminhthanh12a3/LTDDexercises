/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun TriangleInequality(a: Int, b: Int, c: Int)
{
    if(a > 0 && b > 0 && c > 0)
        if((a < b + c) && (b < a + c) && (c < a + b))
            println("The lengths you gave seem perfect - they make a triangle, alright!")
        else
            println("The lengths you gave don't make a triangle")
    else
    	println("Invalid length")
}

fun main() {
    TriangleInequality(1,2,2)
    TriangleInequality(1,2,3)
    TriangleInequality(1,2,-2)
}