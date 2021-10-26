withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'VALUEBEER')]) {
    node {
        sh 'echo "$VALUEBEER" | base64'
    }
} 

withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'VALUEBEER')]) {
    node {
        sh 'echo "$VALUEBEER" >> bar.txt'
        writeFile file: 'foo.txt', text: "$VALUEBEER"
        sh "cat foo.txt"
        sh "cat bar.txt"        
    }
}
