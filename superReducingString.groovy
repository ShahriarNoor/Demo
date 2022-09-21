def superReducedstring(String input){
    for(int i=1;i < input.length();i++){
        def previousString=input[i-1]
        def currentString=input[i]
        if(previousString == currentString){
            input = input.substring(0, i - 1) + input.substring(i + 1)
            i =0
        }
            if (input.length()==0)
            {
                println("Empty String")
            }

    }
    return input
}
println(superReducedstring("abba"))