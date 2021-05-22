pipeline{
    agent any
    stages{
        stage('Clone'){
            steps{
                sh 'git checkout $BRANCH_NAME'
                         
            }
        }
        stage('Build'){
            steps{
                sh 'C:\Users\charu.sharma\Desktop\CICD Demo\apache-maven-3.8.1-bin\apache-maven-3.8.1\bin\mvn clean install'
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
