#create github repository without initializing it
https://github.com/felinosalac/springbootreact-aws-image-upload.git

#generate the project using Spring Initializr, download it in local machine
https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.1&packaging=jar&jvmVersion=1.8&groupId=com.felinosalac&artifactId=springbootreact-aws-image-upload&name=springbootreact-aws-image-upload&description=Demo%20project%20for%20Spring%20Boot%20and%20React&packageName=com.felinosalac.springbootreact-aws-image-upload&dependencies=web

#local machine, go to the folder of the downloaded zip file then execute the commands below
git init
git remote add origin https://github.com/felinosalac/springbootreact-aws-image-upload.git
git branch -M 'main'
git add .
git commit -m 'initial commit'
git push origin 'main'
