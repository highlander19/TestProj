pipeline {
  agent any
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
  }
}
