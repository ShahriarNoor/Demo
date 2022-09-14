def configurableList=[
        [criteria : "uppercase",
         characterList : ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'],
         score: 20,
        type: "characterChecker"],

        [criteria : "lowercase",
         characterList : ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'],
         score: 20,
         type: "characterChecker"],

        [criteria : "digit",
         characterList : ['0','1','2','3','4','5','6','7','8','9'],
         score: 20,
         type: "characterChecker"],

        [criteria : "specialCharacter",
         characterList : ['!','@','#','$','%','^','&','*'],
         score: 30,
         type : "characterChecker"],
        [criteria : "lengthChecker",
         minLength: 8,
         score: 10,
         characterList: [],
         type : "lengthChecker"]
]
def inputPassword="123"
def strengthScore=0


def getPasswordStrength(List characterList, String inputPassword, int score) {

    for (int i = 0; i < inputPassword.length(); i++) {

        if (characterList.contains(inputPassword[i])) {
            return score
        }
    }
    return 0

}


def getLengthScore(  int minlength ,inputPassword, int lengthScore){

    if(inputPassword.size() < minlength) {

        lengthScore= 0
    }
return lengthScore
}


configurableList.each { configurableMap ->

    if (configurableMap.type == "characterChecker") {

        strengthScore = strengthScore + getPasswordStrength(configurableMap.characterList, inputPassword, configurableMap.score)
    }

    else if (configurableMap.type == "lengthChecker") {

        strengthScore=   strengthScore+   getLengthScore( configurableMap.minLength, inputPassword, configurableMap.score)

    }
}
println("Your Password is " +strengthScore+ "% Strong")
