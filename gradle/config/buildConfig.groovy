binaryRepository {
	url = 'http://localhost:8081/artifactory' 
	username = 'admin'
	password = 'password'	
}

envs {
	test {
		server {
			hostname = 'localhost'
			port = 8099
			context = 'todo'
			username = 'manager'
			password = 'manager'
		}
	}
}