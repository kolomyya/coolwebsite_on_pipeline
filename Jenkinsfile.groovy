pipeline {
    agent any
    stages{
        stage("Git Clone"){
            steps{
                git 'git@github.com:kolomyya/coolwebsite_on_pipeline.git'
            }
        }
        stage ("Copy file to web" ){
            steps{
                sh "cp -f index.html /var/www/html/index.html"
            }
        }
        stage("Test"){
            steps{
                sh "echo Test"
            }
        }
    }
}