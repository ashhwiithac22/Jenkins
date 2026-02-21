pipeline //defines the entire pipeline{
    agent any //execution environment
    
    stages //container for all stages{
        stage('Checkout') //gets code from github{
            steps {
                echo 'Cloning repository...'
                checkout scm //clones repository
            }
        }
        
        stage('Build')//compiles java code { 
            steps {
                echo 'Building application...'
                sh 'mvn clean compile' //shell command
            }
        }
        
        stage('Test')//Ru unit tests{
            steps {
                echo 'Running unit tests...'
                sh 'mvn test'
            }
        }
        
        stage('Package') //creates JAR file{
            steps {
                echo 'Packaging application...'
                sh 'mvn package'
            }
        }
    }
    
 post {
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
