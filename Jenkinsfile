pipeline {
    agent any
    tools{
        maven 'maven_3.5'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/anhteo21499/CICD_DOCKER.git']]])
                sh 'mvn clean install'
            }
        }
    }
}