pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo "Compiling Factorial.java and Testfactorial.java"
                bat 'javac Factorial.java Testfactorial.java'
            }
        }

        stage('Test') {
            steps {
                echo "Running Test Cases"
                bat 'java Testfactorial'
            }
        }

        stage('Run Program') {
            steps {
                echo "Running Factorial Program"
                bat 'java Factorial'
            }
        }

        stage('Package JAR') {
            steps {
                echo "Packaging into JAR"
                bat 'jar cfm Factorial.jar manifest.txt Factorial.class'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'Factorial.jar'
            }
        }
    }

    post {
        success {
            echo 'Build, Test, Run, and JAR creation successful – artifact ready!'
        }
        failure {
            echo 'Build failed. Please check logs.'
        }
    }
}
