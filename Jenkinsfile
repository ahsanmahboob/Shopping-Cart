node{
  stage('SCM Checkout'){
  git 'https://github.com/ahsanmahboob/Shopping-Cart'
  }
  stage('Compile-Package'){
  sh 'mvn clean install'
  }
}
