pipeline {
    agent any

    tools {
        jdk 'jdk-21'
        maven 'apache-maven-3.9.1'
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
                script {
                    echo "Starting Maven build (tests skipped)..."

                    def status = bat(
                        script: 'mvn clean package -DskipTests',
                        returnStatus: true
                    )

                    if (status == 0) {
                        echo "✅ BUILD SUCCESSFUL"
                    } else {
                        echo "❌ BUILD FAILED"
                        echo "👉 Check compilation errors or dependency issues above"
                        error("Stopping pipeline due to build failure")
                    }
                }
            }
        }
    }
}
