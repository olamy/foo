pipeline {
    agent any
    stages{
        stage("echo"){
            steps {             
              echo "foo"
              sh "echo something"  
              withMaven(maven: 'maven-3.6.1', jdk: 'jdk8'){
                sh "mvn clean verify"    
              }
              jiraComment issueKey:'TEST-112', body:"pipeline step comment"  
            }  
        }   
    }
}
