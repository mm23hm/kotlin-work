// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
// Haseeb Mudasar
// Student ID: 201712687

fun redact(document: String, reducted_text: String, character_used: Char = 'X'): String{
    return document.replace(
        reducted_text, // replaces every time reducted_text is found
        character_used.toString().repeat(reducted_text.length)) // repeats the character_used as many time as the reducted_text length
}