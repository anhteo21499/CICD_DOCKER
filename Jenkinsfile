pipeline {
    agent any
    tools{
        maven 'maven_3.5'
    }
    stages{
        stage('Build Maven'){
            steps{
                git branch: 'main', url: 'https://github.com/anhteo21499/CICD_DOCKER.git',
                                credentialsId: 'TEST_CICD'

            }
        }

        stage('Build docker'){
            steps{
                sh 'docker build -t docker_ci_cd .'
            }
        }
    }
}