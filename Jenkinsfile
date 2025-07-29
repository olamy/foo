pipeline {
  agent any
  stages {
    stage('Message') {
      steps {
        echo 'it works well'
        sh 'ls -lrt'
        sh "mvn clean test-compile -B"
      }
    }

    stage('yup') {
      steps {
        echo 'yup'
      }
    }

  }
}
