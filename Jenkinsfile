pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo "hi"
            }
        }
    }
    post{
        always{
            emailext body: 'build success', subject: 'build success', to: 'issam.benhassine@esprit.tn'
         }
    }
}
