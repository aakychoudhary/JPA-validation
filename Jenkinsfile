pipeline {
    agent any

    tools {
        jdk 'jdk-21'
        maven 'maven-3.9.1'
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
