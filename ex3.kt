/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun _isLetterOrDigit(c:Char): Boolean
{
    return (c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')
}

fun WordCount(phrase: String)
{
    var i:Int = 0
    val WordCountMap: MutableMap<String, Int>? = mutableMapOf()
    while(i < phrase.length - 1)
    {
        if(_isLetterOrDigit(phrase[i].toChar()))
        {
            // Flow: Start to detect word
            var j = i + 1
        	while(!phrase[j].equals(0))
            	if(_isLetterOrDigit(phrase[j].toChar()) or (phrase[j].equals('\'') && _isLetterOrDigit(phrase[j+1].toChar())))
            		j++
            	else
            		break
            
//             println(phrase.slice(i..(j - 1)))
			var word = phrase.slice(i..(j - 1)).lowercase()
            if(WordCountMap?.containsKey(word) ?: false)
            {
                var numN = WordCountMap?.get(word) ?: 0
                numN++
                WordCountMap?.set(word, numN)
            }
            else
                WordCountMap?.set(word, 1)
            
            i += (j-i)
        
        }
        	
        else
            i++
    }
    println(WordCountMap)
}

fun main() {
    WordCount("\"That's the password: 'PASSWORD 123'!\", cried the Special Agent.\nSo I fled.")
}