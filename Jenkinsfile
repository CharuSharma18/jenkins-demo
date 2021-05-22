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
	 stage('Archive'){
	    steps{
		    archiveArtifacts artifacts: 'target/jenkins-demo-0.0.1-SNAPSHOT', followSymlinks: false
	    }
    	}
    }
}
