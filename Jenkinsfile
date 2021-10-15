pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh './mvnw package'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/**/*.xml'
        }
    }
}