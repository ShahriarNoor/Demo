/*String input="aabbcc"
def reducingDuplicates(String input){
    def currentInput=input
    if (currentInput.length() < 2) {
        return
    }
    def j=0
    for (int i = 0; i < currentInput.length(); i++){
        if (currentInput [j] != currentInput [i] ) {
            j++
            currentInput
            currentInput[j] ==currentInput[i]

        }
    }
}
println(reducingDuplicates(input))*/

def superReducedstring(String input){
    for(int i=0;i < input.length();i++){
        def previousString=input[i-1]
        def currentString=input[i]
        if(previousString == currentString){
            input = input.substring(0, i - 1) + input.substring(i + 1)
            i = 0
        }

    }
    return input
}
println(superReducedstring("naanddeeeffra"))