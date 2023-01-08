/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun WordCount(phrase: String)
{
    var i:Int = 0
    val WordCountMap: MutableMap<String, Int>? = mutableMapOf()
    while(i < phrase.length - 1)
    {
		if(phrase[i].isLetterOrDigit())        
        {
            // Flow: Start to detect word
            var j = i + 1
        	while(!phrase[j].equals(0))
            	if(phrase[j].isLetterOrDigit() or (phrase[j].equals('\'') && phrase[j+1].isLetterOrDigit()))
            		j++
            	else
            		break
            
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