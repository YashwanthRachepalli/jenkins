pipelineJob('ems-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/YashwanthRachepalli/entity-management-service.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}