pipeline{
    agent any
    stages{
        stage('Clone'){
            steps{
                sh '''
                git clone https://github.com/CharuSharma18/jenkins-demo.git
                cd jenkins-demo
                git checkout $BRANCH_NAME
                '''
                
            }
        }
        stage('Build'){
            steps{
                sh '''
                cd jenkins-demo
                mvn clean install
                '''
            }
        }
        stage('Deploy'){
            steps{
                sh 'java -jar target/*.jar &'
            }
        }
    }
}
