//https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true
def inputString= System.in.newReader().readLine()
def getChangedWord(String inputString){
    int counter = 0
    for(int i= 0; i< inputString.length(); i++) {
        if (i % 3 == 0 || i % 3 == 2) {
            if (inputString[i] != 'S') {
                counter++
            }
        }
       else { if (inputString[i] != 'O') {
            counter++
        }
    }
    }
    return counter


}
println(getChangedWord(inputString))
