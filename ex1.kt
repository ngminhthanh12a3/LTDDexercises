/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
var handShakeString = arrayOf("\"wink\"", "\"double blink\"", "\"close your eyes\"", "\"jump\"")
fun SecretHandshake(num: Int)
{
    val StringArray:MutableList<String> = mutableListOf()
    for (x in 0..3) {
    	if(num and (0x1 shl x) != 0)
        {
            StringArray.add(handShakeString[x])
        }
        	
    }
    print("\nNumber ${num}: ")
    if(num and (0x1 shl 4) != 0)
     	println(StringArray.reversed())
    else
    	println(StringArray)
}

fun main() {
    SecretHandshake(3)
    SecretHandshake(19)
}