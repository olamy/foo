pipeline {
    agent any
    stages{
        stage("echo"){
            steps {     
              checkout changelog: false, poll: false,scm: [$class: 'GitSCM']
              echo "foo"
              sh "echo something"  
              //withMaven(maven: 'maven-3.6.1', jdk: 'jdk8'){
              //  sh "mvn clean verify"    
              //}
              //jiraComment issueKey:'TEST-112', body:"pipeline step comment"  
              withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'USERPASS')]) {
                echo "pwd $USERPASS"
//                sh "echo $pwd > foo.txt"
                  writeFile file:'foo.txt' , text:"$USERPASS"
                sh "cat foo.txt"  
                  sh "curl http://localhost:8080/jenkins/$pwd"
                    sh 'echo $USERPASS > out2.txt'
                    archiveArtifacts artifacts: '*.txt'                
              }                
            }  
        }   
    }
}
