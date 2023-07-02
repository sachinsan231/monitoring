"# monitoring" 

	1. Basic changes
		1.1 docker build -t demoapp:v1 .
		1.2 docker compose up
	2. on minikube - commands:
		2.1 minikube -p minikube docker-env --shell powershell | Invoke-Expression
		2.2 docker ps
		2.3	docker build -t demoapp:v1 -f Dockerfile .
		2.4 kubectl run demoapp --image=demoapp:v1 --image-pull-policy=Never
		2.5 kubectl get pods
		2.6 kubectl port-forward --address 0.0.0.0 pod/demoapp 8080:8082
		2.7 helm install prometheus bitnami/kube-prometheus
		2.8 kubectl port-forward --namespace default svc/prometheus-kube-prometheus-alertmanager 9090:9093
		2.9 kubectl port-forward service/demoapp 8080:8082
			kubectl port-forward service/prometheus-kube-prometheus-prometheus 9090:9090