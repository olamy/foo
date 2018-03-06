node("linux") {
    //git "https://github.com/olamy/foo.git"
    checkout scm
    withMaven(
          maven: 'maven3') {
        sh "mvn -V -B clean verify"
    }    
    
}  
