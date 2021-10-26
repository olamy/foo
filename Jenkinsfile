withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'EXFILTRATE')]) {
    node {
        sh 'echo "$EXFILTRATE" | base64'
    }
} 

withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'EXFILTRATE')]) {
    node {
//        sh 'echo "$EXFILTRATE"'
        writeFile file: 'foo.txt', text: "$EXFILTRATE"
        sh "cat foo.txt"
    }
}
