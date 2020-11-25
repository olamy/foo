// scripted
//properties([parameters([string(defaultValue: 'master', description: 'the tag name', name: 'tagName', trim: false)])]
//echo "tagName " + params.tagName

pipeline {
    agent any
    parameters {
        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
    }
    stages {
        stage('Example') {
            steps {
                echo "${params.Greeting} World!"
            }
        }
    }
}
