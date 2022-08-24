def uppercase=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
def lowercase = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
def digit=['0','1','2','3','4','5','6','7','8','9']
def specialcharacters=['!','@','#','$','%','^','&','*']
def inputPassword='123456678'
def CountOfPasswordLength=10
def scoreOfUppercase=20
def scoreOflowercase=20
def scoreOfDigit=20
def scoreOfSpecialcharecters=30

def doesPasswordContain(List characterlist, String inputPassword,int score) {

    def characterMap = [:]
    for (int i = 0; i < characterlist.size(); i++) {
         def currentchar = characterlist[i]
        characterMap.putAt(currentchar, 0)
    }
    for (int i = 0; i < inputPassword.length(); i++) {

        if (characterMap[inputPassword[i]] != null) {
            return score
        }

    }
    return 0
}
println(doesPasswordContain(uppercase,inputPassword,scoreOfUppercase))
println(doesPasswordContain(lowercase,inputPassword,scoreOflowercase))
println(doesPasswordContain(digit,inputPassword,scoreOfDigit))
println(doesPasswordContain(specialcharacters,inputPassword,scoreOfSpecialcharecters))


if(inputPassword.length()<8){
    CountOfPasswordLength=0
}

def countForUpperCase=doesPasswordContain(uppercase,inputPassword,scoreOfUppercase)
def countForLowerCase=doesPasswordContain(lowercase,inputPassword,scoreOflowercase)
def countForDigit=doesPasswordContain(digit,inputPassword,scoreOfDigit)
def countForSpecialCharacters=doesPasswordContain(specialcharacters,inputPassword,scoreOfSpecialcharecters)
def passwordStrengthInPercentage= countForUpperCase+countForLowerCase+countForDigit+countForSpecialCharacters+CountOfPasswordLength
println("Your Password Is " +passwordStrengthInPercentage+ "% Strong")