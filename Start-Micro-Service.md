# Projeto-Ta-Dentro


Passo a passo para rodar o micro-serviço.	
	
	
	Usando docker você vai fazer o pull do banco de dados. Aqui estou usando mariaDB
	
	-> docker pull mariadb
	
	Subir seu container
	
	-> docker run -p 3306:3306 —name banco-local -e MYSQL_ROOT_PASSWORD=root -d mariadb
	
	Ao subir seu container, acesse pelo CLI do docker, irá abrir um terminal.
  
  ![Captura de Tela 2022-04-08 às 09 33 40](https://user-images.githubusercontent.com/77408554/162452749-706f3a68-ca75-42d2-932e-ea602b303d27.png)
	
	-> acesse o mariadb, ao acessar irá pedi a senha.
	
	mysql -u root -p -h localhost
  
  ![Captura de Tela 2022-04-08 às 11 09 53](https://user-images.githubusercontent.com/77408554/162453089-06961737-dc31-4664-805e-6a7c0504525b.png)

	
	SHOW DATABASES;
	
	CREATE DATABASE bancoLocal;
	
	Você precisará de alguma view para conectar o banco de dados.
	Como uso macbook aqui estou usando Sequel pro;
  
  ![Captura de Tela 2022-04-08 às 11 12 37](https://user-images.githubusercontent.com/77408554/162453539-0aa70d00-86e4-47c2-8359-ac42e3448cd0.png)

	
	Porta 3306
	Adicionamos o servidor padrão 127.0.0.1 ou localhost
	senha: root
	usuario: root
	
	Ao conectar pode subir o micro-serviço
	
	![Captura de Tela 2022-04-08 às 11 20 15](https://user-images.githubusercontent.com/77408554/162454884-391fc7c4-2711-41bb-9e43-78dd80a57ea8.png)

