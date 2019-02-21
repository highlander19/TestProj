pipeline {
  agent any
  options {
    ansiColor('xterm')
  }
  tools {
    maven 'Maven_3.0.5'
  }
  stages {
    stage('Build') {
      steps {
        echo 'Building..'
        sh 'mvn clean compile package'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing..'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying....'
      }
    }
    stage('Archive') {
      steps {
        archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
      }
    }
  }
}
