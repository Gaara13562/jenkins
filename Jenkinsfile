pipeline {
    agent any
    stages {
        stage('编译') {
	        agent { 
		        docker { 
		            image 'maven:3-alpine'
		            args '-v /root/.m2:/root/.m2' 
		        }
		    }
            steps { 
            	sh 'echo 编译开始...' 
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('构建') { 
            steps {
            	sh 'echo 构建镜像开始...' 
                sh 'docker build -t $JOB_NAME:$BUILD_ID /repository' 
            }
        }
        stage('分发') { 
            steps {
            	sh 'echo 分发镜像开始...' 
                sh 'echo 理论上应该将镜像上传到仓库' 
            }
        }
        stage('部署') { 
            steps {
            	sh 'echo 部署开始...' 
                sh 'echo docker run -d --rm -P $JOB_NAME:$BUILD_ID > /repository/bootstrap.sh' 
            }
        }
    }
}