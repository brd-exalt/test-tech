# test-tech

## back
backend code (Java) + multistage Dockerfile

## front
frontend code (JS React) + Dockerfile

## helm
Helm Chart, Templates and Values

## runner
Helm gitlab runner values, gitlab runner in kube cluster

## gitlab-ci
Tag with semver is used to trigger pipeline (example : 0.0.1)  
Build Front with kaniko, Build Back with kaniko and Deploy cluster with Helm with Front & Back

CICD Variables in Gitlab :  
- DOCKER_AUTH (File)
- KUBECONFIG (File)
- SPRING_POSTGRES_PASSWORD
- SPRING_POSTGRES_URL
- SPRING_POSTGRES_USERNAME