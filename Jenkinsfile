pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                bat "https://github.com/ISSAAM11/ProjetDevOps.git"
                bat "mvn -version"
            }
        }
/*        stage('Hello') {
            steps {
                bat "mvn clean install"
            }
        }*/
    }
    post{
        always{
            emailext body: 'build success', subject: 'build success', to: 'issam.benhassine@esprit.tn'
         }
    }
}
