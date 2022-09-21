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