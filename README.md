# Excel Demo App

This application demonstrate how to render excel report in an ActFramework.

## Quick start

To start in dev mode:

```bash
cd /path/to/a/app
mvn clean compile exec:exec
```

To start in prod mode:

```bash
cd /path/to/a/app
mvn clean package
cd target/dist
unzip *.zip
./start
```

Once you started you can navigate browser to `http://localhost:5460`, there
 you should be able to see the home page of the application:
 
![image](https://user-images.githubusercontent.com/216930/65922729-9ec4cb00-e429-11e9-8f92-c888958fd083.png)


