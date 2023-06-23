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
				sh build job: 'Fort_milligrade_Deploy_STAGE'
			}
		}
	}
}
