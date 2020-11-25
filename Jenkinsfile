// scripted
//properties([parameters([string(defaultValue: 'Hello', description: 'How should I greet the world?', name: 'Greeting')])]
//echo "tagName " + params.tagName

pipeline {
    agent any
//    parameters {
//        string(name: 'Greeting', defaultValue: 'Hello', description: 'How should I greet the world?')
//    }
    stages {
        stage('Example') {
            steps {
                echo "${params.Greeting} World!"
            }
        }
    }
}
