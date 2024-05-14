package map.project

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactory")
@SpringBootApplication
class MapApplication

fun main() {
    SpringApplication.run(MapApplication::class.java)
}
