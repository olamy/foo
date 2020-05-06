pipeline {
    agent any
    stages{
        stage("echo"){
            steps {     
              checkout changelog: false, poll: false,scm: [$class: 'GitSCM']
              echo "foo"              
            }  
      post {
        always {
          tckreporttojunit tckReportTxtPath: "${env.WORKSPACE}/JTReport/text/summary.txt", junitFolderPath: 'surefire-reports'
          junit testResults: '**/surefire-reports/*.xml'
          script{
            currentBuild.description = "Build branch foo"
          }
          archiveArtifacts artifacts: "surefire-reports/*.xml",allowEmptyArchive: true            
          archiveArtifacts artifacts: "JTReport/text/*.txt",allowEmptyArchive: true
          archiveArtifacts artifacts: "logs/*.*",allowEmptyArchive: true
          publishHTML([allowMissing: false, alwaysLinkToLastBuild: true, keepAll: true, reportDir: "${env.WORKSPACE}/JTReport/html", reportFiles: 'report.html', reportName: 'TCK Report', reportTitles: ''])
//          tckReportCopyResultsToParent()
        }
      }
        }   
    }
}
