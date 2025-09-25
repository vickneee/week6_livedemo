pipeline {
    agent any
    tools {
        maven 'Maven3'
    }

    stages {
        stage ('Checking') {
            steps {
                git branch: 'main', url: 'https://github.com/vickneee/week6_livedemo.git'
            }

        }

        stage ('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
              steps {
                     sh 'mvn test'
              }
        }
        stage('Code Coverage') {
              steps {
                     sh 'mvn jacoco:report'
              }
        }
        stage('Publish Test Results') {
             steps {
                  junit '**/target/surefire-reports/*.xml'
             }
        }
        stage('Publish Coverage Report') {
              steps {
                    jacoco()
              }
        }


    }

}