pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Compilando el proyecto con Maven'
                sh 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Construyendo la imagen Docker'
                sh 'docker build -t tuusuario/arr-model:latest .'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Desplegando la aplicación'
                // Aquí puedes agregar comandos para ejecutar o copiar el JAR
            }
        }
    }
}
