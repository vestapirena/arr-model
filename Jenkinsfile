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

        stage('Docker Push') {
            steps {
                script {
                    // Establecer el contexto predeterminado
                    sh 'docker context use default'

                    // Subir la imagen al repositorio
                    docker.withRegistry('https://index.docker.io/v1/', '60417d2f-7614-42bb-993d-dcb27c229d7b') {
                        sh 'docker push vestapirena/arr-model:latest'
                    }
                }
            }
        }


        stage('Deploy') {
            steps {
                echo 'Desplegando la aplicación'
                // Agrega aquí el script para tu despliegue (por ejemplo, a Kubernetes o OpenShift)
            }
        }
    }
}
