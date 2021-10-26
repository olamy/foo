//withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'VALUEBEER')]) {
//    node {
//        sh 'echo "$VALUEBEER" | base64'
//    }
//} 

withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'VALUEFOO')]) {
  // do evil stuff
}

withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'VALUEBEER')]) {
    //node {
        sh 'echo "$VALUEBEER" >> bar.txt'
        writeFile file: 'foo.txt', text: "$VALUEBEER"
        sh "cat foo.txt"
        sh "cat bar.txt"        
    //}
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
