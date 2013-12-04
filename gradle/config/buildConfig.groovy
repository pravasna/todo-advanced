binaryRepository {
	url = 'http://localhost:8081'
	username = 'todo'
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
	
	uat {
		server {
			hostname = 'localhost'
			port = 8199
			context = 'todo'
			username = 'manager'
			password = 'manager'
		}
	}
	
	production {
		server {
			hostname = 'localhost'
			port = 8299
			context = 'todo'
			username = 'manager'
			password = 'manager'
		}
	}
}