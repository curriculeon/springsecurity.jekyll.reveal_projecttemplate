#----------- Jekyll Build ------------
cd front-end
bundle exec jekyll build



#----------- Maven Build ------------
cd ..
mvn package


#----------- Docker Destroy ------------
containerName="springsecurity-jekyll"
# stop all running containers
docker container stop $containerName

# delete all stopped containers
docker container rm $containerName

# delete all images whose containers are stopped
docker system prune -a --force


#----------- Docker Build ------------
# build new image
docker image build -t $containerName .

# run new container from image
docker container run --name $containerName-container -p 8081:8080 -d $containerName