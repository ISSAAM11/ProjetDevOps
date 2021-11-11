pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                git branch: "main"
                bat "https://github.com/ISSAAM11/ProjetDevOps.git"
            }
        }
/*      stage("Build") {
            steps {
                bat "mvn -version"
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
