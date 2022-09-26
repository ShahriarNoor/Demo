//https://www.hackerrank.com/challenges/mars-exploration/problem?isFullScreen=true
def inputString= System.in.newReader().readLine()
def getChangedWord(String inputString){
    int counter = 0
    for(int i= 0; i< inputString.length(); i +=3){
        if(inputString[i] !='S'){
            counter ++
        }
        if(inputString[i+1] != 'O'){
            counter ++
        }
        if(inputString[i+2] != 'S'){
            counter ++
        }
    }
    return counter


}
 println(getChangedWord(inputString))