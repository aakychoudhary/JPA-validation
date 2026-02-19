pipeline {
    agent any

    tools {
        jdk 'JDK-21'
        maven 'Maven-3.9.1'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/aakychoudhary/JPA-validation.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
    }
}
