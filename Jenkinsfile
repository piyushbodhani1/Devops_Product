pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building for DEV'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing for SIT'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying for DEV to SIT'
            }
        }
    }
}
