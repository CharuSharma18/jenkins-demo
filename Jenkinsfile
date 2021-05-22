pipeline{
    agent any
    tools {
        maven 'maven3.6.1'
     }
    stages{
        stage('Clone'){
            steps{
                sh 'git checkout $BRANCH_NAME'
                         
            }
        }
        stage('Build'){
            steps{
                sh 'mvn clean install'
                   }
        }
        stage('Deploy'){
            steps{
			 withEnv(['JENKINS_NODE_COOKIE=dontKillMe']) {
                sh 'java -jar target/*.jar &'
            }
			}
        }
    }
}
