https://www.hackerrank.com/challenges/alternating-characters/problem
def inputString= System.in.newReader().readLine()
def getAlterCharacters(String inputString){
    int count=0
    for (int i=0; i<inputString.length()-1;i++){
        if(inputString.charAt(i)==inputString.charAt(i+1)){
            count++
        }
    }
    return count
}
println(getAlterCharacters(inputString))