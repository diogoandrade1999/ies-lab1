Maven goal --> Cada fase é uma sequência de objetivos e cada objetivo é responsável por uma tarefa específica.

O Maven é baseado no conceito central de um Build Life Cycles . Dentro de cada Ciclo de Vida da Construção, existem Fases de Construção , e dentro de cada Fase de Construção, existem Objetivos de Construção .

Podemos executar uma fase de construção ou meta de construção. Ao executar uma fase de construção, executamos todos os objetivos de construção nessa fase de construção. Metas de construção são atribuídas a uma ou mais fases de construção. Também podemos executar uma meta de construção diretamente.

Existem três principais Ciclos de Vida de Construção integrados :
	padrão
	limpar \ limpo
	local
------------------------------------------------
https://github.com/diogoandrade1999/ies-lab1
 \n$ git init
 \n$ git remote add origin git@gitlab.com:diogoandrade1999/ies-lab1.git
 \n$ git add .
 \n$ git commit -m "Initial commit"
 \n$ git push -u origin master
-------------------------------------------------
## List Docker CLI commands
docker
docker container --help

## Display Docker version and info
docker --version
docker version
docker info

## Execute Docker image
docker run hello-world

## List Docker images
docker image ls

## List Docker containers (running, all, all in quiet mode)
docker container ls
docker container ls --all
docker container ls -aq

--------------------------------
pip install -r requirements.txt
docker build --tag=friendlyhello .
docker image ls
docker run -p 4000:80 friendlyhello
-> go to: http://localhost:4000 ou curl http://localhost:4000
docker run -d -p 4000:80 friendlyhello
docker container stop ab95efab5eff
docker login
docker tag friendlyhello gordon/get-started:part2
docker image ls
docker push diogoandrade1999/get-started:part2
docker run -p 4000:80 diogoandrade1999/get-started:part2
-> go to: http://localhost:4000 ou curl http://localhost:4000

docker volume create portainer_data
docker run -d -p 8000:8000 -p 9000:9000 -v /var/run/docker.sock:/var/run/docker.sock -v portainer_data:/data portainer/portainer
curl -L https://downloads.portainer.io/portainer-agent-stack.yml -o portainer-agent-stack.yml
docker container ls --all

docker container ls --all

