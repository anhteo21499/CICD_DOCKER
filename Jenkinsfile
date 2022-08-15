pipeline {
    agent any
    tools{
        maven 'maven:3.6'
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
                def customImage = docker.build("CICD_SP:${env.BUILD_ID}")

            }
        }
    }
}