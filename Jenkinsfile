pipeline {
    agent any
    tools{
        maven 'maven:3.6'
    }
    stages{
        stage('Build Maven'){
            steps{
                git branch: 'main', credentialsId: 'TEST_CICD', url: 'https://github.com/anhteo21499/CICD_DOCKER.git'
                sh "mvn clean install"
            }
        }
    }
}