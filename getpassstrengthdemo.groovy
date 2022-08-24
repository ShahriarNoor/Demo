def maplower =[:]
def mapupper=[:]
def mapdigit=[:]
def mapspchar=[:]
def uppercase=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
def lowercase = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
def digit=['0','1','2','3','4','5','6','7','8','9']
def spchar=['!','@','#','$','%','^','&','*']
def createmap(lowercase,maplower){

    for(int i=0;i<lowercase.size();i++){
        def currentchar=lowercase[i]

        maplower.putAt(currentchar,0)
    }
    return maplower
}
println (createmap(lowercase,maplower))
println (createmap(uppercase,mapupper))
println (createmap(digit,mapdigit))
println (createmap(spchar,mapspchar))


def maplower1=createmap(lowercase,maplower)
def mapupper1=createmap(uppercase,mapupper)
def mapdigit1=createmap(digit,mapdigit)
def mapspchar1=createmap(spchar,mapspchar)
def input = 'AAAAAAA'
def getstrength(maplower1) {
    def testcontain = false
    //input = 'AAaa12@#'

    for (int i = 0; i < input.length(); i++) {
        if (maplower1[input[i]] == null) {
        }
        else {
            def currentcount = maplower1[input[i]]

            currentcount++
            maplower1[input[i]] = currentcount
            if (currentcount != null) {
                testcontain = true
            }
        }
    }
    return testcontain
}

def x=  getstrength(maplower1)
def y=getstrength(mapupper1)
def z=  getstrength(mapdigit1)
def a=  getstrength(mapspchar1)


