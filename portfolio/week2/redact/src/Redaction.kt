// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string


fun redact(document: String, reducted_text: String, character_used: Char = 'X'){
    var doc = StringBuilder()
    val red_text = reducted_text
    val char_used = character_used
    var masked = ""

    for(n in doc.split(" ")){
        if (n == red_text){
            character_used.toString().repeat(red_text.length)
            doc.append(" ${masked}")
        }
        else{
            doc.append(" ${n}")
        }
    }
    return doc.toString()

}