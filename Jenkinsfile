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
                echo 'Subiendo la imagen Docker al repositorio'
                sh 'docker push vestapirena/arr-model:latest'
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
