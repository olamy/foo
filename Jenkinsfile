//withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'VALUEBEER')]) {
//    node {
//        sh 'echo "$VALUEBEER" | base64'
//    }
//} 


withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'VALUEBEER'),
                 usernameColonPassword(credentialsId: 'global-id', variable: 'VALUEGLOBAL')]) {
    node {
        sh 'echo "$VALUEBEER" >> bar.txt'
        sh 'echo "$VALUEBEER" >> /Users/olamy/dev/sources/jenkins/blueocean-plugin/beer.txt'
        writeFile file: 'foo.txt', text: "$VALUEBEER"
        sh "cat foo.txt"
        sh "cat bar.txt"
        
        sh 'echo "$VALUEGLOBAL" >> global-bar.txt'
        sh 'echo "$VALUEGLOBAL" >> /Users/olamy/dev/sources/jenkins/blueocean-plugin/global-beer.txt'
        writeFile file: 'global-foo.txt', text: "$VALUEGLOBAL"
        sh "cat global-foo.txt"
        sh "cat global-bar.txt"        
        
    }
}

//pipeline {
//    agent any
//    environment {
//        EXAMPLE_CREDS = credentials('github')
//    }
//    stages {
//        stage('Example') {
//            steps {
//                sh("curl -u -v foo:${EXAMPLE_CREDS_PSW} https://example.com/")
//            }
//        }
//    }
//}
