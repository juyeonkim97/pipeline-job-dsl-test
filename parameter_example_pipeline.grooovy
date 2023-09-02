pipelineJob('parameter example pipeline') {
  parameters {
    stringParam('MESSAGE', 'Hello World!!!', '')
  }
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/juyeonkim97/docker-demo.git')
          }
          branch('*/master')
          scriptPath('misc/JenkinsfileWithParam')
        }
      }
      lightweight()
    }
  }
}