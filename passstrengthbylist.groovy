    def uppercase=['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']
    def lowercase = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    def digit=['0','1','2','3','4','5','6','7','8','9']
    def specialcharacters=['!','@','#','$','%','^','&','*']
    def inputPassword='AAAvvbbssdg123@#$%'
    def countOfPasswordLength=10
    def scoreOfUppercase=20
    def scoreOflowercase=20
    def scoreOfDigit=20
    def scoreOfSpecialcharecters=30

    def doesPasswordContain(List characterlist, String inputPassword, int score) {

        for (int i = 0; i < inputPassword.length(); i++) {

            if (characterlist.contains(inputPassword[i])) {
                return score
            }

        }
        return 0
    }

    if(inputPassword.length()<8){
        countOfPasswordLength=0
    }

    def countForUpperCase=doesPasswordContain(uppercase, inputPassword, scoreOfUppercase)
    def countForLowerCase=doesPasswordContain(lowercase, inputPassword, scoreOflowercase)
    def countForDigit=doesPasswordContain(digit, inputPassword, scoreOfDigit)
    def countForSpecialCharacters=doesPasswordContain(specialcharacters, inputPassword, scoreOfSpecialcharecters)
    def passwordStrengthInPercentage= countForUpperCase+countForLowerCase+countForDigit+countForSpecialCharacters+countOfPasswordLength
    println("Your Password Is " +passwordStrengthInPercentage+ "% Strong")