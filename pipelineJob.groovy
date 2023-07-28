pipelineJob('entity-management-service-') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/YashwanthRachepalli/entity-management-service.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}