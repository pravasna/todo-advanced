binaryRepository {
	url = 'http://localhost:8081/artifactory'
	username = 'admin'
	password = 'password'
	name = 'libs-release-local'
}

environments {
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