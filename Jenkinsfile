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
                sh 'cp $HOME/.jenkins/workspace/$JOB_NAME/target/jenkins-demo-0.0.1-SNAPSHOT $HOME/.jenkins/workspace/$JOB_NAME/'
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
		    archiveArtifacts artifacts: 'jenkins-demo-0.0.1-SNAPSHOT', followSymlinks: false
	    }
    	}
    }
}
