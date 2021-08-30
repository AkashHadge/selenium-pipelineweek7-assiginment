node {
	stage ('SCM checkout'){
		git "https://github.com/AkashHadge/selenium-pipelineweek7-assiginment"
		}
	stage ('Build'){
    	dir("comtest") {
	   bat "mvn clean install"
       }
	}
    stage ('test') {
    	bat "java -jar comtest/target/com.test-1.0-SNAPSHOT.jar"
    }
}
