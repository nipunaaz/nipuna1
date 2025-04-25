pipeline {
    agent any
    stages {
        stage ('SCM checkout') {
            steps {
                git branch: 'Master', url: 'https://github.com/nipunavja/nipuna_project.git'
            }
        }
        stage ('archiving artifacts') {
            steps {
                archiveArtifacts '**/*.html'
            }
        }
    }
}