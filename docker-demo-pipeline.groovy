pipelineJob('nodejs pipeline dsl') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/juyeonkim97/docker-demo.git')
          }
          branch('*/master')
          scriptPath('misc/Jenkinsfile')
        }
      }
      lightweight()
    }
  }
}