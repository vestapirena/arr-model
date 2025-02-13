pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compilando el proyecto con Maven'
                sh 'mvn clean package'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Desplegando la aplicación'
                // Agrega aquí el script para tu despliegue (por ejemplo, copiar archivos, ejecutar comandos, etc.)
            }
        }
    }
}
