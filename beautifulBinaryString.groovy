https://www.hackerrank.com/challenges/beautiful-binary-string/problem
def n=System.in.newReader().readLine()
def b= System.in.newReader().readLine()
def getBeautifulString(String b){
    int count=0
    for(int i=0; i<b.length();i++){
        if(b[i]=='0' && b[i+1]=='1' && b[i+2]=='0'){
        count++
            i=i+2
        }
    }
    return count
}
println(getBeautifulString(b))

