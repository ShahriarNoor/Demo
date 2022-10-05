def inputString= System.in.newReader().readLine()
def findingCaesarCipher(String inputString,int k){
    String answer=" "
    k=k%26
    for (int i=0; i<inputString.length(); i++){
         Character ch= inputString.charAt(i)
        if(Character.isLetter(ch) ==true){
            int nxt_char=(ch+k)
            if(Character.isLowerCase(ch) && nxt_char>122)
            {
                answer +=(Character)(96+(k-(122-ch)))
            }
            else if(Character.isUpperCase(ch) && nxt_char>90)
            {
                answer +=(Character)(64+(k-(90-ch)))
            }
            else
                answer +=(char)nxt_char
        }
        else
            answer +=ch
    }
    return answer

}
println(findingCaesarCipher(inputString,4))









