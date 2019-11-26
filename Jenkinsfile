pipeline {
    agent any
    stages{
        stage("echo"){
            steps {     
              checkout changelog: false, poll: false,scm: [$class: 'GitSCM']
              echo "foo"              
            }  
        }   
    }
}
