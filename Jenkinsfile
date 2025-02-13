pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compilando el proyecto con Maven'
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                echo 'Construyendo la imagen Docker'
                sh 'docker build -t vestapirena/arr-model:latest .'
            }
        }

        stage('Create ZIP Package') {
            steps {
                echo 'Empaquetando archivos en un ZIP'
                script {
                    sh '''
                        mkdir -p /c/sistemas/java/output
                        cp target/arr-model-1.0-SNAPSHOT.jar /c/sistemas/java/output/arr-model.jar
                        cp Dockerfile /c/sistemas/java/output/Dockerfile
                        echo "pipeline.version=1.0" > /c/sistemas/java/output/pipeline.properties
                        cd /c/sistemas/java/output
                        zip -r arr-model.zip arr-model.jar Dockerfile pipeline.properties
                    '''
                }
            }
        }

        stage('Docker Push') {
            steps {
                script {
                    sh 'docker context use default'
                    docker.withRegistry('https://index.docker.io/v1/', '60417d2f-7614-42bb-993d-dcb27c229d7b') {
                        sh 'docker push vestapirena/arr-model:latest'
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Desplegando la aplicación'
            }
        }
    }
}
