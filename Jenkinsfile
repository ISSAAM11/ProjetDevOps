pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                bat "https://github.com/ISSAAM11/ProjetDevOps.git"
                bat "mvn -version"
            }
        }
/*      stage("Build") {
            steps {
                bat "mvn clean"
            }
        }   */
    }
    post{
        always{
            emailext body: 'build success', subject: 'build success', to: 'issam.benhassine@esprit.tn'
         }
        
     }
}
