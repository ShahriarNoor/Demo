def uppercase=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
def lowercase = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
def digit=['0','1','2','3','4','5','6','7','8','9']
def spchar=['!','@','#','$','%','^','&','*']
def input='**'

def doesPasswordContain(List alphlist, String input) {
    def currentcount
    def doescontain = false
    def characterCountMap = [:]
    for (int i = 0; i < alphlist.size(); i++) {
         def currentchar = alphlist[i]
        characterCountMap.putAt(currentchar, 0)
    }
    //return characterCountMap
    for (int i = 0; i < input.length(); i++) {
        //if (characterCountMap[input[i]] == null) {
       // }
            currentcount = characterCountMap[input[i]]
            //currentcount++
            //characterCountMap[input[i]] = currentcount
        if(currentcount!=null)
        {
                doescontain = true
                return doescontain

        }
                return doescontain
    }

}
println(doesPasswordContain(uppercase,input))
println(doesPasswordContain(lowercase,input))
println(doesPasswordContain(digit,input))
println(doesPasswordContain(spchar,input))
