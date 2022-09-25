//https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
def getCamelCaseWord(String input){
        def counter=1
    for(def i=0;i<input.length();i++){
        if(input[i]>='A' && input[i]<='Z'){
            counter=counter+1
        }
    }
    return counter
}
println(getCamelCaseWord("cornerSeatTakenQuicklyAndSomeOneSeatedAlready"))