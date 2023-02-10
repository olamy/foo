pipeline {
  agent any
  stages {
    stage('Message') {
      steps {
        echo 'it works well'
        sh 'ls -lrt'
        sleep(time:3,unit:"MINUTES")
      }
    }

    stage('yup') {
      steps {
        echo 'yup'
      }
    }

  }
}
