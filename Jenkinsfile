pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh 'mvn clean install'
			}
			post {
				success {
					echo 'Now Archiving...'
					archiveArtifacts artifacts: '**/target/*.war'
				}
			}
		}
		stage('Staging deployment') {
			steps {
				 build job: 'Fort_milligrade_Deploy_STAGE'
			}
		}
	}
}
