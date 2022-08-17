pipeline {
  agent any
  tools {
    'org.jenkinsci.plugins.docker.commons.tools.DockerTool' 'docker:3.6'
  }

  stages {
    stage('foo') {
      steps {
        sh "docker version" // DOCKER_CERT_PATH is automatically picked up by the Docker client
      }
    }

    stage('pull git'){
        steps{
            git branch: 'main', credentialsId: 'TEST_CICD', url: 'https://github.com/anhteo21499/CICD_DOCKER.git'
            sh "mvn clean install"
        }
    }

    stage('build images') {
          steps {
            sh 'docker build -t demo1-0.0.1-SNAPSHOT .'
          }
    }

  }
}