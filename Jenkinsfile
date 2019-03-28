pipeline {
    agent any
    stages{
        stage("echo"){
            steps {             
              echo "foo"
              sh "echo foo"  
              jiraComment issueKey:'TEST-112', comment:"pipeline step comment"  
            }  
        }   
    }
}
