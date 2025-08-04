pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'building'
            }
        }
      
stage('Compile'){
	steps{
		bat 'javac Factorial.java Testfactorial.java'
	}
     }

stage('Test'){
	steps{
		bat ' java Testfactorial'
	}
     }
stage('Run'){
	steps{
		bat 'java Factorial'
	}
     }	
stage('Package JAR'){
steps{
bat 'jar cfm factorial.jar manifest.txt Factorial.class'
}
}
stage('Archive JAR'){
	steps{
		archiveArtifacts artifacts: 'factorial.jar'
}
}
}
post{
	succeess{
echo 'Build,test,run and JAR files created succesfully and artifact is ready'


}
failure{
echo 'failed'
}
}
}
