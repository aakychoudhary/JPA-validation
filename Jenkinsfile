pipeline {
    agent any

    tools {
        jdk 'JDK-21'
        maven 'Maven-3.9.1'
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                mvn 'clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                mvn 'test'
            }
        }
    }
}
