pipeline {
    agent any
    stages{
        stage("echo"){
            parallel {
                stage('jdk8'){
                    steps{
                        mavenBuild('jdk8')
                    }
                }
                stage('jdk11'){
                    steps{
                        mavenBuild('jdk11')
                    }
                }

//            steps {
//              echo "foo"
//              sh "echo something"
//              withMaven(maven: 'maven-3.6.1', jdk: 'jdk8'){
//                sh "mvn clean verify -Dmaven.test.failure.ignore=true"
//              }
//                junit testResults: '**/target/surefire-reports/*.xml,**/target/invoker-reports/TEST*.xml'
////                junitFlakyResultArchiver()
//                junitFlakyTestDataPublisher()
              //jiraComment issueKey:'TEST-112', body:"pipeline step comment"  
//              withCredentials([usernameColonPassword(credentialsId: 'github', variable: 'pwd')]) {
//                echo "pwd $pwd"
//                sh "echo $pwd > foo.txt"
//                  writeFile file:'foo.txt' , text:"$pwd"
//                sh "cat foo.txt"
//                  sh "curl http://localhost:8080/jenkins/$pwd"
//
//              }
            }  
        }   
    }
    post {
        always {
            junitFlakyResultArchiver()
            junitFlakyTestDataPublisher()
        }
    }
}

def mavenBuild(jdk) {
    withMaven(maven: 'maven-3.6.1',
            jdk: "$jdk",
            publisherStrategy: 'EXPLICIT',
            options: [junitPublisher(disabled: false),mavenLinkerPublisher(disabled: false),pipelineGraphPublisher(disabled: false)],){
        sh "mvn clean verify -Dmaven.test.failure.ignore=true"
    }
}
