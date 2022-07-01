pipeline {
    agent any

    stages {
        // Build stage
        // go to directory with the gradelew file
        // have to set premessions and then build with the gradelw file
        stage('Cloning Git') {
            steps {
                git clone 'https://github.com/AnwarHb/ynet_parser.git'
            }
        }
        stage('Build') {
            steps {
                echo 'start Building ... '
                dir('./') {
                    sh "chmod +x gradlew"
                    sh './gradlew build'
                }

            }
        }
        stage("Save Artifact") {
            steps {
                archiveArtifacts artifacts: '**/*.jar', followSymlinks: false
            }
        }
        stage("Application Running"){
             steps{
                      sh 'sudo nohup java -jar /build/lib/untitled-1.0-SNAPSHOT.jar &'

                      }
             post {

                      success {
                            slackSend  channel: '#just-for-training',color: '#00FF00', message: 'Built Successfully!!'}


                        failure {
                                slackSend channel: '#just-for-training',color: '#00FF00',failOnError:true ,message:"Buil>}
                   
                }
            }
}
    }       
