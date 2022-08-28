def configurableList=[
        [criteria : "uppercase",
         characterList : ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'],
         score: 20],
        [criteria : "lowercase",
         characterList : ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'],
         score: 20],
        [criteria : "digit",
         characterList : ['0','1','2','3','4','5','6','7','8','9'], score: 30],
        [criteria : "specialCharacter",
         characterList : ['!','@','#','$','%','^','&','*'],
         score: 20]
]
def inputPassword="bbAAcc"
def strengthScore=0
def doesPasswordContain(List characterList, String inputPassword, int score) {

    for (int i = 0; i < inputPassword.length(); i++) {

        if (characterList.contains(inputPassword[i])) {
            return score
        }

    }
    return 0
}

configurableList.each { configurableMap ->
    strengthScore= strengthScore+  doesPasswordContain(configurableMap.characterList, inputPassword, configurableMap.score)

}
if(inputPassword.size()>=8){
    strengthScore=strengthScore+10
}
println("Your Password is " +strengthScore+ "% Strong")
