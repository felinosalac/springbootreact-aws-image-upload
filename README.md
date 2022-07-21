Reference:
https://www.youtube.com/watch?v=i-hoSg8iRG0

#Create github repository without initializing it
https://github.com/felinosalac/springbootreact-aws-image-upload.git

#Generate the project using Spring Initializr, download it in local machine
https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.7.1&packaging=jar&jvmVersion=1.8&groupId=com.felinosalac&artifactId=springbootreact-aws-image-upload&name=springbootreact-aws-image-upload&description=Demo%20project%20for%20Spring%20Boot%20and%20React&packageName=com.felinosalac.springbootreact-aws-image-upload&dependencies=web

#local machine, go to the folder of the downloaded zip file then execute the commands below
git init
git remote add origin https://github.com/felinosalac/springbootreact-aws-image-upload.git
git branch -M 'main'
git add .
git commit -m 'initial commit'
git push origin 'main'


#Amazon AWS Access Key
Login to Amazon AWS Console
Go to Security Credentials (it is under your name, top right side)
Go to Access keys (access key ID and secret access key) section
Generate an access key by clicking the "Create New Access Key" button
You will get the message that your access key has been created successfully.

    "Your access key (access key ID and secret access key) has been created successfully.
    Download your key file now, which contains your new access key ID and secret access key. If you do not download the key file now, you will not be able to retrieve your secret access key again.

    To help protect your security, store your secret access key securely and do not share it."

Save the credentials for later use.

#Amazon S3 Client
Go to S2 services and create a new bucket, this new bucket will be used to store the images.

#Saving Files to S3 bucket

#User Profile Model

#Create in-memory database

#API & Service Layers
